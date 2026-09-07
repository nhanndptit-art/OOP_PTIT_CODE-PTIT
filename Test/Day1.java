// // bai 1
// public class Day1 {

//     public static void main(String[] args) {
//         int sum = 0;
//         for (int i = 1; i <= 100; i++) {
//             if (i % 2 == 0) {
//                 sum += i;
//             }
//         }
//         System.out.println("Tong cac so chan tu 1 den 100 la: " + sum);
//     }
// }
// bai 2
public class Day1 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i %7 == 0) {
                sum += i;
            }
        }
        System.out.println("Tong cac so chia het cho 7 tu 1 den 100 la: " + sum);
    }
}