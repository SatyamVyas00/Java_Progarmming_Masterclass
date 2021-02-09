package academy.learnprograming;
import java.util.Scanner;
public class MinimumElement {
    public static int readInteger()
    {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    public static int[] readElements(int number)
    {
        Scanner in = new Scanner(System.in);
        int[] array = new int[number];
        for(int i=0;i<number;i++)
        {
            array[i]=in.nextInt();
        }
        return array;
    }
    public static int findMin(int[] array)
    {
        int min=array[0];
        for(int i=1;i<array.length;i++)
        {
            if(min > array[i])
                min=array[i];
        }
        return min;
    }
}