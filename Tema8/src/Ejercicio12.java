import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        do{
            menu();
            opcion = sc.nextLine();
            if (opcion.equalsIgnoreCase("A")) {
                mostrarValor();
            }
            if (opcion.equalsIgnoreCase("B")) {
                System.out.print("Introduce el valor:");
                introValor();
                System.out.println("Introduce posición");
            }
        }while(!opcion.equalsIgnoreCase("C"));
    }

    public static void menu() {
        System.out.println("a. Mostrar Valores.");
        System.out.println("b. Introducir valor");
        System.out.println("c. Salir ");
    }
    public static int introValor(){
        int numeros[] = new int [10];
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        return v;

    }
    public static void mostrarValor(){
        int numeros[] = new int [10];
        for (int i=0; i<10;i++) {
            System.out.println("La posición " + i + " tiene el valor " + numeros[i] );
        }
    }
}

