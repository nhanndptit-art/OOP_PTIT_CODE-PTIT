package Hoctrenlop.baitap.BangLuongNhanVien;

public class FulltimeEmployee extends Employee {
    private double allowance;
    
    public FulltimeEmployee (String id, String name, double baseSalary, double allowance) {
        super(id, name, baseSalary);
        this.allowance = allowance;
    }
    
    @Override 
    public double salary () {
        return baseSalary + allowance;
    }

    @Override 
    public void inThongTin() {
        System.out.println("Nhân viên " + name 
        + " lương cơ bản: " + formatMoney(baseSalary) 
        + "+" + " phụ cấp: " + formatMoney(allowance) 
        + "= " + formatMoney(salary()));
    }

}