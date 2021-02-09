package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	System.out.println("Largest Prime Number of 21 is "+getLargestPrime(21));
        System.out.println("Largest Prime Number of 217 is "+getLargestPrime(217));
        System.out.println("Largest Prime Number of 0 is "+getLargestPrime(0));
        System.out.println("Largest Prime Number of 45 is "+getLargestPrime(45));
        System.out.println("Largest Prime Number of -1 is "+getLargestPrime(-1));
    }
        public static int getLargestPrime(int number)
        {
            if(number < 0)
                return -1;

            int largestPrime=-1,count=0;
            for(int i=2;i<=number;i++)
            {
                if(number%i==0)
                {
                    for(int j=2;j<i;j++)
                    {
                        if(i%j==0)
                            count++;
                    }
                    if(count==0)
                        if(largestPrime<i)
                            largestPrime=i;
                }
                count=0;
            }

            return largestPrime;
        }
}
