package EjercicioC;

public class MainRectangulo {
    public static void main(String[] args) {
        Rectangulo rectangulo1= new Rectangulo(2,6,8,9);
        Rectangulo rectangulo2= new Rectangulo(7,9,10,12);
        System.out.println("Rectángulo 1 ");
        System.out.println("Coordenadas: ("+ rectangulo1.getX1()+","+rectangulo1.getY1()+")("+rectangulo1.getX2()+","+rectangulo1.getY2()+")");
        System.out.println("Perímetro: " + rectangulo1.getPerimetro());
        System.out.println("Área: " + rectangulo1.getArea());
        System.out.println("Rectángulo 2 ");
        System.out.println("Coordenadas: ("+ rectangulo2.getX1()+","+rectangulo2.getY1()+")("+rectangulo2.getX2()+","+rectangulo2.getY2()+")");
        System.out.println("Perímetro: " + rectangulo2.getPerimetro());
        System.out.println("Área: " + rectangulo2.getArea());
    }
}
