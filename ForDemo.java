package controlflow;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j;
		
		System.out.println("Display NOs from 1-25");
		for(i=1;i<25;i++) {
			System.out.print(i+"\t");
		}
		
		System.out.println();
		System.out.println("Display NOs from 100-75");
		for(j=100;j>=75;j--) {
			System.out.print(j+"\t");
		}
	}

}
