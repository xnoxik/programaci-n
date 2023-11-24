package EjercicioB;

public class MainPunto {
    public static void main(String[] args) {
        Punto coordenada1 = new Punto(5,0);
        Punto coordenada2 = new Punto(10,10);
        Punto coordenada3 = new Punto(-3,7);
        System.out.println("(" + coordenada1.x + "," + coordenada1.y + ")");
        System.out.println("(" + coordenada2.x + "," + coordenada2.y + ")");
        System.out.println("(" + coordenada3.x + "," + coordenada3.y + ")");
    }
}
