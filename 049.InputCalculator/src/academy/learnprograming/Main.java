package academy.learnprograming;
import java.util.Scanner;
import java.math.*;

public class Main {

    public static void main(String[] args) {
	inputThenPrintSumAndAverage();
    }


        public static void inputThenPrintSumAndAverage()
        {
            int SUM=0,AVG=0;
            float count=0;
            Scanner in = new Scanner(System.in);
            while(true)
            {
                boolean isAnInt = in.hasNextInt();
                if(isAnInt)
                {
                    int number = in.nextInt();
                    count++;
                    SUM = SUM + number;
                    AVG =  Math.round(SUM/count);
                }
                else
                    break;
            }
            System.out.println("SUM = "+SUM+" AVG = "+AVG);
        }
}
