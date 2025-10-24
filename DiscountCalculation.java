package assignmentquestionsday6;

import java.util.Scanner;

public class DiscountCalculation {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter total shopping amount: ");
		double amount=scanner.nextDouble();
		
		double discount=(amount >= 1000) ? amount * 0.20:
						(amount >= 500) ? amount * 0.10:
							0;
		
		double finalAmount = amount-discount;
		
		System.out.println("Discount: "+discount);
		System.out.println("Amount to pay: "+ finalAmount);
		scanner.close();
		
							
	}

}
