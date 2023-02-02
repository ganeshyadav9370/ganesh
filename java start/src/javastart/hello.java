package javastart;
import java.util.Scanner;
public class hello {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enetr the first number :");
		int b = sc.nextInt();
		System.out.println("enetr the  second number :");
		int a = sc.nextInt();
		
		System.out.println("press 1 for the addition");
		System.out.println("press 2 for the substraction");
		System.out.println("press 3 for the multiplication");
		System.out.println("press 4 for the division");
		
		int userchoice= sc.nextInt();
		
		if (userchoice==1) {
			
			int add= a+b;
			System.out.println("answer :"+add);
			}
		else if(userchoice==2) {
			int sub=a-b;
			System.out.println("answer :"+sub);
			}
		else if(userchoice==3) {
			int multi=a*b;
			System.out.println("answer :"+multi);
			}
		else if(userchoice==4) {
			int div =a/b;
			System.out.println("answer :"+div);
			}
		else {
			System.out.println("invalid input");
			}
		}
		
		
		
		
		
}
