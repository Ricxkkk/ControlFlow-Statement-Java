package controlflow;
import java.util.*;
public class SumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1,number2,number3,sum;
		float avg;
		Scanner sc = new Scanner(System.in);   //Declare Scanner Object
		
		
		System.out.println("Enter Your Organization : ");
        String org = sc.nextLine();		
		//Take Input
		System.out.println("Enter 3 Numbers : ");
 		number1 = sc.nextInt();
		number2 = sc.nextInt();
		number3 = sc.nextInt();
		
		if((number1> 100) && (number2>100) && (number3>100)) {
			
		
		
		//Process
		sum = number1+number2+number3;
		avg =(float)sum/3;                           //typecasting
		
		//Display output
		//System.out.println("*****************************");
		System.out.println("The Sum of 3  Numbers is : "+sum);
		System.out.println("The Average of 3 Numbers is : "+avg);
		System.out.println("Coded by at "+org+" Training");
		System.out.println("******************************");
		} else {
			System.out.println("Please Enter Numbers Greater then 100");
		}
		sc.close();
	}

}
