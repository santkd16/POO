public class Punto3D extends PuntoTiempo { 
    private int z;
    
    public Punto3D (int x, int y, int z, int t) 
    
    { super (x, y, t);
    this.setz (z);}
    
    
    public int getz () {return this.z;}
    
    public final void setz (int z) { this.zz;}
    
    @Override
    public double modulo () {
    return Math.sqrt(this.getX () * this.getX() +this.getY()* this.getY()+this.z*this.z);
    }

}
