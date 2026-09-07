public class Main {
    public static void main(String[] args) {
        Book sachGiay = new Book("B001", "Lập trình Java", 150000);
        EBook sachDienTu = new EBook("E001", "Lập trình Python", 100000, 5.5);


        System.out.println("Thông tin sách giấy:");
        sachGiay.hienThiThongTin();
        
        System.out.println("\nThông tin sách điện tử:");
        sachDienTu.hienThiThongTin();
    }
}
