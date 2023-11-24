package EjercicioD;

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
    public boolean esMayorEdad(boolean mayor) {
        if (edad >= 18) {
            return mayor = true;
        } else {
            return mayor = false;
        }
    }


    public boolean esJubilado(boolean jubilado){
        if (edad<65){
            return jubilado = false;
        } else {
            return jubilado = true;
        }
    }
    public int diferenciaEdad(Persona diff){
        return Math.abs(diff.edad - this.edad);
    }
    public void imprime(){
        System.out.println(nombre + " " + apellidos + " edad " + edad + " con DNI " + dni);
        if (esMayorEdad(true)){
            System.out.println("Es mayor de edad");
        }else {
            System.out.println("Es menor de edad");
        }
        if (esJubilado(true)){
            System.out.println("Es jubilado");
        }else{
            System.out.println("No es jubilado");
        }
    }
}