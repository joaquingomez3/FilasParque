
package filasparque;
import java.util.LinkedList;
import java.util.Queue;

public class Parque {
    Queue<Visitante> parque = new LinkedList<>();
    private int CapFila;
    private int cont = 0;
    
    public Parque(int CapFila) {
        this.CapFila = CapFila;
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
        return cont != CapFila;
    }
    public void ingreso(Visitante visitante) {
        if (CapParque()) {
            if (buscarVisitante(visitante.getIdentificador())) {
                parque.add(visitante);
                System.out.println("Ingreso al parque y su identificador es :" +
                visitante.getIdentificador() + " disfrute el parque " + visitante.getNombre());
                cont++;
            } else {
                System.out.println("Ya existe alguien dentro del parque con este identificador");
    }
    } else {
    System.out.println("El parque esta a su limite, intente mas tarde");
    }
    }
    public void salida(int identificador) {
        Queue<Visitante> aux = new LinkedList<>();
        while (!parque.isEmpty()) {
            Visitante visitante = parque.poll();
            if (visitante.getIdentificador() == identificador) {
                if (visitante.getTicket() != 0) {
                    System.out.println(visitante.getNombre() + " primero salga del juego " +
                    visitante.getTicket() + " si desea salir del parque");
                }
                System.out.println("El visitante " + visitante + " ha salido del parque.");
                cont--;
            } else {
            aux.add(visitante);
            }
        }
        while (!aux.isEmpty()) {
            parque.add(aux.poll());
        }
    }
    public boolean buscarVisitante(int identificador) {
        Queue<Visitante> aux = new LinkedList<>();
        int contador = 0;
        while (!parque.isEmpty()) {
            Visitante visitante = parque.poll();
            if (visitante.getIdentificador() == identificador) {
                if (visitante.getTicket() == 0) {
                    contador++;
                    System.out.println("El " + visitante + " esta en la fila principal, en la posicion " +
                    contador);
                } else {
                    System.out.println("El " + visitante + " esta en el juego " + visitante.getTicket());
                    }
            } else {
                aux.add(visitante);
                }
        }
        while (!aux.isEmpty()) {
            parque.add(aux.poll());
        }
        return contador == 0;
    }
    public void ingresoJuego(Juego juego, int id) {
        if (juego.capJuego()) {
            Queue<Visitante> aux = new LinkedList<>();
            while (!parque.isEmpty()) {
                Visitante visitante = parque.poll();
                if (visitante.getIdentificador() == id) {
                    if (visitante.getTicket() == 0) {
                        visitante.setTicket(juego.getTicket());
                        System.out.println("Se agrego a " + visitante.getNombre() + " al juego " +
                        juego.getNombre());
                        juego.juego.add(visitante);
                        juego.setCont(juego.getCont() + 1);
                    } else {
                        System.out.println(visitante.getNombre() + " ya se encuentra jugando y no puede ingresar al juego " + juego.getNombre() + " hasta que salga del que ya esta");
                                }
                }
            aux.add(visitante);
                }
            while (!aux.isEmpty()) {
                parque.add(aux.poll());
                }
        } else {
                System.out.println("El juego esta lleno intente en otro momento");
                }
            }
    public void salidaJuego(Juego juego) {
        Queue<Visitante> aux = new LinkedList<>();
        while (!parque.isEmpty()) {
            Visitante visitante = parque.poll();
            if (visitante.getTicket() == juego.getTicket()) {
                visitante.setTicket(0);
                aux.add(visitante);
                juego.setCont(juego.getCont() - 1);
                System.out.println("Salio del juego " + juego.getNombre() + " el " + visitante);
                juego.juego.poll();
            } else {
            aux.add(visitante);
            }
         }
        while (!aux.isEmpty()) {
        parque.add(aux.poll());
            }
    }
    public boolean buscarEnJuego(Juego juego, int id) {
            Queue<Visitante> aux = new LinkedList<>();
            int contador = 0;
            while (!juego.juego.isEmpty()) {
                Visitante visitante = juego.juego.poll();
                if (visitante.getIdentificador() == id) {
                     contador++;
                    System.out.println("El " + visitante + " esta en la posicion: " + contador + "del juego");
                 }
                aux.add(visitante);
            }
            while (!aux.isEmpty()) {
                juego.juego.add(aux.poll());
            }
            return contador != 0;
    }
}

