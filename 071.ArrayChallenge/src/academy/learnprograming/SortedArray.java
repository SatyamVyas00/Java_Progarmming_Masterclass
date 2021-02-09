package academy.learnprograming;
import java.util.Scanner;
public class SortedArray {


    public static int[] getIntegers(int number)
    {
        Scanner in =new Scanner(System.in);
        int[] array = new int[number];
        for (int i=0;i<number;i++)
        {
            array[i]=in.nextInt();
        }

        return array;
    }
    public static void printArray(int[] array)
    {
        for (int i=0;i<array.length;i++)
        {
            System.out.println("Element "+i+" contents "+array[i]);
        }
    }
    public static int[] sortIntegers(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            for (int j=0;j<array.length;j++)
            {
                if(array[i]>array[j])
                {
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }
}
