import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float numeros [] = new float[10];
        for (int i = 0; i< numeros.length;i++){
            System.out.print("Introduzca un número: ");
            numeros[i]=sc.nextFloat();
        }
        for (float valoresIntroducidos:numeros) {
            System.out.println(valoresIntroducidos);
        }
    }
}
