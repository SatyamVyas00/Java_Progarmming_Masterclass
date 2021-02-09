package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        int caseNumber =5;

	switch (caseNumber)
    {
        case 1:
            System.out.println("It is Case 1");
            break;
        case 2:
            System.out.println("It is Case 2");
            break;
        case 3:
            System.out.println("It is Case 3");
            break;
        default:
            System.out.println("It is a default Case");
            break;
    }

    char caseChar = 'C';
    switch (caseChar)
    {
        case 'A':
            System.out.println("Found A");
            break;
        case 'B':
            System.out.println("Found B");
            break;
        case 'C':
            System.out.println("Found C");
            break;
        case 'D':
            System.out.println("Found D");
            break;
        case 'E':
            System.out.println("Found E");
            break;
        default:
            System.out.println("Not Found A,B,C,D or E");
    }
    }
}
