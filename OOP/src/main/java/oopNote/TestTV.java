package oopNote;

public class TestTV {
    public static void main(String[] args) {
        TestTV tv1 = new TestTV();
        tv1.turnOn();
        tv1.setChanel(30);
        tv1.setVolume(3);
        TestTV tv2 = new TestTV();
        tv2.turnOn();
        tv2.chanelUp();
        tv2.chanelUp();
        tv2.volumeUp();
        System.out.println(tv1.chanel + " - " + tv1.volumeLevel);
        System.out.println(tv2.chanel + " - " + tv2.volumeLevel);



    }

    int chanel = 1;
    int volumeLevel = 1;
    boolean on = false;

    public TestTV() {

    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChanel(int newChanel) {
        if (on && newChanel >= 1 && newChanel <= 120)
            chanel = newChanel;
    }
    public void setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
            volumeLevel=newVolumeLevel;
    }

    public void chanelUp() {
        if (on && chanel < 120)
            chanel++;
    }

    public void chanelDown() {
        if (on && chanel > 1)
            chanel--;
    }

    public void volumeUp() {
        if (on && volumeLevel < 7)
            volumeLevel++;
    }

    public void volumeDown() {
        if (on && volumeLevel > 1)
            volumeLevel--;
    }
}
