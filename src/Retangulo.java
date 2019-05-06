public class Retangulo implements ICalcGeometria{
    private double base;
    private double altura;

    public void retangulo (double base, double altura){
        this.altura = altura;
        this.base = base;
    }

    public double getBase() {

        return base;
    }

    public void setBase(double base) {

        this.base = base;
    }

    public double getAltura() {

        return altura;
    }

    public void setAltura(double altura) {

        this.altura = altura;
    }

    public double calcArea() {
        return (this.base * this.altura);
    }

    public double calcPerimetro() {
        return ((this.base + this.altura) * 2);
    }
}
