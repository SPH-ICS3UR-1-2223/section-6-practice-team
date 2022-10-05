package ValidatePin;

import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int pin = 5678;
        System.out.println("Enter a PIN.");
        int userPin =in.nextInt();
        	while (userPin!=pin) {
        		System.out.println("Invalid PIN. Try again.");
        		userPin=in.nextInt();
        	}
        	
        	if (userPin==pin) {
        		System.out.println("PIN correct. Access granted.");
        	}
    }
}
