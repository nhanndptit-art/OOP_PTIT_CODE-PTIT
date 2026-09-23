package Hoctrenlop.Ngay23thang9;

public class Student {

    private static int counter = 0;

    private String mssv;
    private String name;
    private double diemCC;
    private double diemGK;
    private double diemCK;

    private String email;
    private int sdt;


    // contructor
    public Student(String name, double diemCC, double diemGK, double diemCK) {

        counter++;
        this.mssv = String.format("B25DCCC%03d", counter);
        this.name = name;
        setDiemCC(diemCC);
        setDiemGK(diemGK);
        setDiemCK(diemCK);
    }

    // Getters
    public String getMssv() {
        return mssv;
    } 

    public String getName() {
        return name;
    }

    public double getDiemCC() {
        return diemCC;
    }

    public double getDiemGK() {
        return diemGK;
    }

    public double getDiemCK() {
        return diemCK;
    }

    public String getEmail() {
        return email;
    }

    public int getSdt() {
        return sdt;
    }

    // Setters
    public void setDiemCC(double diemCC) {
        if (diemCC >= 0 && diemCC <= 10) {
            this.diemCC = diemCC;
        } else {
            System.out.println("Điểm chuyên cần không hợp lệ. Vui lòng nhập lại.");
        }
    }
    public void setDiemGK(double diemGK) {
        if (diemGK >= 0 && diemGK <= 10) {
            this.diemGK = diemGK;
        } else {
            System.out.println("Điểm giữa kỳ không hợp lệ. Vui lòng nhập lại.");
        }
    }
    public void setDiemCK(double diemCK) {
        if (diemCK >= 0 && diemCK <= 10) {
            this.diemCK = diemCK;
        } else {
            System.out.println("Điểm cuối kỳ không hợp lệ. Vui lòng nhập lại.");
        }
    }

    public Student capNhatEmail(String email) {
        this.email = email;
        return this;
    }

    public Student capNhatSDT(int sdt) {
        this.sdt = sdt;
        return this;
    }

    public static int getTotalStudents() {
        return counter; 
    }

    public double diemTrungBinh() {
        return (this.diemCC * 0.1) + (this.diemGK * 0.3) + (this.diemCK * 0.6);
    }

    

}
