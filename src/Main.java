import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Poligono> Poligonos = new ArrayList<Poligono>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        llenarPoligono();
    }

    public static void llenarPoligono(){
        int opcion;
        char respuesta;
        do{
            do {
                System.out.println("Digite El Poligono Que Usted Desea");
                System.out.println("1. Triangulo\n 2. Rectangulo\n 3. Salir\n");
                System.out.print("Opcion -> ");
                opcion = input.nextInt();
            }
            while(opcion < 1 || opcion > 3);

            switch(opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Gracias Por Usar El Programa");
                    System.exit(0);
            }

            System.out.println("\nDesea Agregar Otro Poligono? (S/N)");
            respuesta = input.next().charAt(0); // lee la respuesta del usuario y la convierte a un caracter, para luego compararla con 'S' o 'N' en el ciclo do-while. Si el usuario ingresa 'S', el ciclo se repetira y se le preguntara nuevamente por el tipo de poligono que desea agregar. Si el usuario ingresa 'N', el ciclo se terminara y se mostrara un mensaje de despedida.
            System.out.println("\n");

        }while(respuesta == 'S' || respuesta == 'N');
    }

    public static void llenarTraingulo(){

        double lado1, lado2, lado3;

        System.out.println("Ingrese El Lado 1 Del Triangulo");
        lado1 = input.nextDouble();
        System.out.println("Ingrese El Lado 2 Del Triangulo");
        lado2 = input.nextDouble();
        System.out.println("Ingrese El Lado 3 Del Triangulo");
        lado3 = input.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        Poligonos.add(triangulo); // agregar el objeto triangulo a la lista poligonos.

    }

}
