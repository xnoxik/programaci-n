package SegundaParte.ConsumoElectrico;

public class Consumo {
    private String aparato;
    private int consumoElectrico;
    private int watios;
    boolean encender;
    boolean apagar;

    public Consumo(String aparato, int watios) {
        this.aparato = aparato;
        this.watios = watios;
    }
    public void Encender(){
        encender = true;
        consumoElectrico=consumoElectrico+watios;
    }
    public void Apagar(){
        apagar = false;
        consumoElectrico=consumoElectrico-watios;
    }
    public static void imprime(){
        System.out.println(aparato + " - " + watios + " watios");
    }
    /*
    public consumoElectrico(Consumo consumoElectrico){
        if ()
     */
}
