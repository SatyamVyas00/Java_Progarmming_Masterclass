package academy.learnprograming;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		String name = scanner.nextLine();
		System.out.print("Enter Your Year of Birth: ");
		boolean hasNextInt = scanner.hasNextInt();
		if (hasNextInt) {
			int yearOfBirth = scanner.nextInt();
		int age = 2020 - yearOfBirth;
		if (age >= 0 && age <= 100)
			System.out.println("Your Name is " + name + " and your are " + age + "years old");
		else
			System.out.println("Invalid Year Of Birth");
	}
		else
			System.out.println("Unable to Parse Year of Birth");
		scanner.close();
    }
}
