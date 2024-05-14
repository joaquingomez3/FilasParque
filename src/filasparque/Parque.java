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

    Queue<Visitante> parque = new LinkedList<>();
    private int CapFila;
     private int cont = 0;

    public Parque(int capacidadParque, int cantidadFila) {
        this.CapFila = 100;
    }

    public Queue<Visitante> getParque() {
        return parque;
    }

    public void setParque(Queue<Visitante> parque) {
        this.parque = parque;
    }

    public int getCapFila() {
        return CapFila;
    }

    public void setCapFila(int CapFila) {
        this.CapFila = CapFila;
    }

    public boolean CapParque() {
        //Comprobar cuanta gente hay dentro del parque
        return cont != CapFila;
    }

    public void ingreso() {
        //ver si hay lugar, si hay lugar, agregar al visitante, tomar dato de nombre apellido e 
        //id que sera el que ayudara a las buscquedas
        //capoacidad true
        // ingresa persona 
        //contandor 
        if (CapParque() == true) {
            String nombre = "Juan";
            String apellido = "Perez";
            Visitante visitante = new Visitante(nombre, apellido, cont,0);
            parque.add(visitante);
            System.out.println("Ingreso al parque y su identificador es :" + nombre + cont);
        } else {
            System.out.println("Esta lleno el parque");
        }

    }

    public void salida(int identificador) {
        //salen a distinto tiempo del que entrarn al parque.
        //la salida es aleatoria, 
        Queue<Visitante> aux = new LinkedList<>();
        for (Visitante visitante : parque) {
            if (visitante.getIdentificador() == identificador) {
                System.out.println("El visitante" + parque.peek() + " ha salido del parque");
                parque.poll();
            } else {
                aux.add(visitante);
                parque.poll();
            }
        }
        for (Visitante visitante : aux) {
            parque.add(visitante);
        }

    }

    public void buscarVisitante(int identificador) {
        //busca por identificador el visitante que  se consulta
        Queue<Visitante> aux = new LinkedList<>();
        int contador = 1;
        for (Visitante visitante : parque) {
            if (visitante.getIdentificador() == identificador) {
                System.out.println("El visitante: " + parque.peek() + " esta en la posicion: " + contador);
                 aux.add(visitante);
                parque.poll();
                contador++;
            } else {
                aux.add(visitante);
                parque.poll();
            }
        }
        for (Visitante visitante : aux) {
            parque.add(visitante);
        }
    }

}
