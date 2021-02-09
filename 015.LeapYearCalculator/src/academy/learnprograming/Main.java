package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	isLeapYear(-1600);
	isLeapYear(1600);
	isLeapYear(2017);
	isLeapYear(2000);
    }
        public static boolean isLeapYear(int year)
        {
            if(year >=1 && year <=9999)
            {
                if(year%4==0)
                {
                    if (year % 100 == 0)
                    {
                        if (year % 400 == 0)
                        {
                            System.out.println("It is a Leap Year");
                            return true;
                        }
                        else
                        {
                            System.out.println("It is not a Leap Year");
                            return false;
                        }
                    }
                    else
                        {
                        System.out.println("It is a Leap Year");
                        return true;
                        }
                }
                else
                {
                    System.out.println("It is a not Leap Year");
                    return false;
                }
            }
            else
            {
                System.out.println("Year Parameter Not in Range (1-9999)");
                return false;
            }
        }
}
