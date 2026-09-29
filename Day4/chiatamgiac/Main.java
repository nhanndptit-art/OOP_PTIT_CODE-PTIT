package Day4.chiatamgiac;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- >0) {
                int n = sc.nextInt();
                double h = sc.nextDouble();
                for (int i = 1; i < n; i++) {
                    double hi = h * Math.sqrt((double) i / n);
                    System.out.printf("%.6f ", hi);
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
