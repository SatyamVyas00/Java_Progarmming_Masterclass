package academy.learnprograming;

public class Main extends SortedArray {

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }
}
