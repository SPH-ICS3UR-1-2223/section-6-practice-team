package DisplayMultiples;

import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
    	Scanner in = new Scanner (System.in);
    	System.out.println("Enter a number.");
    	int number = in.nextInt();
   
    	number = Math.abs(number);
    	
       for (int table=number;table>0;table--);{
     
    
	System.out.println(table);
    }


}
