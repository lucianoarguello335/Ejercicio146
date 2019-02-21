/*
 * Devuelve valores con distribucion uniforme
 */
package comunes;

import java.util.Random;

/**
 *
 * @author lucianoarguello
 */
public class Normal {

    private double media;
    private double varianza;
    private Random rnd;

    public Normal(double media, double varianza) {
        this.media = media;
        this.varianza = varianza;
        rnd = new Random();
    }

    public double getNormal() {

        double r1 = rnd.nextDouble();
        double auxz1 = Math.sqrt(-2 * Math.log(r1));

        double r2 = rnd.nextDouble();
        double auxz2 = Math.sin(2 * Math.PI * r2);

        double z = auxz1 * auxz2;

        double x = media + (varianza * z);

        return x;
    }
}
