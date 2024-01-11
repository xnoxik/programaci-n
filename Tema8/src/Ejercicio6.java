import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el valor de N: ");
        int N = sc.nextInt();
        System.out.print("Introduzca el valor de M: ");
        int M = sc.nextInt();
        int numeros[][] = new int [N][M];
        for (int i=0;i< numeros.length;i++){
            System.out.println(i + " ");
            for(int j=0; j<numeros[i].length;j++){
                System.out.print(numeros[i][j] + " ");
            }
        }
    }
}
