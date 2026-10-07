package Hoctrenlop.baitap.baitaptrenlop_07thang10.bai3;

public class Order {
    private String customerName;
    private long amount;
    private PaymentMethod paymentMethod;

    public Order(String customerName, long amount, PaymentMethod paymentMethod) {
        this.customerName = customerName;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public void checkout() {
        System.out.println("Khách hàng: " + customerName);
        
        paymentMethod.pay(amount);
        System.out.println(); 
    }
}