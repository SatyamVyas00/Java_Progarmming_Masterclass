package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	String numberAsString = "2020.12345";
	System.out.println("numberAsString = "+numberAsString);

	double number = Double.parseDouble(numberAsString);
	System.out.println("number = "+number);

	numberAsString += 1;
	number += 1;
	System.out.println("After Adding 1");
	System.out.println("numberAsString = "+numberAsString);
	System.out.println("number = "+number);


    }
}
