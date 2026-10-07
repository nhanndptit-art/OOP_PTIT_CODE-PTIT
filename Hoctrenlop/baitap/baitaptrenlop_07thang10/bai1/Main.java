package Hoctrenlop.baitap.baitaptrenlop_07thang10.bai1;


public class Main {
    public static void main(String[] args) {
        // Khởi tạo mảng Employee chứa các đối tượng thuộc cả 2 loại
        Employee[] employees = new Employee[4];
        
        employees[0] = new OfficeEmployee("Nguyễn Văn A", 30, 22);
        employees[1] = new TechnicalEmployee("Trần Thị B", 28, 160, 5.5);
        employees[2] = new OfficeEmployee("Lê Văn C", 25, 24);
        employees[3] = new TechnicalEmployee("Phạm Văn D", 35, 120, 8.0);

        
        for (Employee emp : employees) {
            System.out.println("Tên: " + emp.getName() + 
                               " | Tuổi: " + emp.getAge() + 
                               " | Lương: " + emp.calculateSalary());
        }
    }
}