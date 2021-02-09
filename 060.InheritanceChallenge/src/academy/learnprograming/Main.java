package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
    Outlander outlander = new Outlander(36);
    outlander.accelerate(30);
    System.out.println("");
    outlander.Steer(45);
    outlander.accelerate(20);
    System.out.println("");
    outlander.accelerate(-42);
    }
}
