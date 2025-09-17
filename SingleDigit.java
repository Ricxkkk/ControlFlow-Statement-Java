package controlflow;

import java.util.Scanner;

public class SingleDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num;
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter a Number :");
     num = sc.nextInt();
     
     if(num > -10 && num < 10) {
    	 System.out.println(num+" is a Single Digit");
     } else {
    	 System.out.println(num+" is Not a Single Digit");
     }
     sc.close();
	}

}
