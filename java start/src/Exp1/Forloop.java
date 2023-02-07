package Exp1;
import java.util.Scanner;
class Forloop{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int i=sc.nextInt();
		
		while(i<=9) {
			
			if(i>=5) {
				System.out.println("hello"+i);
				break; 
			}
			System.out.println("hello"+i);
		}
	}
	
}
