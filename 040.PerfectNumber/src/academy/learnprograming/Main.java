package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	System.out.println("is 6 a Perfect Number: "+isPerfectNumber(6));
        System.out.println("is 28 a Perfect Number: "+isPerfectNumber(28));
        System.out.println("is 5 a Perfect Number: "+isPerfectNumber(5));
        System.out.println("is -1 a Perfect Number: "+isPerfectNumber(-1));
    }
        public static boolean isPerfectNumber(int number)
        {
            if(number < 1)
                return false;

            int sum=0;
            for(int i=1;i<number;i++)
            {
                if(number%i == 0)
                {
                    sum=sum+i;
                }
            }
           return(number == sum);
        }
}
