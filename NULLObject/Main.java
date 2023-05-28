package NULLObject;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicleObject("bike");
        printVehicleDetails(vehicle);
    }

    private static void printVehicleDetails(Vehicle vehicle){
        System.out.println(vehicle.getSeatCapacity());
        System.out.println(vehicle.getTankCapacity());
    }
}
