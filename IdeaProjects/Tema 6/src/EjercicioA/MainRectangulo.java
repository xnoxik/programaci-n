package EjercicioA;

public class MainRectangulo {
/**En el main de la clase principal instancia 2 objetos EjercicioA.Rectangulo en (0,0)(5,5) y (7,9)(2,3).
 Muestra por pantalla sus coordenadas, perímetros (suma de lados) y áreas (ancho x alto).
 Modifica todas las coordenadas como consideres y vuelve a imprimir coordenadas,
 perímetros y áreas.**/
    public static void main(String[] args) {
        int mayorx1, menorx1, mayorx2, menorx2,mayory1, menory1, mayory2, menory2;
        /**Crear el primer objeto**/
        Rectangulo rectangulo1=new Rectangulo();
        rectangulo1.x1=0;
        rectangulo1.y1=0;
        rectangulo1.x2=5;
        rectangulo1.y2=5;
        if (rectangulo1.x1> rectangulo1.x2){
            mayorx1= rectangulo1.x1;
            menorx1= rectangulo1.x2;
        }else {
            mayorx1 = rectangulo1.x2;
            menorx1 = rectangulo1.x1;
        }
        if (rectangulo1.y1> rectangulo1.y2){
            mayory1= rectangulo1.y1;
            menory1= rectangulo1.y2;
        }else {
            mayory1 = rectangulo1.y2;
            menory1 = rectangulo1.y1;
        }
        int perimetro1=2*(mayorx1-menorx1)+2*(mayory1-menory1);
        int area1= (mayorx1-menorx1)*(mayory1-menory1);
        /**Crea el segundo objeto**/
        Rectangulo rectangulo2= new Rectangulo();
        rectangulo2.x1=7;
        rectangulo2.y1=9;
        rectangulo2.x2=2;
        rectangulo2.y2=3;
        if (rectangulo2.x1>rectangulo2.x2){
            mayorx2= rectangulo2.x1;
            menorx2= rectangulo2.x2;
        }else {
            mayorx2= rectangulo2.x2;
            menorx2= rectangulo2.x1;
        }
        if (rectangulo2.y1>rectangulo2.y2){
            mayory2= rectangulo2.y1;
            menory2= rectangulo2.y2;
        }else {
            mayory2= rectangulo2.y2;
            menory2= rectangulo2.y1;
        }
        int perimetro2=2*(mayorx2-menorx2)+2*(mayory2-menory2);
        int area2= (mayorx2-menorx2)*(mayory2-menory2);
        System.out.println("Rectángulo 1");
        System.out.println("Coordenadas: ("+ rectangulo1.x1+","+rectangulo1.y1+")("+rectangulo1.x2+","+rectangulo1.y2+")");
        System.out.println("Perímetro: "+ perimetro1);
        System.out.println("Área: " + area1);
        System.out.println("Rectángulo 2");
        System.out.println("Coordenadas: ("+ rectangulo2.x1+","+rectangulo2.y1+")("+rectangulo2.x2+","+rectangulo2.y2+")");
        System.out.println("Perímetro: "+perimetro2);
        System.out.println("Área: " + area2);

    }
}
