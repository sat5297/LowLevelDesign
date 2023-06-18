package LLDCarRentalSystem;

public class Location {

    String address;
    int pincode;
    String city;
    String state;
    String country;

    Location(int pincode, String city, String state, String country) {
        this.pincode = pincode;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    String getLocation(){
        return this.city + "\t" + this.state + "\t" + this.country +  "\t" + this.pincode;
    }
}
