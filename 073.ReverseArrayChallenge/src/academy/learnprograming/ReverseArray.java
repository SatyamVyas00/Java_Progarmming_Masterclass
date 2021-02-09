package academy.learnprograming;

public class ReverseArray {
    public static void reverse(int[] array)
    {
        int[] ReverseArray = new int[array.length];
        int number = (array.length-1);
        for(int i=0;i<array.length;i++)
        {
            ReverseArray[i]=array[number];
            number--;
        }
        System.out.print("Array = [");
        for (int i=0;i<array.length;i++)
        {
            System.out.print(array[i]);
            if(i<(array.length-1))
            {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.print("\nReversed Array = [");
        for (int i=0;i<ReverseArray.length;i++)
        {
            System.out.print(ReverseArray[i]);
            if(i<(ReverseArray.length-1))
            {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
