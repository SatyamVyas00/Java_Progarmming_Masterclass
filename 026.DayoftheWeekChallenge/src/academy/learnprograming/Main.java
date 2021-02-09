package academy.learnprograming;

public class Main {
    public static void main(String[] args) {
	printDayOftheWeek(-1);
	printDayOftheWeek(0);
	printDayOftheWeek(1);
	printDayOftheWeek(2);
	printDayOftheWeek(3);
	printDayOftheWeek(4);
	printDayOftheWeek(5);
	printDayOftheWeek(6);
	printDayOftheWeek(7);
	printDayOftheWeek(8);
    }
    
    public static void printDayOftheWeek(int day)
    {
        switch (day)
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thrusday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}
