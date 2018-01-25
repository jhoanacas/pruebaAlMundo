/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.alMundo;

import co.alMundo.enumeradores.EstadoEmpleado;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Jhoana Castillo
 */
public class Dispatcher {
    List<Empleado> empleados;
    List<LLamada> llamadasContestadas = new ArrayList<>();

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<LLamada> getLlamadasContestadas() {
        return llamadasContestadas;
    }

    public void setLlamadasContestadas(List<LLamada> llamadasContestadas) {
        this.llamadasContestadas = llamadasContestadas;
    }
 
    /**
     * Hace el ordenamiento de los empleados por prioridad y por numero de llamadas recibidas,
     * para nivelar las cargas de los empleados y hacer la asignacion por la prioridad.
     * Además si no hay alguien disponible hace 10 intentos de asignar las llamadas. 
     * 
     * @return 
     */
    public LLamada dispatchCall() {
        
        Comparator<Empleado> comparator = Comparator.comparingInt(empleado -> empleado.getPrioridad());
        empleados.sort(comparator.thenComparing(Comparator.comparingInt(empleado -> empleado.getLlamadasRecibidas())));   

        
        Random random = new Random();
        Integer tiempoLLamada = random.nextInt(10000 - 5000 + 1) + 5000;
        
        LLamada llamada = new LLamada(tiempoLLamada.longValue());
        boolean llamadaContestada = false;
        int intentosFallidos = 0;
        do  {
            if(intentosFallidos <= 10) {
                llamadaContestada = asignarEmpleado(llamada);
            }
            if(llamadaContestada) {
                intentosFallidos = 0;
            } else {
                intentosFallidos++;
            }
        } while(!llamadaContestada);
        
        return llamada;
    }

    private boolean asignarEmpleado(LLamada llamada) {
        for (Empleado empleado : empleados) {
            if(empleado.getEstado().equals(EstadoEmpleado.DISPONIBLE)) {
                llamada.setEmpleado(empleado);
                llamada.contestar();
                llamadasContestadas.add(llamada);
                return true;
            }
        }
        return false;
    }
    
    
}
    
   
    
