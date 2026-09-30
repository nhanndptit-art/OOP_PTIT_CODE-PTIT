package Hoctrenlop.ngay30thang9.thuchanh;

public class PysicalProduct extends Product{
    private double shippingFee;

    public PysicalProduct(String sku, String name, double price, double shippingFee) {
        super(sku, name, price);
        this.shippingFee = shippingFee;

    } 

    @Override 
    public double total() {
        return price + shippingFee;
    }
}
