/*
 * Toma los datos del "vectorDeEstadoPrevio" y los utiliza para
 * actualizar el "vectorDeEstadoActual"
 * Ademas, utiliza los metodos de la clase VectorDeEstado como
 * gethLLegada(), gethLLegada() ademas de implementar los propios
 */
package comunes;

/**
 *
 * @author lucianoarguello
 */
public class ManejadorDeVector {
    
    VectorDeEstado vectorDeEstadoActual;
    VectorDeEstado vectorDeEstadoPrevio;
    
    public ManejadorDeVector(){
        
    }
    
    /**
     * Metodo principal que actualiza el "vectorDeEstadoActual"
     * convirtiendolo en "vectorDeEstadoPrevio" al finalizar una iteracion
     */    
    public void actualizarVectoresDeEstado(){
        vectorDeEstadoPrevio = vectorDeEstadoActual;
    }
}
