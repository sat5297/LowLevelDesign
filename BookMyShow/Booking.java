package BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Booking {
    Show show;
    List < Seat > bookedSeats = new ArrayList<>();
    Payment payment;

    public Show getShow(){
        return show;
    }
    
    public void setShow(Show show){
        this.show = show;
    }

    public Payment getPayment(){
        return payment;
    }

    public void setPayment(Payment payment){
        this.payment = payment;
    }

    public List < Seat > getSeats(){
        return bookedSeats;
    }

    public void setSeats(List < Seat > bookedSeats){
        this.bookedSeats = bookedSeats;
    }
}
