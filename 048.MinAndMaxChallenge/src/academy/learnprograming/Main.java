package academy.learnprograming;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int min=Integer.MAX_VALUE;
	int max=Integer.MIN_VALUE;
//	boolean first = true;
	Scanner in = new Scanner(System.in);
    while(true)
    {
        System.out.print("Enter Number: ");
        boolean isInt = in.hasNextInt();

        if(isInt) {
            int num = in.nextInt();

//            if(first)
//            {
//                min=num;
//                max=num;
//                first = false;
//            }

            if (num <= min)
                min = num;
            if (num >= max)
                max = num;
        }
        else
            break;
    }
    System.out.println("Max Number : "+ max + "      Min Number: "+min);
    }
}
