/*
 * Cola unica de eventos para toda la simulacion.
 */
package comunes;

import java.util.ArrayList;

/**
 *
 * @author lucianoarguello
 */
public class ColaDeEventos {
    private ArrayList cola;
    
    public ColaDeEventos(){
        cola = new ArrayList();
    }
    
    public void agregarEvento(Evento e){
        cola.add(e);
    }
    
    //public Evento getProximoEvento(float hora){
        // Obtener evento mas proxima a la hora pasada por parametro y devolver    
    //}
    
    public void atenderProximoEvento(float hora){
        // Llamar getProximoEvento, 
    }
    
    public void eliminarEvento(int idEvento){
        
    }
    
    public void getProximoEvento(float hora){
        cola.get(0);
    }
}