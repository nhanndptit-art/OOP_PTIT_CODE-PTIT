
class Node {
    String maDonHang;

    public Node(String maDonHang) {
        this.maDonHang = maDonHang;
    }

    @Override
    public String toString() {
        return "Đơn hàng #" + maDonHang;
    }
}

class MyQueue {
    private Node[] danhSach;  
    private int soLuong;       
    private int capacity;      

    public MyQueue(int capacity) {
        this.capacity = capacity;
        this.danhSach = new Node[capacity];
        this.soLuong = 0;
    }

    public boolean isEmpty() {
        return soLuong == 0;
    }

    public boolean isFull() {
        return soLuong == capacity;
    }

    public void insert(Node donHang) {
        if (isFull()) {
            System.out.println("Hàng đợi đã đầy! Không thể thêm: " + donHang);
            return;
        }
        danhSach[soLuong] = donHang;
        soLuong++;
        System.out.println("Đã thêm vào hàng đợi: " + donHang);
    }

    public Node remove() {
        if (isEmpty()) {
            System.out.println("Hàng đợi rỗng, không có đơn hàng để xử lý!");
            return null;
        }

        Node donHangDauTien = danhSach[0];
        for (int i = 0; i < soLuong - 1; i++) {
            danhSach[i] = danhSach[i + 1];
        }
        soLuong--;

        System.out.println("Đã xử lý: " + donHangDauTien);
        return donHangDauTien;
    }

    public Node peek() {
        if (isEmpty()) {
            System.out.println("Hàng đợi rỗng!");
            return null;
        }
        return danhSach[0];
    }

    public void hienThi() {
        if (isEmpty()) {
            System.out.println("Hàng đợi hiện đang rỗng.");
            return;
        }
        System.out.print("Hàng đợi hiện tại: ");
        for (int i = 0; i < soLuong; i++) {
            System.out.print(danhSach[i] + "  ");
        }
        System.out.println();
    }
}

public class MyQueueDemo {
    public static void main(String[] args) {
        MyQueue hangDoi = new MyQueue(5);
        hangDoi.insert(new Node("DH001"));
        hangDoi.insert(new Node("DH002"));
        hangDoi.insert(new Node("DH003"));

        hangDoi.hienThi();

        hangDoi.remove();

        hangDoi.hienThi();

        hangDoi.insert(new Node("DH004"));
        hangDoi.hienThi();

        hangDoi.remove();
        hangDoi.remove();
        hangDoi.remove();
        hangDoi.remove();
    }
}