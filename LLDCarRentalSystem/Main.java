package LLDCarRentalSystem;

import LLDCarRentalSystem.Product.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {
        List<User> users = addUsers();
        List<Vehicle> vehicles = addVehicles();
        List<Store> stores = addStores(vehicles);

        VehicleRentalSystem rentalSystem = new VehicleRentalSystem(stores, users);

        User user = users.get(0);
        System.out.println("User Data : ");
        System.out.println(user.getUserId() + user.getUserName() + user.getDrivingLicense());

        Location location = new Location(403012, "Bangalore", "Karnataka", "India");
        System.out.println(location.getLocation());

        Store store = rentalSystem.getStore(location);

        List<Vehicle> storeVehicles = store.getVehicles(VehicleType.CAR);

        for(Vehicle vehicle : storeVehicles){
            System.out.println(vehicle.getVehicleID() + " \t " + vehicle.getVehicleNumber());
        }
        Location pickLocation = new Location(123123, "CNB", "UP", "India");
        Location dropLocation = new Location(121233, "BLR", "Karnataka", "India");
        
        Reservation reservation = store.createReservation(storeVehicles.get(0), users.get(0), pickLocation, dropLocation);
        System.out.println(reservation.reservationId);
        System.out.println(reservation.pickUpLocation.pincode);
        System.out.println(reservation.dropLocation.pincode);
        System.out.println(reservation.user);
        System.out.println(reservation.vehicle.getVehicleID());
        System.out.println(reservation.vehicle.getVehicleNumber());
        System.out.println(reservation.reservationStatus);
        System.out.println(reservation.reservationId);
        System.out.println(reservation.reservationType);

        Bill bill = new Bill(reservation);
        System.out.println(bill.totalBillAmount);
        System.out.println(bill.isBillPaid);


        Payment payment = new Payment();
        payment.payBill(bill);

        store.completeReservation(reservation.reservationId);
    }

    public static List<Vehicle> addVehicles(){

        List<Vehicle> vehicles = new ArrayList<>();

        Vehicle vehicle1 = new Car();
        vehicle1.setVehicleID(1);
        vehicle1.setVehicleNumber(123);
        vehicle1.setVehicleType(VehicleType.CAR);

        Vehicle vehicle2 = new Car();
        vehicle2.setVehicleID(2);
        vehicle2.setVehicleNumber(124);
        vehicle2.setVehicleType(VehicleType.CAR);

        Vehicle vehicle3 = new Bike();
        vehicle3.setVehicleID(3);
        vehicle3.setVehicleNumber(125);
        vehicle3.setVehicleType(VehicleType.BIKE);
        
        Vehicle vehicle4 = new Bike();
        vehicle4.setVehicleID(4);
        vehicle4.setVehicleNumber(126);
        vehicle4.setVehicleType(VehicleType.BIKE);


        vehicles.add(vehicle1);
        vehicles.add(vehicle2);
        vehicles.add(vehicle3);
        vehicles.add(vehicle4);

        return vehicles;
    }

    public static List<User> addUsers(){
        List<User> users = new ArrayList<>();
        
        User user1 = new User();
        user1.setUserId(1);
        user1.setUserName(11);
        user1.setDrivingLicense(12334);

        User user2 = new User();
        user1.setUserId(2);
        user1.setUserName(22);
        user1.setDrivingLicense(12335);
        
        User user3 = new User();
        user1.setUserId(3);
        user1.setUserName(33);
        user1.setDrivingLicense(12336);
        
        User user4 = new User();
        user1.setUserId(4);
        user1.setUserName(44);
        user1.setDrivingLicense(12337);


        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        return users;
    }

    public static List<Store> addStores(List<Vehicle> vehicles){

        List<Store> stores = new ArrayList<>();

        Store store1 = new Store();
        store1.storeId=1;
        store1.setVehicles(vehicles);

        stores.add(store1);
        return stores;
    }

}
