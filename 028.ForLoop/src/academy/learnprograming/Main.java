package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	for(int i=0;i<=5;i++)
	    System.out.println("Loop "+i+",Hello");

	//Challenge Calculate Interest
        for (int i=2;i<9;i++)
        {
            System.out.println("10,000 at "+i+"% interest ="+((10000*i)/100));
        }
    //Challenge rev of above
        for (int i=8;i>1;i--)
        {
            System.out.println("10,000 at "+i+"% interest ="+((10000*i)/100));
        }

        //5 Prime Number Challenge
        int count =0;
        for(int i=10;i<50;i++)
        {
            if(isPrime(i))
            {
                count ++;
                System.out.println("Number "+i+" is a Prime Number");
                if(count==5)
                {
                    System.out.println("5 Prime Number Found Exiting");
                    break;
                }
            }
        }

    }
    public static boolean isPrime(int n)
    {
        if(n == 1)
            return false;

        for(int i=2;i<=n/2;i++)
        {
            if(n%i == 0)
                return false;
        }
    return true;
    }
}
