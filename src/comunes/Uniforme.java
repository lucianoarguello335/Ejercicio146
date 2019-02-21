/*
 * Devuelve valores con distribucion uniforme
 */
package comunes;

/**
 *
 * @author lucianoarguello
 */
public class Uniforme {
    private final int a;
    private final int b;
        
	public Uniforme(int a, int b)
        {		
            this.a = a;
            this.b = b;
	}
	
	public int getUniforme() {
            int r = (int) Math.random();
            int retorno = (b - a) * r + a;
            return retorno;
         
	}
}
