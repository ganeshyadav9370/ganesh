package monthday;
import java.util.Scanner;
public class Monthday {

	public static void main(String[] args) {
		int a[]=new int[20];
		
		Object hg=new Scanner(System.in);
		Scanner se =(Scanner)hg;
        System.out.println("enter the first number");
        int f=se.nextInt();
        System.out.println("enter the second number");
        int s=se.nextInt();
        if (f>s) {
        	System.out. println(f+"is greter number");
        }
        else if(s>f) {
        	System.out.println(s+"is greter number");
        }
        
	}
        

}
