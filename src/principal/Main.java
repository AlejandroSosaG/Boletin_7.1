package principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        Persona persona = new Persona();
        Genero genero = null, genero2 = null, genero3 = null;
        String nombre, nombre2, nombre3, dni, dni2, dni3;
        double edad = 0, edad2 = 0, edad3 = 0, peso = 0, peso2 = 0, peso3 = 0, altura = 0, altura2 = 0, altura3 = 0, num;
        System.out.println("Diga el número de personas que desea insertar");
        do {
            num = s.nextDouble();
            if (num > 0) {
                System.out.println("Nombre: ");
                nombre = s.next();
                persona.setNombre(nombre);
                System.out.println("DNI: ");
                dni = s.next();
                persona.setDNI(dni);
                System.out.println("Género(H= Hombre, M= Mujer, O= Otro): ");
                genero = Genero.valueOf(s.next());
                persona.setGenero(genero);
                System.out.println("Edad: ");
                edad = s.nextDouble();
                persona.setEdad(edad);
                System.out.println("Peso: ");
                peso = s.nextDouble();
                persona.setPeso(peso);
                System.out.println("Altura en metros: ");
                altura = s.nextDouble();
                persona.setAltura(altura);
                System.out.println(persona.calcularIMC());
                System.out.println(persona.comprobadorIMC());
                persona.mensajeIMC();
                persona.mayoriaDeEdad();
                if (num > 1) {
                    System.out.println("Nombre 2ª persona: ");
                    nombre2 = s.next();
                    persona.setNombre(nombre2);
                    System.out.println("DNI 2ª persona: ");
                    dni2 = s.next();
                    persona.setDNI(dni2);
                    System.out.println("Género(H= Hombre, M= Mujer, O= Otro) 2ª persona: ");
                    genero2 = Genero.valueOf(s.next());
                    persona.setGenero(genero2);
                    System.out.println("Edad 2ª persona: ");
                    edad2 = s.nextDouble();
                    persona.setEdad(edad2);
                    System.out.println("Peso 2ª persona: ");
                    peso2 = s.nextDouble();
                    persona.setPeso(peso2);
                    System.out.println("Altura 2ª persona en metros: ");
                    altura2 = s.nextDouble();
                    persona.setAltura(altura2);
                    System.out.println(persona.calcularIMC());
                    System.out.println(persona.comprobadorIMC());
                    persona.mensajeIMC();
                    persona.mayoriaDeEdad();
                    if (num == 3) {
                        System.out.println("Nombre 3ª persona: ");
                        nombre3 = s.next();
                        persona.setNombre(nombre3);
                        System.out.println("DNI 3ª persona: ");
                        dni3 = s.next();
                        persona.setDNI(dni3);
                        System.out.println("Género(H= Hombre, M= Mujer, O= Otro) 3ª persona: ");
                        genero3 = Genero.valueOf(s.next());
                        persona.setGenero(genero3);
                        System.out.println("Edad 3ª persona: ");
                        edad3 = s.nextDouble();
                        persona.setEdad(edad3);
                        System.out.println("Peso 3ª persona: ");
                        peso3 = s.nextDouble();
                        persona.setPeso(peso3);
                        System.out.println("Altura 3ª persona en metros: ");
                        altura3 = s.nextDouble();
                        persona.setAltura(altura3);
                        System.out.println(persona.calcularIMC());
                        System.out.println(persona.comprobadorIMC());
                        persona.mensajeIMC();
                    }
                }
            } else if (num == 0) {
                System.out.println("Ha deseado salir, hasta pronto");
            } else System.out.println("Por favor, introduzca un número mayor de 0 para ejecutar el programa");
        } while (num < 0);
        menu(peso, peso2, peso3, altura, altura2, altura3, edad, edad2, edad3, genero, genero2, genero3);

    }

    private static void menu(double peso, double peso2, double peso3, double altura, double altura2, double altura3, double edad, double edad2, double edad3, Genero genero, Genero genero2, Genero genero3) {
        Scanner s = new Scanner(System.in);
        int opc;
        double pesomedio, alturamedia, edadmedia, sexomedio;
        boolean v = false;
        while (v = false) {
            System.out.println("Elija entre las siguientes opciones:  " +
                    "1. Peso medio de todas las personas gestionadas" +
                    "2. Altura media" +
                    "3. Edad media" +
                    "4. Sexo medio"+
                    "5. Salir");
            opc = s.nextInt();
            switch (opc) {
                case 1:
                    pesomedio = (peso + peso2 + peso3) / 3;
                    System.out.println(pesomedio);
                    break;
                case 2:
                    alturamedia = (altura + altura2 + altura3) / 3;
                    System.out.println(alturamedia);
                    break;
                case 3:
                    edadmedia = (edad + edad2 + edad3) / 3;
                    System.out.println(edadmedia);
                    break;
                case 4:
                    System.out.println("La primera persona es " + genero);
                    System.out.println("La segunda persona es " + genero2);
                    System.out.println("La tercera persona es " + genero3);
                    break;
                case 5:
                    v=true;
                    break;
            }
        }
    }

    private static void menu2(double peso, double peso2, , double altura, double altura2, double altura3, double edad, double edad2, double edad3, Genero genero, Genero genero2, Genero genero3) {
        Scanner s = new Scanner(System.in);
        int opc;
        double pesomedio, alturamedia, edadmedia, sexomedio;
        boolean v = false;
        while (v = false) {
            System.out.println("Elija entre las siguientes opciones:  " +
                    "1. Peso medio de todas las personas gestionadas" +
                    "2. Altura media" +
                    "3. Edad media" +
                    "4. Sexo medio"+
                    "5. Salir");
            opc = s.nextInt();
            switch (opc) {
                case 1:
                    pesomedio = (peso + peso2 + peso3) / 3;
                    System.out.println(pesomedio);
                    break;
                case 2:
                    alturamedia = (altura + altura2 + altura3) / 3;
                    System.out.println(alturamedia);
                    break;
                case 3:
                    edadmedia = (edad + edad2 + edad3) / 3;
                    System.out.println(edadmedia);
                    break;
                case 4:
                    System.out.println("La primera persona es " + genero);
                    System.out.println("La segunda persona es " + genero2);
                    System.out.println("La tercera persona es " + genero3);
                    break;
                case 5:
                    v=true;
                    break;
            }
        }
    }
}
