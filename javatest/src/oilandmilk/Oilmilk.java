package oilandmilk;
import java.util.Scanner;

public class Oilmilk {

	public static void main(String[] args) {
		
		int milkprice=40;
		int oilprice=50;
		int quantitymilk;
		int quantityoil;
		int quantitymilktotal;
		int quantityoiltotal;
		
		int maximumsize=500;
//		int temp=0;
		int totalamount=0;
		Scanner sc = new Scanner(System.in);
		
		while(totalamount<=maximumsize) {
			//milk
			System.out.println("Enter the quantity of milk :");
			quantitymilk=sc.nextInt();
			
		//	quantitymilktotal=quantitymilk*milkprice;
			if(totalamount<maximumsize)
			{
				quantitymilktotal=quantitymilk*milkprice;
				
			}
			else(totalamount>maximumsize)
			{
				System.out.println("Quantity of milk is :"+quantitymilk);
			}
			int totalamount1=quantitymilk;
			

			//oil 
			System.out.println("enetr the quantity of oil :");
			quantityoil = sc.nextInt();
			
		//	quantityoiltotal=quantityoil*oilprice;
			if(totalamount<maximumsize)
			{
				quantityoiltotal=quantityoil*oilprice;
				if(quantityoiltotal>maximumsize)
				{
					System.out.println("Quantity of Oil is :"+quantityoil);
				}
			}
			int totalamount2=quantityoil;
			
			totalamount=totalamount1+totalamount2;
			
		

		}
		////if(totalamount>maximumsize)
		//{
		//	System.out.println(quantitymilk);
			
		//}

	}

}

