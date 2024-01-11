import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int superior =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un valor entre 0,0 y 1,0: ");
        double R = sc.nextDouble();
        double numeros[] = new double [100];
        for (int i=0;i<numeros.length;i++){
            numeros[i] =Math.random();
            if (numeros[i]>=R){
                superior++;
            }
        }
        System.out.println("Hay " + superior + " numeros superiores al valor introducido.");
    }
}
