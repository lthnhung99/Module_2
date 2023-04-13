package org.example;

public class Fan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.fast);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setStatus(true);
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.medium);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setStatus(false);
        System.out.println(fan2.toString());


    }
    final int slow = 1;
    final int medium =2;
    final int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    private Fan() {

    }
    public void setSpeed(int speed) {
        this.speed=speed;
    }
    public void setStatus(boolean on) {
        this.on = on;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color=color;
    }
    public int getSpeed(int speed) {
        return speed;
    }
    public boolean getStatus(boolean on) {
        return on;
    }
    public double getRadius(double radius) {
        return radius;
    }
    public String getcolor(String color) {
        return color;
    }
    public String toString() {
        if(on)
            return "Fan is on \nSpeed: " + speed + ", Status: " + on + ", Radius: " + radius + ", Color: " + color;
        else
            return  "Fan is off \nRadius: " + radius + ", Color: " + color;
    }
}
