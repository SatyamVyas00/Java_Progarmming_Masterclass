package academy.learnprograming;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");
    public static void main(String[] args) {
//    Gearbox mcLaren = new Gearbox(6);
//    mcLaren.operativeClutch(true);
//    mcLaren.changeGear(1);
//    mcLaren.operativeClutch(false);
//    System.out.println(mcLaren.wheelSpeed(1000));
//    mcLaren.changeGear(2);
//    System.out.println(mcLaren.wheelSpeed(3000));
//    mcLaren.operativeClutch(true);
//    mcLaren.changeGear(3);
//    mcLaren.operativeClutch(false);
//    System.out.println(mcLaren.wheelSpeed(6000));

        class ClickListener implements Button.OnClickListener{
        public ClickListener()
        {
            System.out.println("I've been  attached");
        }

            @Override
            public void onClick(String title) {
                System.out.println(title +" was clicked");
            }
        }
        btnPrint.setOnClickListener(new ClickListener());
        listen();
    }
    private static void listen()
    {
        boolean quit = false;
        while(!quit)
        {
            int choice =scanner.nextInt();
            scanner.nextLine();
            switch (choice)
            {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
