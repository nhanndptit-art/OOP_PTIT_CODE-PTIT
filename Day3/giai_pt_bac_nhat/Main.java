package Day3.giai_pt_bac_nhat;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ( a == 0 && b == 0) {
            System.out.println("VSN");
        }
        else if (a == 0 && b != 0) {
            System.out.println("VN");
        }
        else {
            double x = (double) -b / a;
            System.out.printf("%.2f", x);
        }
        sc.close();
    }
}
