package academy.learnprograming;

public class Main extends MinimumElement{

    public static void main(String[] args) {
	int number = readInteger();
	int[] array = readElements(number);
	System.out.println("Smallest Number in Array is: "+findMin(array));

    }
}
