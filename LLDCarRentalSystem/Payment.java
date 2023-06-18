package LLDCarRentalSystem;

import java.util.Scanner;

public class Payment {
    PaymentMode paymentMode;
    PaymentDetails paymentDetails;

    Scanner sc = new Scanner(System.in);
    
    public void payBill(Bill bill) {
        PaymentDetails paymentDetails = new PaymentDetails(bill.totalBillAmount);
        selectPaymentMode(paymentDetails);
    }

    public void selectPaymentMode(PaymentDetails paymentDetails){
        System.out.println("Enter the Choice\n 1.Cash \n 2.Online");
        PaymentMode.getAllPaymentModes();
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Cash Mode chosen");
                paymentDetails.paymentMode = PaymentMode.CASH;
                paymentDetails.printPaymentDetails(paymentDetails);
                break;
            case 2:
                System.out.println("Online Mode Chose");
                paymentDetails.paymentMode = PaymentMode.ONLINE;
                paymentDetails.printPaymentDetails(paymentDetails);
                break;
            default:
                System.out.println("Please chose the correct paymnet Mode;");
        }
    }
}
