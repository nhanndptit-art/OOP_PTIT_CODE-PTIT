package TH_Code_PTIT.TH_3rd.Bai3;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String code = scanner.nextLine().trim();
        String name = scanner.nextLine().trim();
        double math = scanner.nextDouble();
        double physics = scanner.nextDouble();
        double chemistry = scanner.nextDouble();

        double priority = getPriority(code.substring(0, 3));
        double total = math * 2 + physics + chemistry;
        String status = total + priority >= 24 ? "TRUNG TUYEN" : "TRUOT";

        System.out.printf("%s %s %s %s %s%n",
                code, name, format(priority), format(total), status);
    }

    private static double getPriority(String area) {
        switch (area) {
            case "KV1":
                return 0.5;
            case "KV2":
                return 1.0;
            case "KV3":
                return 2.5;
            default:
                return 0;
        }
    }

    private static String format(double value) {
        if (value == Math.rint(value)) {
            return String.format("%.0f", value);
        }
        return String.format("%.1f", value);
    }
}
