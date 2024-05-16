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
public class Juego {

    Queue<Visitante> juego = new LinkedList<>();
    private int ticket;
    private int cont = 0;
    private int capJuego;

    public Juego(int ticket, int capJuego) {
        this.ticket = ticket;
        this.capJuego = capJuego;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int getCapJuego() {
        return capJuego;
    }

    public void setCapJuego(int capJuego) {
        this.capJuego = capJuego;
    }

    public Queue<Visitante> getJuego() {
        return juego;
    }

    public void setJuego(Queue<Visitante> juego) {
        this.juego = juego;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public boolean capJuego() {
        //Comprobar cuanta gente hay dentro del parque
        return cont != capJuego;
    }

    public void ingresoJuego(Visitante visitante) {
        // ingresa a la fila por id;
        if (capJuego()){
            visitante.setTicket(ticket);
           juego.add(visitante);
        cont++;
    }
        else{
            System.out.println("fila llena");
        }
    }

    public void salidaJuego() {
        //salen los que ya pasaron al juego
        
        juego.poll();
        cont--;  
    }


}
