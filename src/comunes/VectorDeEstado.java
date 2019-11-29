package comunes;

// LEER

import java.util.Date;

// https://stackoverflow.com/questions/2015538/arrays-with-different-datatypes-i-e-strings-and-integers-objectorientend
public class VectorDeEstado {

    private int iteracion;
    private Date hora;
    private String evento;
    private int rndLLegada;
    private float tiempoLLegada;
    private float hLLegada;
    private ColaDeClientes colaClientes;
    private int rndFinCompra;
    private int cantCompra;
    private float tiempoPorArt;
    private float tiempoTotalCompra;
    private float horaFinCompra;
    private int RNDcaja1;
    private float tCaja1;
    private float hCaja1;
    private int RNDcaja2;
    private float tCaja2;
    private float hCaja2;
    private int RNDcaja3;
    private float tCaja3;
    private float hCaja3;
    private int contCompradores;

    public Object[] toObjectArray() {
        Object[] objs = new Object[]{iteracion, hora, evento, rndLLegada, tiempoLLegada, hLLegada, colaClientes, 
                                     rndFinCompra, cantCompra, tiempoPorArt, tiempoTotalCompra, horaFinCompra, 
                                     RNDcaja1, tCaja1, hCaja1, RNDcaja2, tCaja2, hCaja2, RNDcaja3, tCaja3, hCaja3, 
                                     contCompradores};
        return objs;
    }

    public VectorDeEstado(int iteracion, Date hora, String DescEvento, int rndLLegada, float tiempoLLegada, float hLLegada, int contCompradores) {
        this.iteracion = iteracion;
        this.hora = hora;
        this.evento = DescEvento;
        this.rndLLegada = rndLLegada;
        this.tiempoLLegada = tiempoLLegada;
        this.hLLegada = hLLegada;
        this.contCompradores = contCompradores;
    }

    public VectorDeEstado() {
    }

    public int getIteracion() {
        return iteracion;
    }

    public void setIteracion(int iteracion) {
        this.iteracion = iteracion;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public int getRndLLegada() {
        return rndLLegada;
    }

    public void setRndLLegada(int rndLLegada) {
        this.rndLLegada = rndLLegada;
    }

    public float getTiempoLLegada() {
        return tiempoLLegada;
    }

    public void setTiempoLLegada(float tiempoLLegada) {
        this.tiempoLLegada = tiempoLLegada;
    }

    public float gethLLegada() {
        return hLLegada;
    }

    public void sethLLegada(float hLLegada) {
        this.hLLegada = hLLegada;
    }

    public ColaDeClientes getColaClientes() {
        return colaClientes;
    }

    public void setColaClientes(ColaDeClientes colaClientes) {
        this.colaClientes = colaClientes;
    }

    public int getRndFinCompra() {
        return rndFinCompra;
    }

    public void setRndFinCompra(int rndFinCompra) {
        this.rndFinCompra = rndFinCompra;
    }

    public int getCantCompra() {
        return cantCompra;
    }

    public void setCantCompra(int cantCompra) {
        this.cantCompra = cantCompra;
    }

    public float getTiempoPorArt() {
        return tiempoPorArt;
    }

    public void setTiempoPorArt(float tiempoPorArt) {
        this.tiempoPorArt = tiempoPorArt;
    }

    public float getTiempoTotalCompra() {
        return tiempoTotalCompra;
    }

    public void setTiempoTotalCompra(float tiempoTotalCompra) {
        this.tiempoTotalCompra = tiempoTotalCompra;
    }

    public float getHoraFinCompra() {
        return horaFinCompra;
    }

    public void setHoraFinCompra(float horaFinCompra) {
        this.horaFinCompra = horaFinCompra;
    }

    public int getRNDcaja1() {
        return RNDcaja1;
    }

    public void setRNDcaja1(int RNDcaja1) {
        this.RNDcaja1 = RNDcaja1;
    }

    public float gettCaja1() {
        return tCaja1;
    }

    public void settCaja1(float tCaja1) {
        this.tCaja1 = tCaja1;
    }

    public float gethCaja1() {
        return hCaja1;
    }

    public void sethCaja1(float hCaja1) {
        this.hCaja1 = hCaja1;
    }

    public int getRNDcaja2() {
        return RNDcaja2;
    }

    public void setRNDcaja2(int RNDcaja2) {
        this.RNDcaja2 = RNDcaja2;
    }

    public float gettCaja2() {
        return tCaja2;
    }

    public void settCaja2(float tCaja2) {
        this.tCaja2 = tCaja2;
    }

    public float gethCaja2() {
        return hCaja2;
    }

    public void sethCaja2(float hCaja2) {
        this.hCaja2 = hCaja2;
    }

    public int getRNDcaja3() {
        return RNDcaja3;
    }

    public void setRNDcaja3(int RNDcaja3) {
        this.RNDcaja3 = RNDcaja3;
    }

    public float gettCaja3() {
        return tCaja3;
    }

    public void settCaja3(float tCaja3) {
        this.tCaja3 = tCaja3;
    }

    public float gethCaja3() {
        return hCaja3;
    }

    public void sethCaja3(float hCaja3) {
        this.hCaja3 = hCaja3;
    }

    public int getAcumCompradores() {
        return contCompradores;
    }

    public void setAcumCompradores(int acumCompradores) {
        this.contCompradores = acumCompradores;
    }

    @Override
    public String toString() {
        return "VectorDeEstado{" + "iteracion=" + iteracion + ", hora=" + hora + ", evento=" + evento
                + ", rndLLegada=" + rndLLegada + ", tiempoLLegada=" + tiempoLLegada + ", hLLegada=" + hLLegada
                + ", colaClientes=" + colaClientes + ", rndFinCompra=" + rndFinCompra + ", cantCompra=" + cantCompra
                + ", tiempoPorArt=" + tiempoPorArt + ", tiempoTotalCompra=" + tiempoTotalCompra + ", horaFinCompra="
                + horaFinCompra + ", RNDcaja1=" + RNDcaja1 + ", tCaja1=" + tCaja1 + ", hCaja1=" + hCaja1 + ", RNDcaja2=" + RNDcaja2
                + ", tCaja2=" + tCaja2 + ", hCaja2=" + hCaja2 + ", RNDcaja3=" + RNDcaja3 + ", tCaja3=" + tCaja3 + ", hCaja3=" + hCaja3
                + ", acumCompradores=" + contCompradores + '}';
    }

}