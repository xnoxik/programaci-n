package SegundaParte.ConsumoElectrico;

public class MainConsumo {
    public static void main(String[] args) {

        Consumo aparato1 = new Consumo("Bombilla", 100);
        Consumo aparato2 = new Consumo("Radiador", 2000);
        Consumo aparato3 = new Consumo("Plancha", 1200);
        aparato1.imprime();
        aparato2.imprime();
        aparato3.imprime();
    }
}
