package academy.learnprograming;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest()
    {
     System.out.println("Fish.rest() is called");
    }
    private void moveMuscles()
    {
        System.out.println("Fish.moveMuscles() is called");
    }
    private void moveBackFin()
    {
        System.out.println("Fish.moveBackFin() is called");
    }
    private void swim(int speed)
    {
        System.out.println("Fish.swim() is called");
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
