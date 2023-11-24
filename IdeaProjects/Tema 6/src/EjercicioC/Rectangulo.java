package EjercicioC;

public class Rectangulo {
    private int x1, y1, x2, y2, mayorx, menorx, mayory, menory, area, perimetro;

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getMayorx() {
        return mayorx;
    }

    public void setMayorx(int mayorx) {
        this.mayorx = mayorx;
    }

    public int getMenorx() {
        return menorx;
    }

    public void setMenorx(int menorx) {
        this.menorx = menorx;
    }

    public int getMayory() {
        return mayory;
    }

    public void setMayory(int mayory) {
        this.mayory = mayory;
    }

    public int getMenory() {
        return menory;
    }

    public void setMenory(int menory) {
        this.menory = menory;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public Rectangulo(int x1, int y1, int x2, int y2) {
        if (x1 >= x2 && y1 >= y2) {
            System.err.println("Error al instanciar Rectángulo");
        } else {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
        if (x1 > x2) {
            mayorx = x1;
            menorx = y2;
        } else {
            menorx = x1;
            mayorx = x2;
        }
        if (y1 > y2) {
            mayory = y1;
            menory = y2;
        } else {
            menory = y1;
            mayory = y2;
        }
        perimetro=2*(mayorx-menorx)+2*(mayory-menory);
        area=(mayorx-menorx)*(mayory-menory);

    }
}
