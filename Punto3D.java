
public class Punto3D extends PuntoTiempo {
    private int z;

    public Punto3D(int x, int y, int z, int t) {
        super(x, y, t);
        this.setZ(z);
    }

    public int getZ() {
        return this.z;
    }

    public final void setZ(int z) {
        this.z = z;
    }

    @Override
    public double modulo() {
        return Math.sqrt(this.getX() * this.getX() + this.getY() * this.getY() + this.z * this.z);
    }
}
