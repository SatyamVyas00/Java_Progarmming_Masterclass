package academy.learnprograming;

public class Main
{

    public static void main(String[] args)
    {
        hasTeen(9,99,19);
        hasTeen(13,15,42);
        hasTeen(22,23,34);
        isTeen(9);
        isTeen(13);
    }

    public static boolean hasTeen(int first, int second, int third)
    {
        if ((first >= 13 && first <= 19) || (second >= 13 && second <= 19) || (third >= 13 && third <= 19))
        {
            System.out.println("Numbers has a teen");
            return true;
        } else {
            System.out.println("Numbers does not have a teen");
            return false;
        }
    }

    public static boolean isTeen(int first)
    {
        if (first >= 13 && first <= 19) {
            System.out.println("Is a Teen");
            return true;
        }
            else
        {
            System.out.println("Not a Teen");
            return false;
        }
    }
}
