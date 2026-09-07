public class EBook extends Book {
    private double dungLuong;


    public EBook(String maSach, String tenSach, int giaBan, double dungLuong) {
        super(maSach, tenSach, giaBan);
        this.dungLuong = dungLuong;
    }
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Dung lượng: " + dungLuong + " MB");
    }
}