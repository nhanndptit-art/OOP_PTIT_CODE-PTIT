package Hoctrenlop.ngay30thang9.thuchanh;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[] {
            new PysicalProduct("SP01", "Bàn phím", 150000, 30000),
            new DigitalProduct("SP02", "Ebook", 45000, "https://shop.vn/download/ebook")
        };

        for (Product p : products) {
            System.out.printf("%s: %,.0f đ\n", p.getName(), p.total());
        }
    }
}