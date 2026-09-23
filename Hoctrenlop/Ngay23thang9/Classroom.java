package Hoctrenlop.Ngay23thang9;

import java.util.ArrayList;

public class Classroom {
    private String tenLop;
    private ArrayList<Student> danhSachSinhVien;


    public Classroom(String tenLop) {
        this.tenLop = tenLop;
        this.danhSachSinhVien = new ArrayList<>();
    }

    public void addStudent(Student s) {

        for (Student sv : danhSachSinhVien) {

            if (String.valueOf(sv.getMssv()).equals(String.valueOf(s.getMssv()))) {

                throw new IllegalArgumentException("Sinh viên có MSSV " + s.getMssv() + " đã tồn tại trong lớp!");
            }
        }

        danhSachSinhVien.add(s);
    }

    public String xepLoai(Student s) {
        double dtb = s.diemTrungBinh();
        if (dtb >= 8.0) {
            return "Giỏi";
        } else if (dtb >= 6.5) {
            return "Khá";
        } else if (dtb >= 5.0) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }

    public void inBangDiem() {
        System.out.println("\n=== BẢNG ĐIỂM LỚP: " + this.tenLop + " ===");
        for (Student s : danhSachSinhVien) {
            System.out.printf("MSSV: %s | Tên: %-12s | ĐTB: %.2f | Xếp loại: %s\n", 
                              s.getMssv(), s.getName(), s.diemTrungBinh(), xepLoai(s));
        }
        System.out.println("-> Sĩ số lớp: " + danhSachSinhVien.size() + " sinh viên.");
    }
}