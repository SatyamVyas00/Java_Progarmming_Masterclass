package academy.learnprograming;

import java.util.ArrayList;

public class GroceryList {
    //int[] myArray = new int[]
    private ArrayList<String> groceryList = new ArrayList<String>();
    public void addGroceryItem(String item)
    {
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList()
    {
        System.out.println("You have "+groceryList.size()+" items in your grocery list");
        for (int i=0;i<groceryList.size();i++)
        {
            System.out.println((i+1)+"."+groceryList.get(i));
        }
    }
    public void modifyGroceryItem(String currentItem,String newItem)
    {
    int position = findItem(currentItem);
    if(position>=0)
    {
        modifyGroceryItem(position,newItem);
    }
    }
    private void modifyGroceryItem(int position,String newItem)
    {
        groceryList.set(position, newItem);
        System.out.println("Grocery item "+(position+1)+" has been modfied");
    }
    public void removeGroceryItem(String item)
    {
        int position = findItem(item);
        if(position>=0)
        {
            removeGroceryItem(position);
        }
        else
        {
            System.out.println("Item does not exist in grocery list");
        }
    }
    private void removeGroceryItem(int position)
    {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    private int findItem(String searchItem)
    {
        //   boolean exists = groceryList.contains(searchItem);
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem)
    {
        int position = findItem(searchItem);
        if(position>=0)
            return true;
        else
            return false;
    }
}
