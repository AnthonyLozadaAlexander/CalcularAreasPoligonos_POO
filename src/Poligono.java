public abstract class  Poligono {

    protected int numLados; // atributo protegido que almacena el numero de lados del poligono

    public Poligono(int numLados){ // metodo constructor que recibe el numero de lados del poligono
        this.numLados = numLados;
    }

    public int getNumLados(){
        return numLados;
    }

    @Override
    public String toString(){
        return "\nNumero Lados = " + numLados + "\n";
    }

    // el metodo abstract me permite definir un metodo sin implementacion en la clase padre, y obligar a las clases hijas a implementar ese metodo. En este caso, el metodo area() es abstracto, y cada clase hija (Triangulo, Rectangulo) debe implementar su propia version del metodo area() para calcular el area del poligono correspondiente.

    public abstract double area(); // metodo abstracto para calcular el area del poligono
}
