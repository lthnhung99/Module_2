package lopPoin2D_3D;

public class Poin2D {
    public static void main(String[] args) {
        Poin2D poin2D = new Poin2D();
        System.out.println(poin2D);
        poin2D = new Poin2D(2, 5);
        System.out.println(poin2D);
    }

    private float x = 0.0f;
    private float y = 0.0f;

    public Poin2D() {

    }

    public Poin2D(float x, float y) {
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
         float[] xy = {x, y};
         return xy;
//         float[] xy = new float[2];
//         xy[0]=x;
//         xy[1]=y;
//         return xy;
    }

    @Override
    public String toString() {
        return "Tọa độ (x,y)= (" + x + "," + y + ")";
    }

}
