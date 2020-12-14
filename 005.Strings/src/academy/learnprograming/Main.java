package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	    //byte
        // short
        //int
        //long
        //float
        //double
        //char
        //boolean

        String myString = "This is a String";
        System.out.println("myString is equal to "+myString);
        myString = myString + " and this is more";
        System.out.println("myString is equal to "+myString);
        myString = myString + " \u00A9 2020";
        System.out.println("myString is equal to "+myString);

        String numberString = "20.20";
        numberString = numberString + "20.21";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString =lastString +myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);
    }
}
