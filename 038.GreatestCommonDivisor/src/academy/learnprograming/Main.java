package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	System.out.println("Greatest Common Divisor of 25 & 15 is :"+getGreatestCommonDivisor(25,15));
    System.out.println("Greatest Common Divisor of 12 & 30 is :"+getGreatestCommonDivisor(12,30));
    System.out.println("Greatest Common Divisor of 9 & 18 is :"+getGreatestCommonDivisor(9,18));
        System.out.println("Greatest Common Divisor of 81 & 153 is :"+getGreatestCommonDivisor(81,153));
    }
    public static int getGreatestCommonDivisor(int first,int second)
        {
            if(first < 10 || second < 10)
                return -1;

            for(int i=(first>second?second:first);i>=1;i--)
            {
                if( first % i == 0 && second%i == 0)
                    return i;
            }
            return -1;
        }
}
