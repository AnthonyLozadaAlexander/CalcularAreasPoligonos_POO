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
        return "\nPoligono con " + numLados + " lados.\n";
    }

    public abstract double area(); // metodo abstracto para calcular el area del poligono
}
