package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	checkNumber(10);
	checkNumber(0);
	checkNumber(-10);
    }
    public static void checkNumber(int number)
    {
        if(number > 0)
            System.out.println("Positive");
        else if(number == 0)
            System.out.println("Zero");
        else if(number < 0)
            System.out.println("Negative");
    }
}
