package controlflow;
import java.util.*;
public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc = new Scanner(System.in);
		int n;
		//n = sc.nextInt();
		System.out.println("Enter a Number :");
		n = sc.nextInt();
		System.out.println("Multiplication Table of :"+ n);
		for(int i=1; i<=10; i++) {
			System.out.println( n +"*"+ i +"=" + n*i);
		}
		sc.close();
	}

}
