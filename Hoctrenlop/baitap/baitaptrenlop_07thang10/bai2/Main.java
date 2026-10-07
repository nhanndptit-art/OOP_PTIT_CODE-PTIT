package Hoctrenlop.baitap.baitaptrenlop_07thang10.bai2;

public class Main {
    public static void main(String[] args) {
        OfficeEmployee officeEmp = new OfficeEmployee("Nguyễn Văn A");
        TechnicalEmployee techEmp = new TechnicalEmployee("Trần Thị B");
        SalesEmployee salesEmp = new SalesEmployee("Lê Văn C");

        System.out.println("--- Chức năng của Nhân viên văn phòng ---");
        officeEmp.sendEmail();

        System.out.println("\n--- Chức năng của Nhân viên kỹ thuật ---");
        techEmp.sendEmail();
        techEmp.writeCode();

        System.out.println("\n--- Chức năng của Nhân viên bán hàng ---");
        salesEmp.sendEmail();
        salesEmp.sellProducts();
        
        // Đạt được mục tiêu: Nếu sau này có một "Nhân viên IT kiêm Bán hàng", 
        // bạn chỉ cần tạo class mới implements Programmer, Salesperson, EmailSender 
        // mà không cần phải sửa đổi lại bất kỳ class nào đã viết ở trên.
    }
}