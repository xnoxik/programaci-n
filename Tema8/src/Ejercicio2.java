import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        float suma = 0;
        Scanner sc = new Scanner(System.in);
        float numero [] = new float [10];
        for (int i=0; i< numero.length;i++){
            System.out.print("Introduzca un número: ");
            numero[i] = sc.nextInt();
            suma +=numero[i];
        }
        System.out.println(suma);
    }
}
