package Hoctrenlop.baitap.interface_payment;

public class Payment {
    /**
     * InnerPayment
     */
    public interface InnerPayment {
        void pay(double amount);
        String name();
    }
    
}
