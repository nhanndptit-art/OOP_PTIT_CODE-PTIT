package Hoctrenlop.baitap.BangLuongNhanVien;

public class Main {
    public static void main (String[] args) {
        Employee An = new FulltimeEmployee("nv01", "Hung", 10000000, 2000000);
        Employee Binh = new Intern("tts01", "Binh", 5000000, "PTIT");

        Employee[] danhSachNhanVien = {An, Binh};

        double tongQuyLuong = 0;

        for (Employee emp : danhSachNhanVien) {
            emp.inThongTin();
            tongQuyLuong += emp.salary();
        }
        String formattedTong = String.format("%.0f", tongQuyLuong).replace(',', '.');
        System.out.println("Tổng quỹ lương: " + formattedTong + "đ");
    }

    
}
