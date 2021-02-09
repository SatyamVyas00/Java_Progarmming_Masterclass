package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	int count=1;
	while(count!=6)
    {
        System.out.println("Count Value is "+ count);
        count++;
    }
	count=1;
    do {
        System.out.println("Count Value was " + count);
        count++;
    }while (count!=6);

    //Challenge
 /*
        int number=4;
        int finishNumber=20;
        while(number <= finishNumber)
        {
            number++;
            if(!isEvenNumber(number))
            {
                continue;
            }

            System.out.println("Even Number "+ number);
        }

  */
        int number=4;
        int finishNumber=20;
        int evenNumberFound=0;
        while(number <= finishNumber)
        {
            number++;
            if(!isEvenNumber(number))
            {
                continue;
            }
            evenNumberFound++;
            System.out.println("Even Number "+ number);
            if (evenNumberFound>=5)
            {
                break;
            }
        }
        System.out.println("Total even Number Found = "+evenNumberFound);
    }

    public static boolean isEvenNumber(int number) {
        if(number%2==0)
            return true;
        else
            return false;
    }
}
