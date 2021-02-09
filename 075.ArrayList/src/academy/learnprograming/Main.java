package academy.learnprograming;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private static Scanner in = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
	boolean quit = false;
	int choice = 0 ;
	printInstructions();
	while(!quit)
    {
        System.out.println("Enter Your Choice: ");
        choice = in.nextInt();
        in.nextLine();

        switch (choice)
        {
            case 0:
                printInstructions();
                break;
            case 1:
                groceryList.printGroceryList();
                break;
            case 2:
                addItem();
                break;
            case 3:
                modifyItem();
                break;
            case 4:
                removeItem();
                break;
            case 5:
                searchForItem();
                break;
            default:
                quit=true;
        }
    }

	//Copying ArrayList
        ArrayList<String> newArrayList = new ArrayList<String>(groceryList.getGroceryList());
	//OR
        newArrayList.addAll(groceryList.getGroceryList());
    //ArrayList To Array
        String[] myArray = new String[groceryList.getGroceryList().size()];
         myArray = groceryList.getGroceryList().toArray(myArray);

    }

    public static void printInstructions()
    {
        System.out.println("Press :");
        System.out.println("\t 0 - To print Choice Options");
        System.out.println("\t 1 - To print list of Grocery Item");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To Search for an item in the list");
        System.out.println("\t 6 - To Quit the Application");
    }

    public static void addItem()
    {
        System.out.println("Please Enter the Grocery Item: ");
        groceryList.addGroceryItem(in.nextLine());
    }
    public static void modifyItem()
    {
        System.out.println("Enter Item to replace:");
        String currentItem = in.nextLine();
        System.out.println("Enter Replacement Item: ");
        String newItem = in.nextLine();
        groceryList.modifyGroceryItem(currentItem,newItem);
    }
    public static void removeItem()
    {
        System.out.println("Enter Item to remove:");
        String itemName = in.nextLine();
        groceryList.removeGroceryItem(itemName);
    }
    public static void searchForItem()
    {
        System.out.println("Enter Item to Search For: ");
        String searchItem=in.nextLine();
        if(groceryList.onFile(searchItem))
        {
            System.out.println("Found "+searchItem+" in our grocery List");
        }
        else
        {
            System.out.println(searchItem+" is not in the grocery list");
        }
    }
}
