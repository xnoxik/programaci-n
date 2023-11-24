package SegundaParte.Triángulo;

public class MainTriangulo {
    public static void main(String[] args) {
        Triangulo punto1 = new Triangulo(3,4);
        Triangulo punto2 = new Triangulo(9,5);
        Triangulo punto3 = new Triangulo(5,7);
        punto1.imprime();
        punto2.imprime();
        punto3.imprime();
        System.out.print("El perimetro del triángulo es: ");
        System.out.println((punto1.distancia(punto2)) + (punto2.distancia(punto3)) + (punto3.distancia(punto1)));
    }
}
