package EjercicioD;

public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void imprime(){
        System.out.println("(" + x + "," + y + ")");
    }

    public void desplaza(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
    public int distancia(Punto dist){
        return (int) Math.sqrt(Math.pow(this.x - dist.x, 2) + Math.pow (this.y - dist.y, 2));
    }
}
