package musicpurchases;

//Main method class
import java.util.Scanner;

public class MusicPurchases {

    public static void main(String[] args) {
        //Initialize CustomerPurchases object
        CustomerPurchases cp = new CustomerPurchases();

        //Get user input with a scanner
        Scanner input = new Scanner(System.in);
        boolean valid = true;
        do {
            try {
                System.out.print("Enter the customer number >> ");
                //Get customer number as a string to preserve the 0
                cp.setCustomerNumber(input.next());
                System.out.print("Enter the customer's first name >> ");
                cp.setFirstName(input.next());
                System.out.print("Enter the customer's surname >> ");
                cp.setSurname(input.next());
                System.out.print("Enter the product >> ");
                cp.setProduct(input.next());
                System.out.print("Enter the price >> ");
                cp.setPrice(input.nextDouble());
                System.out.print("Enter the quantity required >> ");
                cp.setQuantity(input.nextInt());
            } catch (Exception e) {
                System.out.println("Invalid input.");
                input.next();
                valid = false;
            }
        } while (!valid);
        //Print customer invoice
        Printing.printDetails(cp);
        //Ask user if they would like to view the product purchase report
        System.out.print("Would you like to view the product purchase report? Enter (1) to view or any other key to exit: ");
        if ("1".equals(input.next())) {
            Printing.customerPurchaseReport(cp);
        }
    }

}
