package LLDCarRentalSystem;

import LLDCarRentalSystem.Product.Vehicle;
import LLDCarRentalSystem.Product.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class VehicleInventoryManagement {

    List<Vehicle> vehicles;

    VehicleInventoryManagement(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles(VehicleType vehicleType) {
        //filtering
        List < Vehicle > availbleVehicles = new ArrayList<Vehicle>();
        for(Vehicle vehicle : vehicles){
            if(vehicle.getVehicleType() == vehicleType){
                availbleVehicles.add(vehicle);
            }
        }
        return availbleVehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
