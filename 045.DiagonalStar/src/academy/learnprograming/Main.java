package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        System.out.println("Square Star of 5:");
        printSquareStar(5);
	System.out.println("Square Star of 8:");
        printSquareStar(8);
    }
        public static void printSquareStar(int number)
        {
            for(int i=0;i<number;i++)
            {
                for(int j=0;j<number;j++)
                {
                    if(i==0 || i==(number-1) ||j==0 || j==(number-1))
                        System.out.print("*");
                   else if(i==j)
                        System.out.print("*");
                   else if(i+j==(number-1))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println("");
            }
        }
}
