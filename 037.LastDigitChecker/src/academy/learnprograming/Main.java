package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	System.out.println("Does 41,22 & 71 has same rightmost digit:"+hasSameLastDigit(41,22,71));
        System.out.println("Does 23,32 & 42 has same rightmost digit:"+hasSameLastDigit(23,32,42));
        System.out.println("Does 9,99 & 999 has same rightmost digit:"+hasSameLastDigit(9,99,999));

        System.out.println("is 10 Valid(between 10 & 1000: "+isValid(10));
        System.out.println("is 468 Valid(between 10 & 1000: "+isValid(468));
        System.out.println("is 1051 Valid(between 10 & 1000: "+isValid(1051));
    }
        public static boolean hasSameLastDigit(int first,int second,int third)
        {
            if(!isValid(first)||!isValid(second)||!isValid(third))
            {
                return false;
            }

            int fd1=first%10;
            int sd1=second%10;
            int td1=third%10;

            if((fd1 == sd1 || fd1 == td1 || sd1 == td1))
            {
                return true;
            }
            else
                return false;
        }

        public static boolean isValid(int number)
        {
            if(number < 10 || number > 1000)
                return false;
            else
                return true;
        }
        
}
