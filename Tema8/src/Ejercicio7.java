import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca valor de P: ");
        int P=sc.nextInt();
        int mayor = P;
        System.out.print("Introduzca valor de Q: ");
        int Q=sc.nextInt();
        int menor = Q;
        if (P<Q) {
            mayor = Q;
            menor = P;
        }
        int numeros[][] = new int[P][Q];
            for (int i = menor; i < mayor; i++) {
                System.out.print(i + " ");
        }
    }
}
