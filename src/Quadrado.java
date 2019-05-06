public class Quadrado implements ICalcGeometria{
    private double lado;

    public void quadrado(double lado){
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcArea() {
        return (this.lado * this.lado);
    }

    public double calcPerimetro() {
        return (this.lado * 4);
    }
}
