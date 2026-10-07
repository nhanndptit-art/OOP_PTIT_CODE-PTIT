package Hoctrenlop.baitap.baitaptrenlop_07thang10.bai3;

public class Order {
    private String customerName;
    private long amount;
    private PaymentMethod paymentMethod; // Tham chiếu đến interface/abstract class

    public Order(String customerName, long amount, PaymentMethod paymentMethod) {
        this.customerName = customerName;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public void checkout() {
        System.out.println("Khách hàng: " + customerName);
        // Nhờ tính đa hình, phương thức pay() tương ứng sẽ tự động được gọi
        paymentMethod.pay(amount);
        System.out.println(); // In dòng trống để ngăn cách giữa các khách hàng
    }
}