package Day3.so_nguyen_to;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            if (a < 2) {
               System.out.println("NO"); 
            }
            else {
                boolean isPrime = true;
                double b = Math.sqrt(a);
                for (int i = 2; i <= b; i++ ) {
                    if (a % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
