import java.util.Scanner;

public class Main {
    static int n, k;
    static int[] a;
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            k = sc.nextInt();
            a = new int[k + 1];

            Try(1);
            System.out.println("Tong cong co " + count + " to hop");
        }


    sc.close();
    }
    static void Try(int i) {
        for (int j = a[i-1] + 1; j <= n - k + i ; j++) {
            a[i] = j;
            if (i == k) {
                printResult();
                count++;
            } else {
                Try(i + 1);
            }
        }
    }
    static void printResult() {
        for (int i = 1; i <= k; i++) {
            System.out.print(a[i]);
            if (i < k) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
