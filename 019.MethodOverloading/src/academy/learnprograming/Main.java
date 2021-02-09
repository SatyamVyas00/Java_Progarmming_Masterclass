package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	    int newScore = calculateScore("Satyam",500);
        System.out.println("New Score is "+newScore);
        calculateScore(75);
        calculateScore();

        calcFeetAndInchesToCentimeters(6,0);
        calcFeetAndInchesToCentimeters(7,5);
        calcFeetAndInchesToCentimeters(157);
    }

    /* Exercise  Start */

    public static double calcFeetAndInchesToCentimeters(double feet,double inches)
    {
        if(feet>=0 && (inches >=0 && inches<=12))
        {
            double centimeters = ((feet*12*2.54)+(inches*2.54));
            System.out.println(feet +" feet, "+ inches +" inches = "+ centimeters +" centimeters");
            return (centimeters);
        }
        else
        {
           System.out.println("Invalid Parameters");
           return -1;
        }

    }
    public static double calcFeetAndInchesToCentimeters(double inches)
    {
        if(inches >=0)
        {
            System.out.println(inches+" inches is equal to "+(int)inches/12+" feet and "+(int)inches%12+" inches");
            calcFeetAndInchesToCentimeters((int)inches/12,(int)inches%12);
            return (inches/12);
        }
        else
        {
            System.out.println("Invalid Parameters");
            return -1;
        }
    }

    /* Exercise  End */

    public static int calculateScore(String playerName,int score)
    {
        System.out.println("Player "+ playerName + "scored "+score+" points");
        return score*1000;
    }
    public static int calculateScore(int score)
    {
        System.out.println("Unnamed Player scored "+score+" points");
        return 0;
    }
    public static int calculateScore()
    {
        System.out.println("No  Player Name, no player score");
        return 0;
    }
}
