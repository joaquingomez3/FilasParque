
package filasparque;


public class FilasParque {

    
    public static void main(String[] args) {
        Parque parque = new Parque(100); //creacion de parque
        
        Juego casaEmbrujada = new Juego(1, 20, "Casa Embrujada");//creacion de juegos
        Juego montañaRusa = new Juego(2, 10, "Montaña Rusa");
        Juego espejos = new Juego(3, 2, "Espejitos Magicos");
        
        Visitante a = new Visitante("Carla", "perez", 1234, 0); //creacion de visitantes
        Visitante b = new Visitante("Pedro", "Rodriguez", 2345, 0);
        Visitante c = new Visitante("Luisa", "Carrera", 3456, 0);
        
        parque.ingreso(a); // ingresamos al parque visitantes por parametro
        parque.ingreso(b);
        parque.ingreso(c);
        
        parque.buscarVisitante(2345); // buscamos un vistitante en el parque
        
        parque.ingresoJuego(espejos, 1234); //ingresamos visitantes a los juegos
        parque.ingresoJuego(espejos, 3456);
        parque.ingresoJuego(espejos, 2345);
        parque.ingresoJuego(montañaRusa, 1234);
        
        parque.buscarVisitante(1234); 
        
        parque.buscarEnJuego(espejos, 1234); /// buscamos visitante en juegos
        
        parque.salidaJuego(espejos); //salida de los juegos
        parque.salidaJuego(espejos);
        parque.salidaJuego(espejos);
        
        parque.ingresoJuego(espejos, 1234);
        
        parque.salida(1234);
        
        parque.buscarVisitante(1234);
        
        parque.salida(1234);
        }
        }
 
    
    

