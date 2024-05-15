/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filasparque;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

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
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese su nombre :");
            String nombre = leer.nextLine();
            System.out.println("Ingrese su apellido :");
            String apellido = leer.nextLine();
            System.out.println("Ingrese su Documento :");
            leer.nextInt();
            int identificador = leer.nextInt();
            while (buscarVisitante(identificador) == true) {
                System.out.println("Ya existe un visitante con ese identificador, ingrese otro");
                identificador = leer.nextInt();
            }
            Visitante visitante = new Visitante(nombre, apellido, identificador, 0);
            parque.add(visitante);
            System.out.println("Ingreso al parque y su identificador es :" + identificador + "disfrute el parque "+nombre);
            cont++;
        } else {
            System.out.println("El parque esta a su limite, intente mas tarde");
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
                cont--;
            }
        }
        for (Visitante visitante : aux) {
            parque.add(visitante);
        }

    }

    public boolean buscarVisitante(int identificador) {
        //busca por identificador el visitante que  se consulta
        Queue<Visitante> aux = new LinkedList<>();
        int contador = 0;
        for (Visitante visitante : parque) {
            if (visitante.getIdentificador() == identificador) {
                contador++;
                System.out.println("El visitante: " + parque.peek() + " esta en la posicion: " + contador);
                aux.add(visitante);
                parque.poll();

            } else {
                aux.add(visitante);
                parque.poll();
            }
        }
        for (Visitante visitante : aux) {
            parque.add(visitante);
        }

        if (contador == 0) {
            return false;
        } else {
            return true;
        }
    }

}
