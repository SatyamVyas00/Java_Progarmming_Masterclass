package academy.learnprograming;
import java.util.Scanner;
public class Main {

	private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
//	int[] myIntArray = new int[10]; /*   ={1,2,3,4,5,6,7,8,9};   */
//	System.out.println(myIntArray[0]);
//	System.out.println(myIntArray[5]);
//	System.out.println(myIntArray[9]);
//		for(int i=0;i<10;i++)
//		{
//			myIntArray[i]=i*10;
//		}
//		for (int i =0 ; i<myIntArray.length;i++)
//		{
//			System.out.println("Element "+i+" value is "+myIntArray[i]);
//		}



		int[] myIntegers = getIntegers(5);

		for(int i=0;i<myIntegers.length;i++)
		{
			System.out.println("Element "+i+" typed value was "+myIntegers[i]);
		}

		System.out.println("The Average of the Array is: "+getAverage(myIntegers));
    }
    public static int[] getIntegers(int number)
	{
		System.out.println("Enter "+number+" integer values: ");
		int[] values = new int[number];

		for (int i =0 ; i<values.length;i++)
		{
			values[i]=in.nextInt();
		}

		return values;
	}
	public static double getAverage(int[] array)
	{
		int sum=0;
		for (int i=0;i<array.length;i++)
		{
			sum+=array[i];
		}

		return (double) sum/(double) array.length;
	}
}
