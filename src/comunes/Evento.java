/*
 * Cada uno de los eventos: llegada al sistema, inicio de atencion, fin de atencion, etc.
 */
package comunes;

/**
 *
 * @author lucianoarguello
 */
public class Evento {

    private int id;
    private float hora;
    private String desc;
    private TipoEvento tipo;

    public void setHora(float hora) {
        this.hora = hora;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setTipo(TipoEvento tipo) {
        this.tipo = tipo;
    }
    
    public Evento(float hora, String desc, TipoEvento tipo) {
        this.hora = hora;
        this.desc = desc;
        this.tipo = tipo;
    }

    public float getHora() {
        return hora;
    }

    public String getDesc() {
        return desc;
    }

    public TipoEvento getTipo() {
        return tipo;
    }
    
    // Texto a colocar en la columna "Evento"
     public String toString(){
        return tipo + " " + id;
     }
}
