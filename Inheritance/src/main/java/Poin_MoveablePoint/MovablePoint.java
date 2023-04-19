package Poin_MoveablePoint;

import java.util.Arrays;

public class MovablePoint extends Poin {
    public static void main(String[] args) {
        MovablePoint movablePoint=new MovablePoint(1,1,2,2);
        System.out.println(movablePoint);
        System.out.println(Arrays.toString(movablePoint.move()));


    }
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {

    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed, float x, float y) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        float [] speed = {getXSpeed(),getYSpeed()};
        return speed;
    }
    @Override
    public String toString() {
        return "(" + super.getX() + ", " + super.getY() + ")," + "speed = (" + xSpeed + ", " + ySpeed + ")";
    }

    public float [] move() {
        float move[]={getX() + xSpeed,getY() + ySpeed};
        return move;
    }
}
