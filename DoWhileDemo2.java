package controlflow;
import java.util.*;
public class DoWhileDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=20;
		do {
			System.out.println(i+"\t");
			i+=1;
		}while(i<=50);
		
		System.out.println("********************* Guess Names ***********************");
		String guess;
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		do {
			System.out.println("Guess My Name : ");
			guess = sc.next();
		}
		while(!"James".equals(guess));
		System.out.println("Congratulations You Guessed Name Correctly!!! "+guess);
	
		sc.close();		
	}

}
