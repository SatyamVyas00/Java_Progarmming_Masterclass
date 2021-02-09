package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        hasEqualSum(1,1,1);
        hasEqualSum(1,1,2);
        hasEqualSum(1,-1,0);
    }
    public static boolean hasEqualSum(int first,int second,int third)
    {
            if (first + second == third)
            {
            System.out.println("Sum is equal");
            return true;
            }
            else
            {
            System.out.println("Sum is not equal");
            return false;
            }
    }
}

