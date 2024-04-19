public class Punto { 
    private int x, y;
    
    public Punto (int x, int y) { 
    this.x=x; 
    this.y=y;
    
    }
    
    public Punto (){
        
        this.x=0;
        this.y=0;
                  }
     
    
    
    public final void setX (int x) {this.x = x; }
    
    public final void sety (int y) {this.y = y; }
    
    public int getX () {return this.x;} 
    public int getY() {return this.y;}
    
    public double modulo () 
    {
    return Math.sqrt((this.x *this.x) +(this.y* this.y));
    }

}

