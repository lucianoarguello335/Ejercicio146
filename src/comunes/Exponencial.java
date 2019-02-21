/*
 * Devuelve valores con distribucion uniforme
 */
package comunes;

import java.util.Random;

/**
 *
 * @author lucianoarguello
 */
public class Exponencial {

    private final double lambda;
    private static Random rnd;

    public Exponencial(float lambda) {
        this.lambda = lambda;
        rnd = new Random();
    }

    public double getExponencial() {

        double r1 = rnd.nextDouble();

        double aux1 = -1 / lambda;
        double aux2 = Math.log(r1);
        double x = aux1 * aux2;

        return x;
    }

    public double getExponencial(double rnd) {

        double aux1 = -1 / lambda;
        double aux2 = Math.log(rnd);
        double x = aux1 * aux2;

        return x;
    }
}
