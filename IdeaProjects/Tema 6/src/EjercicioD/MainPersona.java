package EjercicioD;

public class MainPersona {
    public static void main(String[] args) {
        Persona persona1=new Persona("15423481Y", "Pepe", 18, "Sánchez");
        Persona persona2=new Persona("48521314G", "Eugenia", 70, "Martínez");
        persona1.imprime();
        persona2.imprime();
        System.out.println("La diferencia de edad es de " + persona1.diferenciaEdad(persona2) + " años");
    }
}
