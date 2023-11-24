package EjercicioB;


public class Persona {
        String nombre;
        String apellidos;
        int edad;
        String dni;
/**Creamos un constructor, donde id es el dni, nom es el nombre, ap es el apellido y e es la edad**/
    public Persona(String id, String nom, int e, String ap) {
        dni = id;
        nombre = nom;
        edad = e;
        apellidos = ap;
    }
}
