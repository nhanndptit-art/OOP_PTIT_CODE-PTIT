package Hoctrenlop.ngay30thang9;


    // Lớp cha Employee chứa các thông tin và hành vi chung
abstract class Employee {
    protected String name;
    protected int age;
    protected double baseSalary;

    public Employee(String name, int age, double baseSalary) {
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
    }

    // Phương thức trừu tượng buộc các lớp con phải tự định nghĩa cách tính lương riêng
    public abstract double calculateSalary();

    public void showInfo() {
        System.out.printf("Họ tên: %-15s | Tuổi: %-3d | Lương cơ bản: %,.0f | Tổng lương: %,.0f%n",
                name, age, baseSalary, calculateSalary());
    }
}

// Lớp Giảng viên kế thừa từ Employee
class Lecturer extends Employee {
    private int teachingPeriods; // Số tiết dạy
    private double ratePerPeriod; // Đơn giá tiết

    public Lecturer(String name, int age, double baseSalary, int teachingPeriods, double ratePerPeriod) {
        super(name, age, baseSalary);
        this.teachingPeriods = teachingPeriods;
        this.ratePerPeriod = ratePerPeriod;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (teachingPeriods * ratePerPeriod);
    }
}

// Lớp Cán bộ hành chính kế thừa từ Employee
class AdminStaff extends Employee {
    private double positionAllowance; // Phụ cấp chức vụ

    public AdminStaff(String name, int age, double baseSalary, double positionAllowance) {
        super(name, age, baseSalary);
        this.positionAllowance = positionAllowance;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + positionAllowance;
    }
}

public class Main {
    public static void main(String[] args) {
        // Tạo mảng Employee[] chứa cả Giảng viên và Cán bộ hành chính
        Employee[] employees = new Employee[2];
        
        // Khởi tạo đối tượng cụ thể trong mảng
        employees[0] = new Lecturer("Nguyễn Văn A", 35, 10000000, 40, 150000);
        employees[1] = new AdminStaff("Trần Thị B", 28, 8000000, 2500000);

        // Chạy cùng một vòng lặp gọi calculateSalary() và in ra kết quả
        for (Employee emp : employees) {
            emp.showInfo();
            // Hoặc gọi trực tiếp: System.out.println(emp.calculateSalary());
        }
    }
}

