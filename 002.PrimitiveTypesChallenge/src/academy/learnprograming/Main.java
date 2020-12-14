package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        byte myByteNumber = 10;
        short myShortNumber = 20;
        int myIntNumber = 50;
        long myLongNumber = 50000L + 10L * (myByteNumber+myIntNumber+myShortNumber);
        System.out.println(myLongNumber);
        short shortTotal = (short)(1000+10*(myByteNumber+myIntNumber+myShortNumber));
    }
}
