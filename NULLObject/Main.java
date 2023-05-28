package NULLObject;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = VehicleFactory.getVehicleObject("bike");
        printVehicleDetails(vehicle1);

        Vehicle vehicle2 = VehicleFactory.getVehicleObject("car");
        printVehicleDetails(vehicle2);
    }

    private static void printVehicleDetails(Vehicle vehicle){
        System.out.println(vehicle.getSeatCapacity());
        System.out.println(vehicle.getTankCapacity());
    }
}
