package Hoctrenlop.baitap.baitaptrenlop_07thang10.bai3;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo các đơn hàng với các phương thức thanh toán khác nhau
        Order order1 = new Order("An", 200000, new CreditCardPayment());
        Order order2 = new Order("Bình", 150000, new PayPalPayment());
        Order order3 = new Order("Chi", 100000, new CashPayment());
        
        // Cắm thêm phương thức MoMo mới hoàn toàn dễ dàng
        Order order4 = new Order("Dũng", 300000, new MoMoPayment());

        // Thực hiện thanh toán
        order1.checkout();
        order2.checkout();
        order3.checkout();
        order4.checkout();
    }
}
