/*
 * Cada uno de los eventos: llegada al sistema, inicio de atencion, fin de atencion, etc.
 */
package comunes;
import java.util.Date;
/**
 *
 * @author lucianoarguello
 */
public class Evento {

    private int id;
    private Date hora;
    private String desc;
    private TipoEvento tipo;

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setTipo(TipoEvento tipo) {
        this.tipo = tipo;
    }
    
    public Evento(Date hora, String desc, TipoEvento tipo) {
        this.hora = hora;
        this.desc = desc;
        this.tipo = tipo;
    }

    public Date getHora() {
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
