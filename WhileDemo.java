package controlflow;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Program to display ur name 10 times & nos from 1-10
		int i =1;
		while(i<=10) {
			System.out.println(i+".James");
			i=i+1;
		}
		System.out.println("Exit Loop");
		
		System.out.println("*************Reverse Loop*************");
		int j=10;
		while(j>=1) {
			System.out.print(j+"\t");
			j = j-1;
		}
	}

}
