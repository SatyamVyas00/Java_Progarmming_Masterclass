package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	areEqualByThreeDecimalPlaces(-3.1756,-3.175);
	areEqualByThreeDecimalPlaces(3.175,3.176);
	areEqualByThreeDecimalPlaces(3.0,3.0);
	areEqualByThreeDecimalPlaces(-3.123,3.123);
    }
    public static boolean areEqualByThreeDecimalPlaces(double first,double second)
    {
        if((int)(first*1000)==(int)(second*1000))
        {
            System.out.println("Numbers are Equal");
            return true;
        }
        else
            System.out.println("Numbers are not Equal");
            return false;
    }
}
