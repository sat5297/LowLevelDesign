package LLDCarRentalSystem;

public enum PaymentMode {

    CASH,
    ONLINE;

    static public void getAllPaymentModes(){
        for(PaymentMode paymentMode : PaymentMode.values()){
            System.out.println(paymentMode);
        }
    }
}