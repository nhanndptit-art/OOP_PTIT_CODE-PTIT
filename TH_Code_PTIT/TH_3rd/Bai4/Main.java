package TH_Code_PTIT.TH_3rd.Bai4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final int[] PRICE_BY_FLOOR = {0, 25, 34, 50, 80};

    static class Customer {
        private final String code;
        private final String name;
        private final int room;
        private final long days;
        private final int amount;

        Customer(int number, String name, int room, String checkIn, String checkOut, int serviceFee) {
            this.code = String.format("KH%02d", number);
            this.name = name;
            this.room = room;
            this.days = getDays(checkIn, checkOut);
            this.amount = getPrice(room) * (int) days + serviceFee;
        }

        private static long getDays(String checkIn, String checkOut) {
            LocalDate start = LocalDate.parse(checkIn, DATE_FORMAT);
            LocalDate end = LocalDate.parse(checkOut, DATE_FORMAT);
            return ChronoUnit.DAYS.between(start, end) + 1;
        }

        private static int getPrice(int room) {
            int floor = room / 100;
            return PRICE_BY_FLOOR[floor];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int customerCount = scanner.nextInt();
        scanner.nextLine();
        List<Customer> customers = new ArrayList<>();

        for (int i = 1; i <= customerCount; i++) {
            String name = scanner.nextLine().trim();
            int room = Integer.parseInt(scanner.nextLine().trim());
            String checkIn = scanner.nextLine().trim();
            String checkOut = scanner.nextLine().trim();
            int serviceFee = Integer.parseInt(scanner.nextLine().trim());
            customers.add(new Customer(i, name, room, checkIn, checkOut, serviceFee));
        }

        customers.sort(Comparator.comparingInt((Customer customer) -> customer.amount).reversed());

        for (Customer customer : customers) {
            System.out.printf("%s %s %d %d %d%n",
                    customer.code, customer.name, customer.room, customer.days, customer.amount);
        }
    }
}
