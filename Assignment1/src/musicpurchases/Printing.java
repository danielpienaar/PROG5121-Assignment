package musicpurchases;

import java.text.DecimalFormat;

public class Printing {
    
    //Declare a static global format for prices
    //DecimalFormat adapted from
    //https://docs.oracle.com/javase/7/docs/api/java/text/DecimalFormat.html
    //Accessed June 2021
    static DecimalFormat df = new DecimalFormat("#.00");
    
    public static void printDetails(CustomerPurchases cp) {
        System.out.println(""
                + "\nCUSTOMER INVOICE"
                + "\n************************************"
                + "\nCUSTOMER NUMBER:\t" + cp.getCustomerNumber()
                + "\nCUSTOMER FIRST NAME:\t" + cp.getFirstName()
                + "\nCUSTOMER SURNAME:\t" + cp.getSurname()
                + "\nPRODUCT PRICE:\t\tR" + df.format(cp.getPrice())
                + "\nPRODUCT QUANTITY:\t" + cp.getQuantity()
                + "\n************************************\n");
    }
    
    public static void customerPurchaseReport(CustomerPurchases cp) {
        //Get report options
        double price = cp.getPrice();
        double tax = 0.15 * price;
        double commision = 0.085 * price;
        double discount = 0.1 * price;
        
        //Calculate total
        double total = (price + tax) - (discount + commision);
        
        //Display Purchases Report
        System.out.println(""
                + "\nCUSTOMER PURCHASE REPORT"
                + "\n************************************"
                + "\nPRODUCT PRICE:\tR" + df.format(price)
                + "\nTAX:\t\tR" + df.format(tax)
                + "\nCOMMISSION:\tR" + df.format(commision)
                + "\nDISCOUNT:\tR" + df.format(discount)
                + "\nTOTAL:\t\tR" + df.format(total)
                + "\n************************************\n");
    }
    
}
