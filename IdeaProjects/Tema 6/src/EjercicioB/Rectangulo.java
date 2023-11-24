package EjercicioB;

public class Rectangulo {
    int x1, y1, x2, y2, mayorx, menorx, mayory, menory, area, perimetro;

    public Rectangulo(int x1, int y1, int x2, int y2) {
        if (x1>=x2 && y1>=y2) {
            System.err.println("Error al instanciar Rectángulo");
        }else {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
        if (x1>x2){
            mayorx = x1;
            menorx = y2;
        }else{
            menorx = x1;
            mayorx = x2;
        }
        if (y1>y2){
            mayory = y1;
            menory = y2;
        }else{
            menory = y1;
            mayory = y2;
        }
        perimetro = 2*(mayorx-menorx)+2*(mayory-menory);
        area = (mayorx-menorx)*(mayory-menory);
    }
}

