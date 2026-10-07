package Hoctrenlop.baitap.baitaptrenlop_07thang10.bai3;


public class PayPalPayment extends PaymentMethod {
    public PayPalPayment() {
        super("Không dùng tiền mặt", "PayPal");
    }

    @Override
    public void pay(long amount) {
        System.out.println("Thanh toán " + formatAmount(amount) + " qua " + name + ".");
    }
}