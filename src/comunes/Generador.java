package comunes;
import java.util.*;

public class Generador {
    private static Random rnd = new Random();
    private static double resultado[];
    
    public static double calcularExp(double lambda){
       double r1=rnd.nextDouble();  
       
       double aux1 = -1/lambda;
       double aux2 = Math.log(r1);
       double x =aux1*aux2;
       
       return x;     
    }
    
    public static double[] distExp(double lambda, int cant){
        if(cant > 0){
            resultado = new double[cant];
        
            for(int i=0; i < cant; i++){
                resultado[i]=calcularExp(lambda);            
            }       
        
            
        } 
       return resultado;
    }
    
    public static double normal(double media, double varianza){
        double r1 = rnd.nextDouble();
        double auxz1 = Math.sqrt(-2*Math.log(r1));
        
        double r2 = rnd.nextDouble();
        double auxz2 = Math.sin(2*Math.PI*r2);
        
        double z = auxz1*auxz2;
        
        double x = media+(varianza*z);       
        
        return x;
    }
    
    public static double[] normal(double media, double varianza, int cant){
        if(cant > 0){
            resultado = new double[cant];
            for(int i=0; i < cant; i++){
                resultado[i] = normal(media,varianza);
            }            
        }        
        return resultado;
    }
    
    public static int poisson(double lambda){

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

public static double[] poisson(double lambda, int cant){

        if(cant > 0){
            resultado = new double[cant];
            for(int i=0; i < cant; i++){
                resultado[i] = (double)poisson(lambda);
            }
        }
        return resultado;
    }


} 
