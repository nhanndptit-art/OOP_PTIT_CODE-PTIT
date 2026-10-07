package Hoctrenlop.baitap.baitaptrenlop_07thang10.bai2;

// Nhân viên kỹ thuật có chức năng gửi email và lập trình
public class TechnicalEmployee extends Employee implements EmailSender, Programmer {

    public TechnicalEmployee(String name) {
        super(name);
    }

    @Override
    public void sendEmail() {
        System.out.println(getName() + " đang gửi email báo cáo tiến độ kỹ thuật.");
    }

    @Override
    public void writeCode() {
        System.out.println(getName() + " đang lập trình và fix bug hệ thống.");
    }
}