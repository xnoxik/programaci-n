package EjercicioC;

public class MainArticulo {
    public static void main(String[] args) {
        Articulo articulo1= new Articulo("Pijama",10,21,60);
        Articulo articulo2= new Articulo("Jamón", 250,21,15);
        System.out.println(articulo1.getNombre() + " - " + articulo1.getPrecio() + "€ - " + articulo1.getIVA() + "% - Queda: " + articulo1.getCuantosQuedan());
        System.out.println(articulo2.getNombre() + " - " + articulo2.getPrecio() + "€ - " + articulo2.getIVA() + "% - Queda: " + articulo2.getCuantosQuedan());
    }
}
