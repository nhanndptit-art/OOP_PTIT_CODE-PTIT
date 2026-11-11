package Day5.On_giua_ky.Bai3;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Long n = sc.nextLong();
            Long result = ((n * (n + 1)) / 2);
            System.out.println(result);
        }
        sc.close(); 

    }
}