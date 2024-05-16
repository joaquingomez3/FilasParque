
package filasparque;
import java.util.LinkedList;
import java.util.Queue;

public class Juego {
    Queue<Visitante> juego = new LinkedList<>();
    private int ticket;
    private int cont = 0;
    private int capJuego;
    private String nombre;
    public Juego(int ticket, int capJuego, String nombre) {
        this.ticket = ticket;
        this.capJuego = capJuego;
        this.nombre = nombre;
}
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return cont != capJuego;}
}
