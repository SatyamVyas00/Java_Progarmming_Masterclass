package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        System.out.println("Numbers of digit in 0 is: "+getDigitCount(0));
        System.out.println("Numbers of digit in 123 is: "+getDigitCount(123));
        System.out.println("Numbers of digit in -12 is: "+getDigitCount(-12));
        System.out.println("Numbers of digit in 5200 is: "+getDigitCount(5200));

        System.out.println("reverse of -121 is: "+reverse(-121));
        System.out.println("reverse of 1212 is: "+reverse(1212));
        System.out.println("reverse of 1234 is: "+reverse(1234));
        System.out.println("reverse of 100 is: "+reverse(100));

        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }
        public static void numberToWords(int number)
        {
            if(number < 0)
                System.out.println("Invalid Value");
            System.out.println("");
            int count=getDigitCount(number);
            number=reverse(number);
            for(int i =1 ;i<=count;i++)
            {
                int n=number%10;
                if(n == 0)
                    System.out.print("Zero ");
                else if(n == 1)
                    System.out.print("One ");
                else if(n == 2)
                    System.out.print("Two ");
                else if(n == 3)
                    System.out.print("Three ");
                else if(n == 4)
                    System.out.print("Four ");
                else if(n == 5)
                    System.out.print("Five ");
                else if(n == 6)
                    System.out.print("Six ");
                else if(n == 7)
                    System.out.print("Seven ");
                else if(n == 8)
                    System.out.print("Eight ");
                else if(n == 9)
                    System.out.print("Nine ");

                number=number/10;
            }
        }

        public static int getDigitCount(int number)
        {
            if(number < 0)
                return -1;
            if(number == 0)
                return 1;

            int count=0;
            while(number!=0)
            {
                count++;
                number=number/10;
            }
            return count;
        }
        public static int reverse(int number)
        {
            int rev=0;
            while(number!=0)
            {
                rev=(rev*10)+number%10;
                number=number/10;
            }
            return rev;
        }
}
