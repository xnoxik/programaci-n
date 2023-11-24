package EjercicioC;

public class Articulo {
    private String nombre;
    private float precio;
    private int IVA=21;
    private int cuantosQuedan;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecioSinIva(float precioSinIva) {
        this.precio = precioSinIva;
    }

    public int getIVA() {
        return IVA;
    }

    public void setIVA(int IVA) {
        this.IVA = IVA;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        this.cuantosQuedan = cuantosQuedan;
    }
    public Articulo(String nombre, float precio, int IVA, int cuantosQuedan){
        this.nombre=nombre;
        this.precio=precio;
        this.IVA=IVA;
        this.cuantosQuedan=cuantosQuedan;

        if (precio<=0){
            System.err.println("El precio es incorrecto");
        }
        if (IVA!=21){
            System.err.println("El IVA tiene que ser 21%");
        }
        if (cuantosQuedan<0){
            System.err.println("No podemos tener en negativo");
        }
    }
}
