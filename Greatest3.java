package controlflow;

import java.util.*;
public class Greatest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
   Scanner x =  new Scanner(System.in);
   int n1,n2 , n3;
   System.out.println("Enter 3 numbers :");
   n1 = x.nextInt();
   n2 = x.nextInt();
   n3 = x.nextInt();
   
   if(n1>n2 && n1> n3) {
	   System.out.println(n1+" is Greatest");
   }else if(n2 > n3) {
	   System.out.println(n2+" is Greatest");
   }else if (n1 == n2 && n2 == n3) {
	   System.out.println("All Numbers are equal");
   } else {
	   System.out.println(n3+ " is Greatest");
   }
   x.close();   
	}

}
