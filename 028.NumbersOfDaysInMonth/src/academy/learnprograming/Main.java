package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	getDaysInMonth(1,2020);
	getDaysInMonth(2,2020);
	getDaysInMonth(2,2018);
	getDaysInMonth(-1,2020);
	getDaysInMonth(1,-2020);
    }
        public static boolean isLeapYear(int year) {
            if (year >= 1 && year <= 9999) {
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            System.out.println("It is a Leap Year");
                            return true;
                        } else {
                            System.out.println("It is not a Leap Year");
                            return false;
                        }
                    } else {
                        System.out.println("It is a Leap Year");
                        return true;
                    }
                } else {
                    System.out.println("It is a not Leap Year");
                    return false;
                }
            } else {
                System.out.println("Year Parameter Not in Range (1-9999)");
                return false;
            }
        }
        public static int getDaysInMonth(int month,int year)
        {
            if((year >=1 && year <=9999)&&(month >=1 && month<=12))
            {
                switch(month)
                {
                    case 1:
                        System.out.println("31");
                        return 31;
                    case 2:
                        if(isLeapYear(year))
                        {
                            System.out.println("29");
                            return 29;
                        }
                        else
                        {
                            System.out.println("28");
                            return 28;
                        }
                    case 3:
                        System.out.println("31");
                        return 31;
                    case 4:
                        System.out.println("30");
                        return 30;
                    case 5:
                        System.out.println("31");
                        return 31;
                    case 6:
                        System.out.println("30");
                        return 30;
                    case 7:
                        System.out.println("31");
                        return 31;
                    case 8:
                        System.out.println("31");
                        return 31;
                    case 9:
                        System.out.println("30");
                        return 30;
                    case 10:
                        System.out.println("31");
                        return 31;
                    case 11:
                        System.out.println("30");
                        return 30;
                    case 12:
                        System.out.println("31");
                        return 31;
                    default:
                        System.out.println("Invalid Input");
                        return -1;
                }
            }
            else {
                System.out.println("Invalid Input");
                return -1;
            }
        }
}
