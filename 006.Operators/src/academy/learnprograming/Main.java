package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2; //1+2=3;
        System.out.println("1 + 2 = " + result);
        int previousresult = result;
        System.out.println("previousResult = " + previousresult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("PreviousResult = " + previousresult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 =" + result);

        result = result % 3;
        System.out.println("4 % 3 = " + result);

        //result = result + 1;
        result++;
        System.out.println("1 + 1 = " + result);

        //result = result -1;
        result--;
        System.out.println("2 - 1 =" + result);

        //result = result + 2;
        result += 2;
        System.out.println("1 + 2 = " + result);

        //result = result * 10;
        result *= 10;
        System.out.println("3 * 10 = " + result);

        //result = result / 3;
        result /= 3;
        System.out.println("30 / 3 = " + result);

        //result = result -2;
        result -= 2;
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is Not An Alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You Got The High Score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top Score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or Both of the Condition are True");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("this is TRUE");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not Suppose to Happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        double FirstdoubleVariable =20.00;
        double SeconddoubleVariable =80.00;
        double total = (FirstdoubleVariable + SeconddoubleVariable) * 100.00;
        System.out.println("Total Value = "+ total);
        double remainder = total%40.00;
        System.out.println("Remainder = " +remainder);
        boolean isZero= (remainder==0)?true:false;
        System.out.println("isZero = '" +isZero+"'");

        if(isZero==false)
        {
            System.out.println("Got a remainder");
        }
    }
}
