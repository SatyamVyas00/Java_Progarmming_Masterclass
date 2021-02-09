package academy.learnprograming;

public class Kitchen {
    private int no_of_gasCylinder;
    private int no_of_Refrigerator;
    private int no_of_kitchenWare;

    public Kitchen(int no_of_gasCylinder, int no_of_Refrigerator, int no_of_kitchenWare) {
        this.no_of_gasCylinder = no_of_gasCylinder;
        this.no_of_Refrigerator = no_of_Refrigerator;
        this.no_of_kitchenWare = no_of_kitchenWare;
    }

    public int getNo_of_gasCylinder() {
        return no_of_gasCylinder;
    }

    public int getNo_of_Refrigerator() {
        return no_of_Refrigerator;
    }

    public int getNo_of_kitchenWare() {
        return no_of_kitchenWare;
    }
}
