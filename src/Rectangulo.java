public class Rectangulo extends Poligono {

    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2){
        super(2); // que significa el numero 2 en el super? es el numero de lados del rectangulo, aunque no es un poligono regular, se considera que tiene 2 lados para efectos de esta clase.
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1(){
        return lado1;
    }

    public double getLado2(){
        return lado2;
    }

    @Override
    public String toString(){
        return "\nRectangulo con lados " + lado1 + " y " + lado2 + ".\n";
    }

    public double area(){
        return (lado1 * lado2);
    }
}
