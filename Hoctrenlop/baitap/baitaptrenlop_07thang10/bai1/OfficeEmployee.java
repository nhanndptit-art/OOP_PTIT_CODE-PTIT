package Hoctrenlop.baitap.baitaptrenlop_07thang10.bai1;

public class OfficeEmployee extends Employee {

    private static final double DAILY_WAGE = 100.0; 
    private int workingDays;

    public OfficeEmployee(String name, int age, int workingDays) {
        super(name, age);
        this.workingDays = workingDays;
    }

    @Override
    public double calculateSalary() {
        return workingDays * DAILY_WAGE;
    }
}