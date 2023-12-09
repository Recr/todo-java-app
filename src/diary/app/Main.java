package diary.app;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Agenda test = new Agenda();
		boolean loop = true;
		Scanner scanner = new Scanner(System.in);
		while (loop) {
			System.out.println("---------- Agenda ----------");
			System.out.println("1 - Add entry");
			System.out.println("2 - Remove entry");
			System.out.println("3 - List entries");
			System.out.println("4 - Exit program");
			String option = scanner.nextLine();
			switch (option) {
			case "1":
				test.addEntry(scanner.nextLine());
				break;

			case "2":
				test.removeEntry(scanner.nextInt());
				break;

			case "3":
				test.showEntries();
				break;

			case "4":
				System.out.print("Exiting...");
				loop = false;
				break;

			default:
				System.out.println("Invalid option");
			}
		}
	}
}
