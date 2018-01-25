/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.alMundo;

import co.alMundo.enumeradores.Cargo;
import co.alMundo.enumeradores.EstadoEmpleado;

/**
 *
 * @author Jhoana Castillo
 */
public class Director extends Empleado{

    public Director(Cargo cargo, int prioridad, String nombre, EstadoEmpleado estadoEmpleado) {
        super(cargo, prioridad, nombre, estadoEmpleado);
    }
    
}
