
import java.util.Scanner;

public class Hinhchunhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chieudai = sc.nextInt();
        int chieurong = sc.nextInt();
        if (chieudai <= 0 || chieurong <= 0) {
            System.out.println("0");
        } else {
            int dientich = chieudai * chieurong;
            int chuvi = (chieudai + chieurong) * 2;
            System.out.println(chuvi + " " + dientich);
        }
        sc.close();
    }}