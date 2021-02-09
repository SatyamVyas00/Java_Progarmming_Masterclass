package academy.learnprograming;

public class Vechile {
private String carName;
private String size;

private  int currentVelocity;
private int currentDirection;

    public Vechile(String carName, String size) {
        this.carName = carName;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void Steer(int currentDirection)
    {
        this.currentDirection = currentDirection;
        System.out.println("Vechile.Steer(): Steering at "+ this.currentDirection +" degrees");
    }
    public void move(int currentVelocity,int currentDirection)
    {
        this.currentDirection=currentDirection;
        this.currentVelocity=currentVelocity;
        System.out.println("Vechile.move(): Moving at "+ this.currentVelocity +" in direction "+ this.currentDirection);
    }

    public String getCarName() {
        return carName;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop()
    {
        this.currentVelocity=0;
    }
}
