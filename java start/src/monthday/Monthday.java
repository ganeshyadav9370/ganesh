package monthday;
import java.util.Scanner;
public class Monthday {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int f=sc.nextInt();
        System.out.println("enter the second number");
        int s=sc.nextInt();
        if (f>s) {
        	System.out. println(f+"is greter number");
        }
        else if(s>f) {
        	System.out.println(s+"is greter number");
        }
        
	}
        

}
