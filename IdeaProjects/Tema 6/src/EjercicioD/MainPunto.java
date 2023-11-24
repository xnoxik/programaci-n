package EjercicioD;
public class MainPunto {
    public static void main(String[] args) {
        Punto punto1= new Punto(5,0);
        Punto punto2= new Punto(10,10);
        Punto punto3= new Punto(-3,7);
        punto1.imprime();
        punto2.imprime();
        punto3.imprime();
        System.out.println("De punto1 a punto2: " + punto1.distancia(punto3));
    }
}

