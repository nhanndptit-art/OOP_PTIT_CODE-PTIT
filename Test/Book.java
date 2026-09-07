public class Book {
    private String maSach;
    private String tenSach;
    private int giaBan;

    public Book(String maSach, String tenSach, int giaBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.giaBan = giaBan;
    }

    public void hienThiThongTin() {
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Giá bán: " + giaBan + " VND");
    } 
}