 package ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicios {
    
    
    public void Ejercicio1(){
        Scanner data = new Scanner(System.in);
        System.out.println("Ingrese el 1er valor para sumar");
        int num1 = data.nextInt();
        System.out.println("Ingrese el 2do valor para sumar");
        int num2 = data.nextInt();
        System.out.println("La suma es: "+ (num1+num2));
    }
    
    public void Ejercicio2(){
        Scanner data = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = data.nextLine();
        System.out.println("Tu nombre es: "+nombre);
    }
    
    public void Ejercicio3(){
        Scanner data = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = data.nextLine();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
    
    public void Ejercicio4(){
        Scanner data = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de grados centigrados para convertir a Fahrenheit");
        int gradosCentigrados = data.nextInt();
        double gradosFahrenheit = 32+(9 * gradosCentigrados / 5);
        System.out.println("Su equivalente a Fahrenheit es: "+ gradosFahrenheit);
    }
    
    public void Ejercicio5(){
        Scanner data = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("Ingrese un valor");
        int num = data.nextInt();
        System.out.println("el doble de "+ num +" es: "+num * 2);
        System.out.println("el doble de "+ num +" es: "+num * 3);
        double raiz = Math.sqrt(num);
        System.out.println("La raiz cuadrada es: "+ df.format(raiz));
    }
    
    public void Ejercicio6(){
        Scanner data = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = data.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = data.nextInt();
        System.out.println("El mayor es: "+Math.max(num1, num2));
    }
    
    public void Ejercicio7(int num){
        System.out.println("Ingrese un numero");
        if (num%2==0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }
    
    public void Ejercicio8(){
        Scanner data = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = data.nextLine();
        if (frase.equals("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
    
    public void Ejercicio9(){
        Scanner data = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase = data.nextLine();
        if (frase.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
    
    public void Ejercicio10(){
        Scanner data = new Scanner(System.in);
        System.out.println("Ingrese una cadena");
        String cadena = data.nextLine();
        if (cadena.startsWith("A") || cadena.startsWith("a")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
    
    public void Ejercicio11(){
        Scanner data = new Scanner(System.in);
        System.out.println("ingrese seccion");
        int tipoMotor = data.nextInt();
        switch(tipoMotor) {
            case 1:{System.out.println("La bomaba es una bomba de agua");
                    break;
                    }
            case 2:{System.out.println("La bomba es una bomba de gasolina");
                    break;
                    }
            case 3:{System.out.println("La bomba es una bomba de hormigon");
                    break;
                    }
            case 4:{System.out.println("La bomba es una bomba de pasta alimenticia");
                    break;
                    }
            default:{System.out.println("No existe un valor valido para tipo de bomba"); }
        }
    }
    
    public void Ejercicio12(){
        Scanner data = new Scanner(System.in);
        int nota;
        do{
            System.out.println("Ingrese nota");
            nota = data.nextInt();
        }while(nota < 0 || nota > 10);
    }
    
    public void Ejercicio13(){
         
    }
    
    
}






