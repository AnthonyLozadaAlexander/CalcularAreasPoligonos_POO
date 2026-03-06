import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Poligono> poligonos = new ArrayList<Poligono>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

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
                    System.exit(0);
            }
            System.out.println("\nDesea Agregar Otro Poligono? (S/N)");
            respuesta = input.next().charAt(0);
            System.out.println("\n");

        }while(respuesta == 'S' || respuesta == 'N');
    }
}
