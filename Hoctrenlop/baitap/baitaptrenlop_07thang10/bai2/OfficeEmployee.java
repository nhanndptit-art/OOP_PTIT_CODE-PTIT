package Hoctrenlop.baitap.baitaptrenlop_07thang10.bai2;


public class OfficeEmployee extends Employee implements EmailSender {

    public OfficeEmployee(String name) {
        super(name);
    }

    @Override
    public void sendEmail() {
        System.out.println(getName() + " đang gửi email nội bộ và cho đối tác.");
    }
}