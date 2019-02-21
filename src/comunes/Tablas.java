
package comunes;

import java.util.ArrayList;
import java.util.List;

public class Tablas {

    public Tablas(){
    
    }

    /* Definiciones de tablas con sus probabilidades y rangos */
    private static List<Intervalo> getTablaDemanda(){
        List<Intervalo> damandaList = new ArrayList<Intervalo>();
        
        damandaList.add(new Intervalo(0, 4, 0));
        damandaList.add(new Intervalo(5, 16, 1));
        damandaList.add(new Intervalo(17, 34, 2));
        damandaList.add(new Intervalo(35, 59, 3));
        damandaList.add(new Intervalo(60, 81, 4));
        damandaList.add(new Intervalo(82, 99, 5));

        return damandaList;
    }

    private static List<Intervalo> getTablaDemoraPedido(){
        List<Intervalo> demoraPedList = new ArrayList<Intervalo>();

        demoraPedList.add(new Intervalo(0, 14, 1));
        demoraPedList.add(new Intervalo(15, 34, 2));
        demoraPedList.add(new Intervalo(35, 74, 3));
        demoraPedList.add(new Intervalo(75, 99, 4));

        return demoraPedList;
    }

    private static List<Intervalo> getTablaCostoPedido(){
        List<Intervalo> costoPedList = new ArrayList<Intervalo>();

        costoPedList.add(new Intervalo(0, 15, 20));
        costoPedList.add(new Intervalo(16, 40, 30));
        costoPedList.add(new Intervalo(41, Integer.MAX_VALUE, 40));
        
        return costoPedList;
    }

    /* Obtención de valores desde las tablas de probabilidades */
    public static int getDemandaValue(int val){
        int valorRet=-1;
        
        //si pertenece al intervalo devuelve la demanda correspondiente a ese intervalo
        for(Intervalo rangoX : Tablas.getTablaDemanda()){
            if(val >= rangoX.getDesde() && val <= rangoX.getHasta()) {
                valorRet=rangoX.getValor();
                break;
            }
        }

        return valorRet;
    }

    public static int getDemoraPedidoValue(int val){
        int valorRet=-1;

        //si pertenece al intervalo devuelve la demanda correspondiente a ese intervalo
        for(Intervalo rangoX : Tablas.getTablaDemoraPedido()){
            if(val >= rangoX.getDesde() && val <= rangoX.getHasta()) {
                valorRet=rangoX.getValor();
                break;
            }
        }

        return valorRet;
    }

    public static int getCostoPedidoValue(int val){
        int valorRet=-1;

        //si pertenece al intervalo devuelve la demanda correspondiente a ese intervalo
        for(Intervalo rangoX : Tablas.getTablaCostoPedido()){
            if(val >= rangoX.getDesde() && val <= rangoX.getHasta()) {
                valorRet=rangoX.getValor();
                break;
            }
        }

        return valorRet;
    }


}// Fin clase
