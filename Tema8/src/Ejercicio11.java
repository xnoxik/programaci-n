public class Ejercicio11 {
    public static void main(String[] args) {
        int primero [] = new int [101];
        int segundo []= new int [101];
        for (int i=1; i<primero.length; i++) {
            primero[i]=i;
        }
        System.out.print("Primer Array: ");
        for (int cadaPrimero : primero) {
            System.out.print(cadaPrimero + " ");
        }
        System.out.println("");
        System.out.print("Segundo Array: ");
        for (int i = segundo.length-1; i>0; i--){
            segundo[i] = primero[i];
            System.out.print(segundo[i] + " ");
        }
    }
}

