package controlflow;
import java.util.*;
public class SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Program to find Sum of Series . 1+2+3+ .....+n
		
		int i=1,n,sum=0;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Value of N : ");
        n=scanner.nextInt();
        scanner.close();
        
        while (i<=n) {
        	sum = sum+i;
        	i = i+1;
        	
        }
        System.out.println("The sum of series of "+n+" is :"+sum);
	}

}
