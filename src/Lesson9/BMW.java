package Lesson9;

public class BMW implements Firstinterface { //имплементация ctrl + o
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void start() {
        System.out.println("Bmw start");
    }

    @Override
    public void stop() {
        System.out.println("Bmw stop");
    }

    @Override
    public void signal() {
        System.out.println("Bmw bip");
    }

    @Override
    public void changeSpeed(int newSpeed) {
        setSpeed(getSpeed()+newSpeed);
    }

}
