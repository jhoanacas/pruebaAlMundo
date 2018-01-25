package co.com.alMundo;

import co.alMundo.enumeradores.EstadoEmpleado;
import co.alMundo.enumeradores.EstadoLlamada;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jhoana Castillo
 */
public class LLamada extends Thread {
    
    //Indica el estado de la llamada.
    private EstadoLlamada estado;
    
    //Tiempo de duracion de la llamada en milisegundos
    private Long tiempoLlamada; 
    
    //Empleado que recibe la llamada
    private Empleado empleado;
    
    
    private Thread thread;
    
    public LLamada() {
    }

    public LLamada(Long tiempoLlamada) {
        this.tiempoLlamada = tiempoLlamada;
    }
    
    public EstadoLlamada getEstado() {
        return estado;
    }

    public Long getTiempoLlamada() {
        return tiempoLlamada;
    }

    public void setTiempoLlamada(Long tiempoLlamada) {
        this.tiempoLlamada = tiempoLlamada;
    }
    
    public void setEstado(EstadoLlamada estado) {
        this.estado = estado;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    public void contestar() {
        estado = EstadoLlamada.INICIADA;
        this.empleado.setEstado(EstadoEmpleado.OCUPADO);
        this.empleado.sumarLlamadasRecibidas();
        this.start();
        System.out.println("LLamada del " + this.empleado.getCargo() + " " + this.empleado.getNombre() + " iniciada ****Tiempo Llamada*** " + this.tiempoLlamada/1000 + "seg");
    }
    
    public void colgar() {
        this.estado = EstadoLlamada.TERMINADA;
        this.empleado.setEstado(EstadoEmpleado.DISPONIBLE);
        System.out.println("LLamada del " +  this.empleado.getCargo() + " " + this.empleado.getNombre() + " terminada, Cantidad de llamadas recibidas = " + empleado.getLlamadasRecibidas());
    }

    @Override
    public void run() {
        try {
            synchronized(this) {
                LLamada.sleep(this.tiempoLlamada);
                this.colgar(); 
            }
        } catch (InterruptedException ex) {
            LLamada.interrupted();
            Logger.getLogger(LLamada.class.getName()).log(Level.SEVERE,"Error contestando la llamada de " + this.empleado.getNombre() , ex);
        }
    }
    
    @Override
    public void start() {
        if(thread == null) {
            this.thread = new Thread(this, this.empleado.getNombre());
            thread.start();
        }
    }
    
    public synchronized void esperar() {
        try {
            this.wait(1000l);
        } catch (InterruptedException ex) {
            Logger.getLogger(LLamada.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
