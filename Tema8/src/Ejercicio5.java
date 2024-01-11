import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        float suma =0, media;
        Scanner sc = new Scanner(System.in);
        float numeros[] = new float [20];
        for (int i=0; i<numeros.length;i++){
            System.out.print("Introduzca un número: ");
            numeros[i] = sc.nextFloat();
            suma+= numeros[i];
        }
        media = suma/ numeros.length;
        System.out.println("La media de los valores introducido es: " + media);
    }
}
