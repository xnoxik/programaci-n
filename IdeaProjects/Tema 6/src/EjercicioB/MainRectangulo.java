package EjercicioB;

public class MainRectangulo {
    public static void main(String[] args) {

        Rectangulo rectangulo1=new Rectangulo(7,8,8,7);
        System.out.println("(" + rectangulo1.x1 +","+ rectangulo1.y1 + ")(" + rectangulo1.x2 + "," + rectangulo1.y2 + ")");
        System.out.println("Rectángulo ");
        System.out.println("Coordenadas: ("+ rectangulo1.x1+","+rectangulo1.y1+")("+rectangulo1.x2+","+rectangulo1.y2+")");
        System.out.println("Perímetro: " + rectangulo1.perimetro);
        System.out.println("Área: " + rectangulo1.area);
    }
}
