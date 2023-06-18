package LLDCarRentalSystem;

import java.util.Date;

public class PaymentDetails {

    int paymentId;
    double amountPaid;
    Date dateOfPayment;
    boolean isRefundable;
    PaymentMode paymentMode;

    PaymentDetails(double amountPaid){
        this.amountPaid = amountPaid;
    }

    public void printPaymentDetails(PaymentDetails paymentDetails){
        System.out.println(paymentDetails.paymentId);
        System.out.println(paymentDetails.paymentMode);
        System.out.println(paymentDetails.amountPaid);
    }

}
