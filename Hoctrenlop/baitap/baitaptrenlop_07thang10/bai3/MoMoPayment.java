package Hoctrenlop.baitap.baitaptrenlop_07thang10.bai3;


public class MoMoPayment extends PaymentMethod {
    public MoMoPayment() {
        super("Không dùng tiền mặt", "MoMo");
    }

    @Override
    public void pay(long amount) {
        System.out.println("Thanh toán " + formatAmount(amount) + " qua " + name + ".");
    }
}