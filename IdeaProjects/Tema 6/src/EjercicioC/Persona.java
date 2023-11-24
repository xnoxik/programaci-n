package EjercicioC;

public class Persona {
        private String nombre;
        private String apellidos;
        private int edad;
        private String dni;

    public Persona(String id, String nom, int e, String ap) {
        dni = id;
        nombre = nom;
        edad = e;
        apellidos = ap;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
