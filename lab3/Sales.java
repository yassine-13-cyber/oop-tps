/*import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        final int SALESPEOPLE = 5;
        int [] sales = new int [SALESPEOPLE];
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<sales.length;i++){
            System.out.println("Enter sales for salesperson" +(i+1)+": ");
            sales[i]=scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("-------------------");
        for(int i=0; i< sales.length;i++){
            System.out.println(" " + (i + 1) + " "+ sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);
    }
}*/
import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Ask the user for the number of salespeople
        System.out.println("Enter the number of salespeople: ");
        int SALESPEOPLE = scan.nextInt();

        int[] sales = new int[SALESPEOPLE];
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            System.out.println("Enter sales for salesperson " + (i + 1) + " : ");
            sales[i] = scan.nextInt();
        }

        System.out.println("\nSalesperson Sales ");
        System.out.println("-------------------------------");
        for (int i = 0; i < sales.length; i++) {
            System.out.println(" " + (i + 1) + " $" + sales[i]);
            sum += sales[i];
        }

        // Compute and print the average sale
        double average = (double) sum / SALESPEOPLE;
        System.out.println("\nTotal sales: $" + sum);
        System.out.println("Average sales: $" + average);

        // Find and print the maximum and minimum sale
        int maxSale = sales[0];
        int minSale = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxSale) {
                maxSale = sales[i];
            }
            if (sales[i] < minSale) {
                minSale = sales[i];
            }
        }
        System.out.println("Maximum sale: $" + maxSale);
        System.out.println("Minimum sale: $" + minSale);

        // Ask the user to enter a value and print the details of salespersons who exceeded that value
        System.out.println("Enter a sales amount in dollars to find salespeople who exceeded that amount: ");
        int target = scan.nextInt();
        int countExceeding = 0;
        System.out.println("\nSalesperson Sales Exceeding $" + target);
        System.out.println("----------------------------");
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > target) {
                System.out.println(" " + (i + 1) + " $" + sales[i]);
                countExceeding++;
            }
        }
        System.out.println("Total number of salespeople exceeding $" + target + ": " + countExceeding);

        scan.close();
    }
}