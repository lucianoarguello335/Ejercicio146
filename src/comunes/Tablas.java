
package comunes;

import java.util.ArrayList;
import java.util.List;

public class Tablas {
    
    /* Definiciones de tablas con sus probabilidades y rangos */
    public static List<Intervalo> getTablaDemandaA(){
        List<Intervalo> demandaList = new ArrayList<>();
        
        demandaList.add(new Intervalo(0, 34, 10));
        demandaList.add(new Intervalo(35, 59, 15));
        demandaList.add(new Intervalo(60, 79, 20));
        demandaList.add(new Intervalo(80, 89, 25));
        demandaList.add(new Intervalo(90, 99, 30));

        return demandaList;
    }
    
    public static List<Intervalo> getTablaDemandaB(){
        List<Intervalo> demandaList = new ArrayList<>();
        
        demandaList.add(new Intervalo(0, 19, 10));
        demandaList.add(new Intervalo(5, 16, 15));
        demandaList.add(new Intervalo(17, 34, 20));
        demandaList.add(new Intervalo(35, 99, 25));

        return demandaList;
    }
    
    public static List<Intervalo> getTablaDemandaC(){
        List<Intervalo> demandaList = new ArrayList<>();
        
        demandaList.add(new Intervalo(0, 19, 10));
        demandaList.add(new Intervalo(20, 49, 15));
        demandaList.add(new Intervalo(50, 79, 20));
        demandaList.add(new Intervalo(80, 99, 25));

        return demandaList;
    }
    
    public static List<Intervalo> getTablaDemandaD(){
        List<Intervalo> demandaList = new ArrayList<>();
        
        demandaList.add(new Intervalo(0, 9, 10));
        demandaList.add(new Intervalo(10, 29, 15));
        demandaList.add(new Intervalo(30, 79, 20));
        demandaList.add(new Intervalo(80, 99, 25));

        return demandaList;
    }
    /* Obtención de valores desde las tablas de probabilidades */
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
