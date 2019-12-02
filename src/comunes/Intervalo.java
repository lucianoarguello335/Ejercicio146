package comunes;

public class Intervalo {

    private double desde;
    private double hasta;
    private int valor; 

    public Intervalo(double desde, double hasta, int valor) {
        this.desde = desde;
        this.hasta = hasta;
        this.valor = valor;
    }

    public double getDesde() {
        return desde;
    }

    public void setDesde(double desde) {
        this.desde = desde;
    }

    public double getHasta() {
        return hasta;
    }

    public void setHasta(double hasta) {
        this.hasta = hasta;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}
