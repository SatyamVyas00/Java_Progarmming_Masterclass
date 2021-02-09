package academy.learnprograming;

import javax.print.attribute.standard.MediaSize;

public class Main {

    public static void main(String[] args) {
	isPalindrome(-1221);
	isPalindrome(707);
	isPalindrome(11212);

    }
    public static boolean isPalindrome(int number)
    {
            int rev=0,temp=number;
            while(temp!= 0)
            {
                rev=(rev*10)+(temp%10);
                temp=temp/10;
            }

            if(number == rev)
            {
               System.out.println("Number "+ number +" is a Pallindrome");
               return true;
            }
               else
            {
                System.out.println("Number "+number+" is Not a Pallindrome");
                return false;
            }
    }
}
