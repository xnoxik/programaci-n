import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int positivo = 0, negativo = 0;
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int [20];
        for (int i = 0; i< numeros.length;i++){
            System.out.print("Introduzca el número: ");
            numeros[i] = sc.nextInt();
            if (numeros[i]>=0){
                positivo+=numeros[i];
            } else if (numeros[i]<0) {
                negativo+=numeros[i];
            }
        }
        System.out.println("La suma de positivo es: " + positivo);
        System.out.println("La suma de negativo es: " + negativo);
    }
}
