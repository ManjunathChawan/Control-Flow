import java.util.Scanner;

public class CommissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sales figure: ");
        double sales = scanner.nextDouble();

        double commission = calculateCommission(sales);

        if (commission != -1) {
            System.out.println("Commission for sales figure $" + sales + " is: " + commission + "%");
        } else {
            System.out.println("No commission for sales figure below $1000");
        }

        scanner.close();
    }

    private static double calculateCommission(double sales) {
        if (sales > 10000) {
            return 30;
        } else if (sales >= 5001 && sales <= 9999) {
            return 20;
        } else if (sales >= 1001 && sales <= 4999) {
            return 10;
        } else {
            return -1; // No commission for sales below $1000
        }
    }
}