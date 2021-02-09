package academy.learnprograming;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	ReadingUserInputChallenge();
    }
    public static void ReadingUserInputChallenge()
    {
        int sum =0,counter=0;
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter Number #" + (counter + 1) + " : ");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                sum += scanner.nextInt();
                counter++;
                scanner.nextLine();
                if (counter == 10)
                {
                    System.out.println("Sum is :" + sum);
                    return;
                }
            }
            else {
                System.out.println("Invalid Input");
                scanner.nextLine();
                continue;
            }
        }
    }
}
