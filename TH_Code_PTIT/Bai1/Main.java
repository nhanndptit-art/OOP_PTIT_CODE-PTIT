
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chieuDai = sc.nextInt();
        int chieuRong = sc.nextInt();
        if (chieuDai <=0 || chieuRong <=0) {
            System.out.println("0");
        } else {
            int dienTich = chieuDai * chieuRong;
            int chuvi = (chieuDai + chieuRong) * 2;
            System.out.println(chuvi + " " + dienTich);
        }
        sc.close();
    }
}
