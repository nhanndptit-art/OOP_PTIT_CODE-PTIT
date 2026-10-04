package Hoctrenlop.baitap.BangLuongNhanVien;

public class Employee {
    protected String id;
    protected String name;
    protected double baseSalary;

    public Employee (String id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double salary () {
        return baseSalary;
    }

    public void inThongTin() {
        System.out.println("Nhân viên " + name + "tổng Lương: " + baseSalary + "đ");
    }
    protected String formatMoney(double amount) {
        return String.format("%.0f", amount).replace(',', '.');
    }
}


