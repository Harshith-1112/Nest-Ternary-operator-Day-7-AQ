package assignmentquestionsday6;

import java.util.Scanner;

public class TemperatureClassification {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter temperature in °C: ");
        double temp = scanner.nextDouble();

        String classification = (temp > 30) ? "Hot" :
                                (temp >= 15) ? "Moderate" :
                                "Cold";

        System.out.println("Temperature is: " + classification);
        scanner.close();

	}

}
