import java.util.Scanner;

// Clase Punto
public class Punto {
    private int x, y;

    public Punto(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public Punto() {
        this(0, 0);
    }

    public final void setX(int x) {
        this.x = x;
    }

    public final void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public double modulo() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
}

public class PuntoTiempo extends Punto {
    private int t;

    public PuntoTiempo() {
        super();
        this.setT(0);
    }

    public PuntoTiempo(int x, int y, int t) {
        super(x, y);
        this.setT(t);
    }

    public int getT() {
        return this.t;
    }

    public final void setT(int t) {
        this.t = t;
    }

    public double velocidad() {
        return this.modulo() / this.getT();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la coordenada x del punto:");
        int x = scanner.nextInt();
        System.out.println("Ingrese la coordenada y del punto:");
        int y = scanner.nextInt();

        Punto punto = new Punto(x, y);

        System.out.println("Coordenadas del punto creado: (" + punto.getX() + ", " + punto.getY() + ")");

        System.out.println("Ingrese la coordenada x del punto-tiempo:");
        x = scanner.nextInt();
        System.out.println("Ingrese la coordenada y del punto-tiempo:");
        y = scanner.nextInt();
        System.out.println("Ingrese el tiempo del punto-tiempo:");
        int t = scanner.nextInt();

        PuntoTiempo puntoTiempo = new PuntoTiempo(x, y, t);


        System.out.println("Coordenadas del punto-tiempo creado: (" + puntoTiempo.getX() + ", " + puntoTiempo.getY() + ")");
        System.out.println("Tiempo del punto-tiempo creado: " + puntoTiempo.getT());

        scanner.close();
    }
}
