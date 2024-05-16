
package filasparque;

public class Visitante {
    
    private String nombre;
    private String apellido;
    private int identificador;
    private int ticket;
    public Visitante(String nombre, String apellido, int identificador, int ticket) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificador = identificador;
        this.ticket = 0;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    public int getTicket() {
        return ticket;
    }
    public void setTicket(int ticket) {
        this.ticket = ticket;
    }
    @Override
    public String toString() {
        return "visitante " + nombre + " con identificador " + identificador;
    }
}

    
 
    

