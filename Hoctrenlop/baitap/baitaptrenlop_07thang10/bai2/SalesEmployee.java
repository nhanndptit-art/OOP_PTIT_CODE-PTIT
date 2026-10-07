package Hoctrenlop.baitap.baitaptrenlop_07thang10.bai2;

// Nhân viên bán hàng có chức năng gửi email và bán hàng
public class SalesEmployee extends Employee implements EmailSender, Salesperson {

    public SalesEmployee(String name) {
        super(name);
    }

    @Override
    public void sendEmail() {
        System.out.println(getName() + " đang gửi email báo giá cho khách hàng.");
    }

    @Override
    public void sellProducts() {
        System.out.println(getName() + " đang tư vấn và chốt sale sản phẩm.");
    }
}