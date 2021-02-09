package academy.learnprograming;

public class Doors {
    private int no_of_doors;

    public Doors(int no_of_doors) {
        this.no_of_doors = no_of_doors;
    }

    public int getNo_of_doors() {
        return no_of_doors;
    }

    public void MainDoor()
    {
        System.out.println("Entering the Room through Main DOOR");
    }
}
