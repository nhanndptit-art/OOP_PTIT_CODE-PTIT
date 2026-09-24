package Day3.tong_N_so_duong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();

            long sum = (n * (n + 1))/2;
            System.out.println(sum);
        }
        sc.close();
    }
}
