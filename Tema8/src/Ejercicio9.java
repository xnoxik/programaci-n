import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        int posicion=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el valor de N entre 0-10: ");
        int N = sc.nextInt();
        int numeros [] = new int [100];
        for (int i=0; i< numeros.length;i++){
            int aleatorio = (int)(1+Math.random()*10);
            //System.out.println(aleatorio);
            if (aleatorio != N){
                posicion++;
            } else {
                System.out.println("La posición del numero introducido es: " + posicion);
                break;
            }
        }

    }
}
