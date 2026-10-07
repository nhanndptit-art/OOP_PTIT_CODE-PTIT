package Hoctrenlop.baitap.baitaptrenlop_07thang10.bai3;

import java.text.DecimalFormat;

public abstract class PaymentMethod {
    protected String type; // Loại thanh toán: trực tiếp, không dùng tiền mặt
    protected String name; // Tên phương thức: Thẻ tín dụng, PayPal...

    public PaymentMethod(String type, String name) {
        this.type = type;
        this.name = name;
    }

    // Hàm hỗ trợ định dạng số tiền (VD: 200000 -> 200.000)
    protected String formatAmount(long amount) {
        DecimalFormat df = new DecimalFormat("#,###");
        return df.format(amount).replace(',', '.');
    }

    // Phương thức trừu tượng, mỗi lớp con sẽ tự định nghĩa câu in ra
    public abstract void pay(long amount);
}