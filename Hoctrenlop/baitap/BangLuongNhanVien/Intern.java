package Hoctrenlop.baitap.BangLuongNhanVien;

public class Intern extends Employee{
    private String school;


    //contructor
    public Intern (String id, String name, double baseSalary, String school) {
        super(id, name, baseSalary);
        this.school = school;
    }

    //getter
    public String getSchool () {
        return school;
    }

    @Override 
    public double salary() {
        return 0.7 * baseSalary;
    }
    @Override 
    public void inThongTin() {
        System.out.println("Thực tập sinh " + name 
        + " trường: " + getSchool() 
        + " lương: " + formatMoney(salary()));
    }
}
