package EjercicioB;

import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Persona persona1=new Persona("1234562Y", "Hong Ki", 25, "Law" );
        System.out.println(persona1.nombre + " " + persona1.apellidos + " con DNI " + persona1.dni + " tiene " + persona1.edad + " años");
        Persona persona2=new Persona("5233214D", "Paco", 60, "Martinez");
        System.out.println(persona2.nombre + " " + persona2.apellidos + " con DNI " + persona2.dni + " tiene " + persona2.edad + " años");
    }
}
