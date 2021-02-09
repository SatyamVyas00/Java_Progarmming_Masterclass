package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sum of first and last digit of 252 is "+sumFirstAndLastDigit(252) );
        System.out.println("Sum of first and last digit of 257 is "+sumFirstAndLastDigit(257) );
        System.out.println("Sum of first and last digit of 0 is "+sumFirstAndLastDigit(0) );
        System.out.println("Sum of first and last digit of 5 is "+sumFirstAndLastDigit(5) );
        System.out.println("Sum of first and last digit of -10 is "+sumFirstAndLastDigit(-10) );
    }
    public static int sumFirstAndLastDigit(int number)
    {
            if(number < 0)
                return -1;

            int first = 0, last=0;
            int temp = number,count=0;
            while(temp != 0)
            {
                count++;
                temp=temp/10;
            }
            for(int i=1;i<=count;i++)
            {
                if(i==1)
                    last = number%10;

                if(i==count)
                    first = number%10;

                number = number/10;
            }
            return (first+last);
    }
}
