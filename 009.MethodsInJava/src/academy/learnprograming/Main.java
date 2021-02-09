package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        int highScore=calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your Final Score is = "+highScore);

        gameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore=calculateScore(gameOver,score,levelCompleted,bonus);

        System.out.println("Your Final Score is = "+highScore);


        int highScorePosition=calculateHighScore(1500);
        displayHighScore("S1",highScorePosition);
        highScorePosition=calculateHighScore(900);
        displayHighScore("S2",highScorePosition);
        highScorePosition=calculateHighScore(400);
        displayHighScore("S3",highScorePosition);
        highScorePosition=calculateHighScore(50);
        displayHighScore("S4",highScorePosition);
    }

    public static void displayHighScore(String playersName,int highScorePosition)
    {
        System.out.println(playersName+" Managed to get Position "+highScorePosition+" on the High Score Table");
    }

    public static int calculateHighScore(int playersScore)
    {
        /*
        if(playersScore>=1000)
            return 1;
        else if(playersScore>=500)
            return 2;
        else if(playersScore>=100)
            return 3;
        else
            return 4;
         */

        int position =4;

        if(playersScore>=1000)
            position= 1;
        else if(playersScore>=500)
            position= 2;
        else if(playersScore>=100)
            position= 3;

        return position;
    }
    
    public  static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
    {
        int finalScore;
        if(gameOver)
        {
            finalScore=score+(levelCompleted*bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }
}
