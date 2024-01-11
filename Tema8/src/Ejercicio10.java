import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        float media =0,min=10000,max=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el valor de N: ");
        int N = sc.nextInt();
        int personas[] = new int[N];
        for (int i=0;i< personas.length;i++){
            System.out.print("Introduzca la altura en m: ");
            float altura = sc.nextFloat();
            media += altura;
            if (max<=altura){
                max=altura;
            }
            if (altura<min){
                min=altura;
            }
        }
        System.out.println("La media de la altura es: " + media/ personas.length);
        System.out.println("La máxima altura es: " + max);
        System.out.println("La mínima altura es: " + min);
    }
}
