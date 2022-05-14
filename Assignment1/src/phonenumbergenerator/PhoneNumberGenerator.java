package phonenumbergenerator;

import javax.swing.JOptionPane;

public class PhoneNumberGenerator {
    
    //Implement parallel arrays to hold data
    static String[] employees = new String[3];
    static String[] providers = new String[3];
    static String[] phoneNums = new String[3];

    public static String getNetworkProvider() {
        //Random number generation adapted from
        //https://www.javatpoint.com/how-to-generate-random-number-in-java
        //Accessed June 2021
        int randProvider = (int) (Math.random() * (3 - 1 + 1) + 1);

        if (randProvider == 1) {
            return "VODACOM";
        } else if (randProvider == 2) {
            return "CELL C";
        } else {
            return "MTN";
        }
    }

    public static String generatePhoneNumber(String provider) {
        int randNum;
        String number = "";

        //Add given provider's prefix to number
        if ("VODACOM".equals(provider)) {
            number += "072 ";
        } else if ("CELL C".equals(provider)) {
            number += "084 ";
        } else {
            number += "083 ";
        }

        //Generate part 2
        for (int i = 0; i < 3; i++) {
            randNum = (int) (Math.random() * (9 - 0 + 1) + 0);
            number += randNum;
        }
        number += " - (";

        //Generate part 3
        for (int i = 0; i < 4; i++) {
            randNum = (int) (Math.random() * (9 - 0 + 1) + 0);
            number += randNum;
        }
        number += ")";

        return number;
    }

    public static void main(String[] args) {
        
        //Prompt for employees, assign network provider and generate phone numbers
        employees[0] = JOptionPane.showInputDialog("Enter the name of the first employee:").toUpperCase();
        providers[0] = getNetworkProvider();
        phoneNums[0] = generatePhoneNumber(providers[0]);

        employees[1] = JOptionPane.showInputDialog("Enter the name of the second employee:").toUpperCase();
        providers[1] = getNetworkProvider();
        phoneNums[1] = generatePhoneNumber(providers[1]);

        employees[2] = JOptionPane.showInputDialog("Enter the name of the third employee:").toUpperCase();
        providers[2] = getNetworkProvider();
        phoneNums[2] = generatePhoneNumber(providers[2]);

        //Display results
        JOptionPane.showMessageDialog(null,
                "CELL PHONE NUMBER GENERATOR"
                + "\n****************************************"
                + "\n" + employees[0] + " will be on the " + providers[0] + " network with the phone number " + phoneNums[0]
                + "\n" + employees[1] + " will be on the " + providers[1] + " network with the phone number " + phoneNums[1]
                + "\n" + employees[2] + " will be on the " + providers[2] + " network with the phone number " + phoneNums[2],
                "Employee Number Generation Results", JOptionPane.INFORMATION_MESSAGE);
    }

}
