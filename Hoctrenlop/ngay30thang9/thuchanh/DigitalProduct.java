package Hoctrenlop.ngay30thang9.thuchanh;

public class DigitalProduct extends Product{
    private String downloadLink;

    public DigitalProduct(String sku, String name, double price, String downloadLink) {
        super(sku, name, price);
        this.downloadLink = downloadLink;

    }

    public String getDownloadLink() {
        return downloadLink;
    }

    @Override 
    public double total() {
        return price;
    }
}
