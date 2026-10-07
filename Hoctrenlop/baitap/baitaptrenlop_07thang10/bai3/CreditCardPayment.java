package Hoctrenlop.baitap.baitaptrenlop_07thang10.bai3;

public class CreditCardPayment extends PaymentMethod {
    public CreditCardPayment() {
        super("Không dùng tiền mặt", "thẻ tín dụng");
    }

    @Override
    public void pay(long amount) {
        System.out.println("Thanh toán " + formatAmount(amount) + " bằng " + name + ".");
    }
}