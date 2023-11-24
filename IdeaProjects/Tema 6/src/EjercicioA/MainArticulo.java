package EjercicioA;

/**En el main de la clase principal instancia un objeto de la clase artículo. Asígnale valores a
 todos sus atributos (los que quieras) y muestra por pantalla un mensaje del estilo
 “Pijama - Precio:10€ - IVA:21% - PVP:12,1€” (el PVP es el precio de venta al público, es
 decir, el precio con IVA). Luego, cambia el precio y vuelve a imprimir el mensaje.**/
public class MainArticulo {
    public static void main(String[] args) {
        Articulo articulo1= new Articulo();
        articulo1.nombre="Pijama";
        articulo1.precioSinIva=10;
        articulo1.IVA=21;
        articulo1.cuantosQuedan=100;
        float pvp= articulo1.precioSinIva* articulo1.IVA/100+ articulo1.precioSinIva;
        System.out.println(articulo1.nombre + " - Precio:" + articulo1.precioSinIva + "€ - IVA:" + articulo1.IVA + "% - PVP: " + pvp+"€");
    }
}
