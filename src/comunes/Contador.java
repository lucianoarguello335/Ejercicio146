/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunes;

/**
 *
 * @author lucianoarguello
 */
public class Contador {
    private int contador;
    
    public Contador(){
        contador=0;
    }
    
    public void contar(){
    contador++;    
    }
    
    public int getContador(){
        return contador;
    }
}
