package assignmentquestionsday6;

import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double number = scanner.nextDouble();

		String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";

		System.out.println("The number is: " + result);
		scanner.close();

	}

}
