/*
 Cola de clientes a ser atendidos por Servidor / Servicio. Cada servidor tiene una unica colaDeClientes o comparte la misma con otro servidor
 */
package comunes;

import java.util.ArrayList;

/**
 *
 * @author lucianoarguello
 */
public class ColaDeClientes {

    private ArrayList<Cliente> colaDeClientes;

    public ColaDeClientes() {
        colaDeClientes = new ArrayList();
    }

    public int getNumeroClientes() {
        return colaDeClientes.size();
    }

    public Cliente getProximoClienteLIFO() {
        return colaDeClientes.get(colaDeClientes.size()-1);
    }

    public Cliente getProximoClienteFIFO() {
        return colaDeClientes.get(0);
    }
}
