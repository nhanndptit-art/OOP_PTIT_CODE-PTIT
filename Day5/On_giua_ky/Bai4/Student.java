package Day5.On_giua_ky.Bai4;

public class Student {
    private int mssv;
    private String name;
    private int diemCC;
    private int diemGK;
    private int diemCK;

    //constructor
    public Student(int mssv, String name, int diemCC, int diemGK, int diemCK) {
        this.mssv = mssv;
        this.name = name;
        this.diemCC = diemCC;
        this.diemGK = diemGK;
        this.diemCK = diemCK;

    }


    //getter
    public int getMssv () {
        return mssv;
    }
    public String getName () {
        return name;
    }
    public int getDiemCC () {
        return diemCC;
    }
    public int getDiemGK () {
        return diemGK;
    }
    public int getDiemCK () {
        return diemCK;
    }

    //setter

    public void setDiemCC (int diemCC) {
        if (diemCC >= 0 && diemCC <= 10) {
            this.diemCC = diemCC;
        } else {
            System.out.println("Điểm không hợp lệ");
        }
    }

}
