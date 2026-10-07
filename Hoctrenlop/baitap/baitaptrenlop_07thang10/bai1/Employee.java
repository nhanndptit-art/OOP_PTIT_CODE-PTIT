package Hoctrenlop.baitap.baitaptrenlop_07thang10.bai1;

public abstract class Employee {
    protected String name;
    protected int age;

    public Employee (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract double calculateSalary();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
        
    }


}
