public class Rectangulo extends Poligono {

    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2){
        super(2); // manda el numero de lados del rectangulo al constructor de la clase padre Poligono
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
