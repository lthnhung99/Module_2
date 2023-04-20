package lopPoin2D_3D;

public class Poin3D extends Poin2D {
    public static void main(String[] args) {
        Poin3D poin3D = new Poin3D();
        System.out.println(poin3D);
        poin3D = new Poin3D(3,5,4);
        System.out.println(poin3D);
    }
    private float z = 0.0f;

    public Poin3D() {

    }

    public Poin3D(float z) {
        this.z = z;
    }

    public Poin3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float [] getXYZ() {
        float [] xyz = {getX(),getY(),getZ()};
        return xyz;
    }
    @Override
    public String toString() {
        return "Tọa độ (x,y,z)= (" + super.getX() + "," + super.getY() + "," + z + ")";
    }
}
