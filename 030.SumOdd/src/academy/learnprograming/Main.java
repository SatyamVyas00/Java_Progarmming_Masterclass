package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	sumOdd(1,100);
	sumOdd(-1,100);
	sumOdd(100,100);
	sumOdd(13,13);
	sumOdd(100,-100);
	sumOdd(100,1000);
    }
        public static boolean isOdd(int number)
        {
            if(number < 0) {
                System.out.println("Invalid Value");
                return false;
            }
                else
            {
                if(number%2==1) {
                    System.out.println(number + " is Odd");
                    return true;
                }
                else
                    return false;
            }
        }
        public static int sumOdd(int start,int end)
        {
            if(start>0 && end>0 && end>=start)
            {
                int sum=0;
                for(int i=start;i<=end;i++)
                {
                    if(isOdd(i))
                        sum=sum+i;
                }
                System.out.println("Sum of odd numbers between "+start+" and "+end+" is: "+sum );
                return sum;
            }
            else
                System.out.println("Invalid Value");
                return -1;
        }
}
