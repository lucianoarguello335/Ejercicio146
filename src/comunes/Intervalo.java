package comunes;

public class Intervalo {

    private int desde;
    private int hasta;
    private int valor; 

    public Intervalo(int desde, int hasta, int valor) {
        this.desde = desde;
        this.hasta = hasta;
        this.valor = valor;
    }

    public int getDesde() {
        return desde;
    }

    public void setDesde(int desde) {
        this.desde = desde;
    }

    public int getHasta() {
        return hasta;
    }

    public void setHasta(int hasta) {
        this.hasta = hasta;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}
