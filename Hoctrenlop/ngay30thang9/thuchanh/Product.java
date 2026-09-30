package Hoctrenlop.ngay30thang9.thuchanh;

public class Product {
    protected String sku;
    protected String name;
    protected double price;
    
    public Product(String sku, String name, double price) {
        this.sku = sku;
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public double total() {
        return price;
    }
}
