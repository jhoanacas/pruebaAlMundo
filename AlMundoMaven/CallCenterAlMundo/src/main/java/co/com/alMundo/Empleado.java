package co.com.alMundo;

import co.alMundo.enumeradores.Cargo;
import co.alMundo.enumeradores.EstadoEmpleado;


/**
 *
 * @author Jhoana Castillo
 */
public class Empleado {
    
    private Cargo cargo;
    private EstadoEmpleado estado;
    private int prioridad;
    private String nombre;
    private int llamadasRecibidas;

    public Empleado(Cargo cargo, int prioridad, String nombre, EstadoEmpleado estadoEmpleado) {
        this.cargo = cargo;
        this.prioridad = prioridad;
        this.nombre = nombre;
        this.estado = estadoEmpleado;
    }
    
    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public EstadoEmpleado getEstado() {
        return estado;
    }

    public void setEstado(EstadoEmpleado estado) {
        this.estado = estado;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLlamadasRecibidas() {
        return llamadasRecibidas;
    }

    public void setLlamadasRecibidas(int llamadasRecibidas) {
        this.llamadasRecibidas = llamadasRecibidas;
    }
    
    public void sumarLlamadasRecibidas() {
        this.llamadasRecibidas++;
    }
} 
