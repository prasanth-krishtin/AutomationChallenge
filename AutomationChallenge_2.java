package automationChallenge_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AutomationChallenge_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> initialList = new ArrayList<>();
		List<Integer> initialListSecondary = new ArrayList<>();
		int sumOfInputs = 0;
		int expectedSetValue = 0;
		try {
			System.out.println("Enter the size of the list");
			int size = sc.nextInt();
			System.out.println("Enter the " + size + " numbers one by one");
			int i = 0;
			while (i < size) {
				int userInput = sc.nextInt();
				initialList.add(userInput);
				initialListSecondary.add(userInput);
				i++;
			}
			for (int entity : initialList) {
				sumOfInputs += entity;
			}

			expectedSetValue = sumOfInputs / 2;
			if (sumOfInputs % 2 == 0) {
				System.out.println("Splitting is possible");
				List<Integer> tempList1 = new ArrayList<>();

				int j = 0;
				int addedValue = 0;
				while (j < initialList.size()) {
					if (initialList.get(j) < expectedSetValue) {
						addedValue += initialList.get(j);

						tempList1.add(initialList.get(j));
						initialListSecondary.remove(initialList.get(j));
						if (addedValue == expectedSetValue) {
							System.out.println("First set->" + tempList1);
							break;
						} else if (addedValue > expectedSetValue) {
							addedValue -= initialList.get(j);
							tempList1.remove(j);
						}
					}
					j++;
				}
				System.out.println("Second set->" + initialListSecondary);

			} else {
				System.out.println("Cannot split with given condition");
				return;
			}

		} catch (Exception e) {
			System.out.println("Exception occured: " + e.getMessage());
		} finally {
			sc.close();
		}

	}

}
