package assignmentquestionsday6;

import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();

       
        double taxRate = (income < 300000) ? 0.05 :
                         (income <= 1000000) ? 0.10 :
                         0.15;
       
        double tax = income * taxRate;

        tax = (income > 2000000) ? tax * 1.01 : tax;

        System.out.println("Income Tax: " + tax);
        scanner.close();
	}

}
