package assignmentquestionsday6;

import java.util.Scanner;

public class AgeGroupTernary {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=scanner.nextInt();
		
		String category=(age < 12) ? "child":
						(age <= 19) ? "Teenager" :
						(age <= 64) ? "Adult" :
						"Senior";
		System.out.println("Age group: "+category);
		scanner.close();

	}

}
