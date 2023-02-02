package javaoops;
import java.util.Scanner;
public class Javaoops
{
	public static void main(String[] args){
		int a;
		int b;
		int sum;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Number:");
		a=sc.nextInt();
		
		System.out.println("Enter the Second Number:");
		b=sc.nextInt();
		
		sum=a+b;
		System.out.println("sum of two numbers:"+sum);
		

	}

}

