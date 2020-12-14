package academy.learnprograming;


public class Main {

    public static void main(String[] args) {
        float myMinFloatValue=Float.MIN_VALUE;
        float myMaxFloatValue=Float.MAX_VALUE;
        System.out.println("Float Max Value = " +(myMaxFloatValue));
        System.out.println("Float Min Value = " +(myMinFloatValue));

        double myMinDoubleValue=Double.MIN_VALUE;
        double myMaxDoubleValue=Double.MAX_VALUE;
        System.out.println("Double Max Value = " +(myMaxDoubleValue));
        System.out.println("Double Min Value = " +(myMinDoubleValue));

        int myIntValue = 5/3;
        float myFloatValue = 5f/3f;
        double myDoubleValue = 5.00/3.00;
        System.out.println("MyIntValue = " +myIntValue);
        System.out.println("MyFloatValue = " +myFloatValue);
        System.out.println("MyDoubleValue = " +myDoubleValue);


        double numberOfPounds = 200;
        double ConvertedKilogram = numberOfPounds*0.45359237d;
        System.out.println("ConvertedKilogram = " +ConvertedKilogram);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}

