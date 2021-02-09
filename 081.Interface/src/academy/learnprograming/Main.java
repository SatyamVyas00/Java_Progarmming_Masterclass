package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	ITelephone phone;
	phone = new DeskPhone(12345);
    phone.powerOn();
    phone.callPhone(12345);
    phone.answer();

    phone = new MobilePhone(54321);
    phone.powerOn();
    phone.callPhone(54321);
    phone.answer();

    }
}
