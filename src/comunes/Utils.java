package comunes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

/**
 *
 * @author Luciano
 */
public class Utils {

    Random r;
    
    public Utils(){
        r = new Random();
    }
    
    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public int getRnd(int bajo, int alto) {
        int res = r.nextInt(alto-bajo) + bajo;
        return res;
    }
    
    public int getRnd(){
        int bajo = 10;
        int alto = 100;
        int res = r.nextInt(alto-bajo) + bajo;
        return res;
    }
}
