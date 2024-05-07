/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filasparque;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Usuario
 */
public class Parque {

    Queue<Integer> parque = new LinkedList<>();
    private int cantidad;

    public Parque() {
        this.cantidad = 100;
    }

    public Queue<Integer> getParque() {
        return parque;
    }

    public void setParque(Queue<Integer> parque) {
        this.parque = parque;
    }

    public void capacidadParque() {
        //Comprobar cuanta gente hay dentro del parque y cuento espacio queda

    }

    public void ingreso() {
        //ver si hay lugar, si hay lugar, agregar al visitante, tomar dato de nombre apellido e 
        //id que sera el que ayudara a las buscquedas
    }
    
    public void salida(){
        //salen a distinto tiempo del que entrarn al parque.
        //la salida es aleatoria, 
    }
    
    public void buscarVisitante(Visitante Identificador ){
        //busca por identificador el visitante que  se consulta
    }
    
    

}
