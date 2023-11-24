package EjercicioC;

public class MainPersona {
    public static void main(String[] args) {
        Persona persona1=new Persona("15423481Y", "Pepe", 18, "Sánchez");
        Persona persona2=new Persona("48521314G", "Eugenia", 5, "Martínez");
        System.out.println(persona1.getNombre() + " " + persona1.getApellidos() + " con DNI " + persona1.getDni() + " tiene " + persona1.getEdad() + " años");
        System.out.println(persona2.getNombre() + " " + persona2.getApellidos() + " con DNI " + persona2.getDni() + " tiene " + persona2.getEdad() + " años");
    }
}
