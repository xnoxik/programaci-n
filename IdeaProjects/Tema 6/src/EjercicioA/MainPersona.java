package EjercicioA;

import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Persona persona1=new Persona();
        System.out.println("Ejercicio A2");
        System.out.print("Introduce tu nombre: ");
        persona1.nombre=entrada.nextLine();
        System.out.print("Introduce tu apellido: " );
        persona1.apellidos=entrada.nextLine();
        System.out.print("Introduce el DNI: ");
        persona1.dni=entrada.nextLine();
        System.out.print("Introduce la edad: ");
        persona1.edad=entrada.nextInt();
        if(persona1.edad>=18){
            System.out.println(persona1.nombre + " " + persona1.apellidos + " con DNI " + persona1.dni + " es mayor de edad");
        }else{
            System.out.println(persona1.nombre + " " + persona1.apellidos + " con DNI " + persona1.dni + " es menor de edad");
        }
        Persona persona2=new Persona();
        System.out.print("Introduce tu nombre: ");
        persona2.nombre=entrada.nextLine();
        System.out.print("Introduce tu apellido: ");
        persona2.apellidos=entrada.nextLine();
        System.out.print("Introduce el DNI: ");
        persona2.dni=entrada.nextLine();
        System.out.print("Introduce la edad: ");
        persona2.edad=entrada.nextInt();
        if(persona2.edad>=18){
            System.out.println(persona2.nombre + " " + persona2.apellidos + "con DNI " + persona2.dni + " es mayor de edad");
        }else {
            System.out.println(persona2.nombre + " " + persona2.apellidos + "con DNI " + persona2.dni + " es menor de edad");
        }
    }
}
