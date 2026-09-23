package Hoctrenlop.Ngay23thang9;

public class main {
    public static void main(String[] args) {
        Classroom lopJava = new Classroom("Lập trình Java Căn Bản");

        // SỬA: Xóa mssv (các số 202300x) ở đầu mỗi constructor
        Student sv1 = new Student("Nguyen Van A", 9.0, 8.5, 8.0); 
        Student sv2 = new Student("Tran Thi B", 7.0, 6.5, 7.0); 
        Student sv3 = new Student("Le Van C", 5.0, 4.0, 3.0); 

        lopJava.addStudent(sv1);
        lopJava.addStudent(sv2);
        lopJava.addStudent(sv3);

        System.out.println("Đã thêm 3 sinh viên thành công.");

        // SỬA: Tạo 1 sinh viên mới. 
        // Tuy nhiên, do MSSV giờ là tự động (sẽ thành B25DCCC004), 
        // nên việc tạo một sinh viên mới bằng new Student() SẼ KHÔNG THỂ BỊ TRÙNG MSSV.
        // Để mô phỏng lỗi thêm trùng cho Bài 3, bạn hãy cố tình add lại sv1 một lần nữa.
        
        System.out.println("\n--- Thử thêm sinh viên trùng MSSV ---");
        try {
            // Thử thêm lại sv1 (người đã có trong danh sách)
            lopJava.addStudent(sv1); 
            System.out.println("Thêm thành công!"); 
        } catch (IllegalArgumentException e) {
            System.out.println("BỊ CHẶN: " + e.getMessage()); 
        }

        lopJava.inBangDiem(); 
    }
}