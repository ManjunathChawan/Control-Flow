import java.util.Scanner;

public class MovieDiscounts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        double ticketPrice = calculateTicketPrice(age);

        System.out.println("Ticket price: " + ticketPrice + " Euros");

        if (age >= 5) {
            System.out.println("Enter the number of tickets you wish to buy: ");
            int numTickets = scanner.nextInt();

            if (numTickets >= 2) {
                double discount = 30;
                double totalDiscount = (discount / 100) * ticketPrice * numTickets;
                System.out.println("30% discount applied for purchasing two or more tickets. Total discount: " + totalDiscount + " Euros");
                ticketPrice -= totalDiscount;
            }
        }

        System.out.println("Total amount to pay: " + ticketPrice + " Euros");

        scanner.close();
    }

    private static double calculateTicketPrice(int age) {
        if (age < 5) {
            return 7 * 0.4; // 60% discount for age below 5
        } else if (age >= 60) {
            return 7 * 0.45; // 55% discount for age over 60
        } else {
            return 7; // Normal ticket price
        }
    }
}
