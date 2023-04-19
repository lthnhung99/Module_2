package Poin_MoveablePoint;

public class Poin {
    public static void main(String[] args) {
        Poin poin = new Poin();
        System.out.println(poin);
        poin = new Poin(2,3);
        System.out.println(poin);
    }
    private float x = 0.0f;
    private float y = 0.0f;

    public Poin() {

    }

    public Poin(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        float[] xy = {x,y};
        return xy;
    }
    @Override
    public String toString() {
        return "Tọa độ (x,y)= (" + getX() + "," + getY() + ")";
    }
}
