package assignmentquestionsday6;

import java.util.Scanner;

public class BankAccountStatusCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account balance: $");
        double balance = scanner.nextDouble();

        String status = (balance >= 1000) ? "Good Standing" :
                        (balance >= 500) ? "Low Balance" :
                        "Account Overdrawn";

        System.out.println("Account Status: " + status);
        scanner.close();

	}

}
