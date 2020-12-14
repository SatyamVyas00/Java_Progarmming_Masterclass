package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        // 1 mile is equal to 1.609344 kilometers
        double kilometer = (100*1.609344);
        int highscore = 50;

        if(highscore == 50)
        {
            System.out.println("This is an Expression");
        }

        // In the following code, write down the parts that are expressions
        int score =100;
        if(score>99)
        {
            System.out.println("You got the High Score");
            score = 0 ;
        }

        /*
        Expressions in Above Statement are:
        score = 100
        score > 99
        "You got the High Score"
        score = 0
        */
    }
}
