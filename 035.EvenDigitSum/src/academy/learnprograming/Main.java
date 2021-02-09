package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	System.out.println("Sum of Evens Numbers in 123456789 is "+ getEvenDigitSum(123456789));
    System.out.println("Sum of Evens Numbers in 252 is "+ getEvenDigitSum(252));
    System.out.println("Sum of Evens Numbers in -22 is "+ getEvenDigitSum(-22));
    }
    public static int getEvenDigitSum(int number)
    {
            if(number <0 )
                return -1;
            int temp=number,sum=0;
            while(temp != 0)
            {
                int digit;
                digit=temp%10;
                if(digit%2 == 0)
                    sum += digit;

                temp=temp/10;
            }
            return sum;
    }
}
