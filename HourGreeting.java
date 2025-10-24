package assignmentquestionsday6;

import java.util.Scanner;

public class HourGreeting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter hour of the day (0-23): ");
        int hour = sc.nextInt();
        
        String greeting = (hour >= 5 && hour < 12) ? "Good Morning" :
                          (hour >= 12 && hour < 17) ? "Good Afternoon" :
                          (hour >= 17 && hour < 22) ? "Good Evening" :
                          "Good Night";

        System.out.println(greeting);
        sc.close();

	}

}
