package academy.learnprograming;

import javax.swing.plaf.synth.SynthDesktopIconUI;

public class Main {

    public static void main(String[] args) {
	    int Sum=0,count=0;
        for(int i=1;i<=1000;i++)
    {
        if(i%3==0 && i%5==0)
        {
            Sum = Sum + i;
            count++;
            System.out.println("Found Number ="+i);
        }
        if(count==5)
            break;
    }
        System.out.println("Sum of 5 numbers Divisible by both 3 and 5 are:"+Sum);
    }
}
