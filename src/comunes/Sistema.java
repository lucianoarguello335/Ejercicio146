/*
    Propiedades del sistema como la hora actual, etc.
 */
package comunes;

/**
 *
 * @author lucianoarguello
 */
public class Sistema {
    private static float horaActual=0.0f;
    
    public static float getHoraActual(){
        return horaActual;
    }
    
    public static void setHoraActual(float hora){
        horaActual = hora;
    }
}
