import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        float max =0;
        float min = 10000;
        Scanner sc = new Scanner(System.in);
        float numeros[] = new float[10];
        for (int i=0; i< numeros.length;i++){
            System.out.print("Introduzca un número: ");
            numeros[i] = sc.nextInt();
            if (max<=numeros[i]){
                max=numeros[i];
            }
            if (numeros[i]<min){
                min=numeros[i];
            }
        }
        System.out.println("El máximo es: " + max);
        System.out.println("El mínimo es: " + min);
    }
}
