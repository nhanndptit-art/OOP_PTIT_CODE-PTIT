package Hoctrenlop.baitap.baitaptrenlop_07thang10.bai3;

public class CashPayment extends PaymentMethod {
    public CashPayment() {
        super("Trực tiếp", "tiền mặt");
    }

    @Override
    public void pay(long amount) {
        System.out.println("Thanh toán " + formatAmount(amount) + " bằng " + name + ".");
    }
}