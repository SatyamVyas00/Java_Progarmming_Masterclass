package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	shouldWakeUp(true,1);
	shouldWakeUp(false,2);
	shouldWakeUp(true,8);
	shouldWakeUp(true,-1);
    }
    public static boolean shouldWakeUp(boolean barking,int hourOfDay)
        {
            if(hourOfDay>=0 && hourOfDay<=23)
            {
                if (barking ==true && (hourOfDay < 8 || hourOfDay >22))
                {
                    System.out.println("WakeUP");
                    return true;
                }
                else
                {
                    System.out.println("Don't WakeUP");
                    return false;
                }
            }
            else
            {
                System.out.println("parameter needs to be in a range 0-23");
                return false;
            }
        }
}
