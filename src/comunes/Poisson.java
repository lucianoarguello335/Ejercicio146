/*
 * Devuelve valores con distribucion uniforme
 */
package comunes;

import java.util.Random;

/**
 *
 * @author lucianoarguello
 */
public class Poisson {
        private final float lambda;
        private static Random rnd;
        
        private Poisson(float lambda)
        {
            this.lambda = lambda;
            rnd = new Random();
        }
        
        public int getPoisson(){

                int X=0;
                double S=1;
                int flag=0;

                double A=Math.pow(Math.E, - lambda);

                while(flag==0){
                        S=S*rnd.nextDouble();
                        if((S-A)>0){
                            X++;
                        }
                        else{
                            flag=1;
                        }
                    }
                return X;
    }
}