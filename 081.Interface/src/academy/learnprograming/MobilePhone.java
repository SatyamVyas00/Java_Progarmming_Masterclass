package academy.learnprograming;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile Phone PoweredUP");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn)
            System.out.println("Now Ringing " + phoneNumber + " on MobilePhone");
        else
            System.out.println("Phone is Switched OFF");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the Mobile Phone");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Ringtone");
        } else {
            isRinging = false;
            System.out.println("Mobile Phone not On or number different");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
