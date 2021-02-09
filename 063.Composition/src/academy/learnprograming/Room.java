package academy.learnprograming;

public class Room {
    private Windows windows;
    private Doors doors;
    private Kitchen kitchen;
    private Washroom washroom;

    public Room(Windows windows, Doors doors, Kitchen kitchen, Washroom washroom) {
        this.windows = windows;
        this.doors = doors;
        this.kitchen = kitchen;
        this.washroom = washroom;
    }

    public Windows getWindows() {
        return windows;
    }

    public Doors getDoors() {
        return doors;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public Washroom getWashroom() {
        return washroom;
    }

}
