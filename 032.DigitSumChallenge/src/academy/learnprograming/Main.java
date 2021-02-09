package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	System.out.println("The Sum of the Numbers of digit in 125 is "+sumDigits(125));
	System.out.println("The Sum of the Numbers of digit in -125 is "+sumDigits(-125));
	System.out.println("The Sum of the Numbers of digit in 4 is "+sumDigits(4));
	System.out.println("The Sum of the Numbers of digit in 32123 is "+sumDigits(32123));
    }

    public static int sumDigits(int number) {
        if(number >= 10)
        {
            int sum=0;
            while(number !=0)
            {
                sum= sum + number%10;
                number=number/10;
            }
            return sum;
        }
            else
                return -1;
    }
}
