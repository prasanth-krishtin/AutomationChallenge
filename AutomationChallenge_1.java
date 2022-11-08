package automationChallenge_1;

import java.util.Scanner;

public class AutomationChallenge_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			int min = 1;
			int max = 10;
			int attempt = 1;
			System.out.println("Can you guess the number between " + min + " and " + max + "?");
			int sysGenNumber = (int) (Math.random() * (max - min + 1) + min);

			while (attempt <= 5) {
				System.out.println("Attempt " + attempt);
				int userGivenNumber = sc.nextInt();
				if (sysGenNumber == userGivenNumber) {
					System.out.println("You guessed the number in  : " + attempt + " attempt(s)");
					return;
				} else {
					System.out.println("Your guess is low");
					++attempt;
				}
			}
			System.out.println("Your have exceeded the maximum attempt, The generated number was : " + sysGenNumber);
		} catch (Exception e) {
			System.out.println("Exception occured: " + e.getMessage());
		} finally {
			sc.close();
		}

	}

}
