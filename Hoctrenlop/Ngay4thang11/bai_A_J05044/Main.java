package Hoctrenlop.Ngay4thang11.bai_A_J05044;

import java.util.Scanner;
import java.util.ArrayList;


class NhanVien {
    private String hoTen, chucVu, maNhanVien;
    private Long soNgayCong;
    private long luongCoBan;
    private long luongThucLinh;
    private long phuCap;
    private long tamUng;
    private long conLai;

    private static int count = 0;

    public NhanVien(int STT,String hoTen, String chucVu, long luongCoBan, Long soNgayCong) {
        this.hoTen = hoTen;
        this.chucVu = chucVu;
        this.soNgayCong = soNgayCong;
        this.luongCoBan = luongCoBan;
        count++;
        this.maNhanVien = "NV" + String.format("%02d", count);

        this.luongThucLinh = (long) (luongCoBan * soNgayCong);

        switch (this.chucVu) {
            case "GD": this.phuCap = 500; break;  
            case "PGD": this.phuCap = 400; break;
            case "TP": this.phuCap = 300; break;
            case "KT": this.phuCap = 250; break;
            default: this.phuCap = 100; break;      
        }

        double tmp = (this.phuCap + this.luongThucLinh) * 2.0 / 3.0;
        if (tmp < 25000) {
            this.tamUng = Math.round(tmp / 1000.0) * 1000;
        } else {
            this.tamUng = 25000;
        }
        this.conLai = this.luongThucLinh + this.phuCap - this.tamUng;
    }

    public String getChucVu() {
        return chucVu;
    }

    @Override
    public String toString() {
        return maNhanVien + " " + hoTen + " " + phuCap + " " + luongThucLinh + " " + tamUng + " " + conLai;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String ten = sc.nextLine();
            String chucVu = sc.nextLine();
            long luongCB = Long.parseLong(sc.nextLine());
            long soNgay = Long.parseLong(sc.nextLine());
            
            danhSachNhanVien.add(new NhanVien(i, ten, chucVu, luongCB, soNgay));
        }
        
        // Đọc chức vụ cần liệt kê
        String chucVuCanTim = sc.nextLine();
        
        // In ra danh sách nhân viên có chức vụ tương ứng
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getChucVu().equals(chucVuCanTim)) {
                System.out.println(nv);
            }
        }
        
        sc.close();
    }
}
