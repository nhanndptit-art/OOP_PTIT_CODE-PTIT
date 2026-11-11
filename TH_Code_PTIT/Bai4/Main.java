import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int test = 1; test <= t; test++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] count = new int[100005];

            for (int i = 0;  i < n; i++ ) {
                a[i] = sc.nextInt();
                count[a[i]]++;
            }
            System.out.println("Test " + test + ":");
            for (int i = 0; i < n; i++) {
                if (count[a[i]] > 0) {
                    System.out.println(a[i] + " xuat hien " + count[a[i]] + " lan");
                    count[a[i]] = 0;
                }
            }

        }
        sc.close();
    }
}
