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
    
      Queue<Integer> juego= new LinkedList<>();
      Visitante id;

    public Juego(Visitante id) {
        this.id = id;
    }

    public Queue<Integer> getJuego() {
        return juego;
    }

    public void setJuego(Queue<Integer> juego) {
        this.juego = juego;
    }

    public Visitante getId() {
        return id;
    }

    public void setId(Visitante id) {
        this.id = id;
    }
      
      public void ingresoJuego(){
          // ingresa a la fila por id;
      }
      public void salidaJuego(){
          //salen los que ya pasaron al juego
      }
      
      public void capacidadJuego(){
          //ve si hay lugar en la fila para el juego
      }

}
