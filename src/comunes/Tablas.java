
package comunes;

import java.util.ArrayList;
import java.util.List;

public class Tablas {
    
    /* Definiciones de tablas con sus probabilidades y rangos */
    public static List<Intervalo> getTablaDemandaA(){
        List<Intervalo> demandaList = new ArrayList<>();
        
        demandaList.add(new Intervalo(0, 0.35, 10));
        demandaList.add(new Intervalo(0.35, 0.6, 15));
        demandaList.add(new Intervalo(0.6, 0.8, 20));
        demandaList.add(new Intervalo(0.8, 0.9, 25));
        demandaList.add(new Intervalo(0.9, 1, 30));

        return demandaList;
    }
    
    public static List<Intervalo> getTablaDemandaB(){
        List<Intervalo> demandaList = new ArrayList<>();
        
        demandaList.add(new Intervalo(0, 0.4, 10));
        demandaList.add(new Intervalo(0.4, 0.7, 15));
        demandaList.add(new Intervalo(0.7, 0.9, 20));
        demandaList.add(new Intervalo(0.9, 1, 25));

        return demandaList;
    }
    
    public static List<Intervalo> getTablaDemandaC(){
        List<Intervalo> demandaList = new ArrayList<>();
        
        demandaList.add(new Intervalo(0, 0.2, 10));
        demandaList.add(new Intervalo(0.2, 0.5, 15));
        demandaList.add(new Intervalo(0.5, 0.8, 20));
        demandaList.add(new Intervalo(0.8, 1, 25));

        return demandaList;
    }
    
    public static List<Intervalo> getTablaDemandaD(){
        List<Intervalo> demandaList = new ArrayList<>();
        
        demandaList.add(new Intervalo(0, 0.1, 10));
        demandaList.add(new Intervalo(0.1, 0.3, 15));
        // Se toma solo 0.4 para la distribucion.
        // Se interpreta que estaba mal en el ejercicio.
        demandaList.add(new Intervalo(0.3, 0.8, 20));
        demandaList.add(new Intervalo(0.8, 0.9, 25));
        demandaList.add(new Intervalo(0.9, 1, 35));

        return demandaList;
    }

    /* Obtención de valores desde las tablas de probabilidades */
    public static int getValorIntervalo(double rnd, List<Intervalo> tabla){
        int valorRet=-1;
        
        //si pertenece al intervalo devuelve la demanda correspondiente a ese intervalo
        for(Intervalo rangoN : tabla){
            if(rnd >= rangoN.getDesde() && rnd < rangoN.getHasta()) {
                valorRet=rangoN.getValor();
                break;
            }
        }

        return valorRet;
    }

    @Deprecated
    public static int getValorIntervalo(int rnd, List<Intervalo> tabla){
        int valorRet=-1;
        
        //si pertenece al intervalo devuelve la demanda correspondiente a ese intervalo
        for(Intervalo rangoN : tabla){
            if(rnd >= rangoN.getDesde() && rnd <= rangoN.getHasta()) {
                valorRet=rangoN.getValor();
                break;
            }
        }

        return valorRet;
    }    
}// Fin clase
