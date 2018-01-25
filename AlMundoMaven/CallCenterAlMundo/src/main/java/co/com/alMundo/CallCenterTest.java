package co.com.alMundo;

import co.alMundo.enumeradores.Cargo;
import co.alMundo.enumeradores.EstadoEmpleado;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhoana Castillo
 */
public class CallCenterTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        Dispatcher dispatcher = new Dispatcher();
        
         
        Director emp1 = new Director(Cargo.DIRECTOR, 3,"Diana Suarez",EstadoEmpleado.DISPONIBLE);
        empleados.add(emp1);
        Supervisor emp2 = new Supervisor(Cargo.SUPERVISOR, 2,"Pedro Rojas",EstadoEmpleado.DISPONIBLE);
        empleados.add(emp2);
        Operador emp3 = new Operador(Cargo.OPERADOR, 1,"Sandra Garcia",EstadoEmpleado.DISPONIBLE);
        empleados.add(emp3);
        Supervisor emp4 = new Supervisor(Cargo.OPERADOR, 2,"Daniel Zuluaga",EstadoEmpleado.DISPONIBLE);
        empleados.add(emp4);
        Operador emp5 = new Operador(Cargo.OPERADOR, 1,"Jhon Mora",EstadoEmpleado.DISPONIBLE);
        empleados.add(emp5);
        Operador emp6 = new Operador(Cargo.OPERADOR, 1,"Lucia Torres",EstadoEmpleado.DISPONIBLE);
        empleados.add(emp6);
        Operador emp7 = new Operador(Cargo.OPERADOR, 1,"Viviana Pabon",EstadoEmpleado.DISPONIBLE);
        empleados.add(emp7);
        Operador emp8 = new Operador(Cargo.OPERADOR, 1,"Sara Casas",EstadoEmpleado.DISPONIBLE);
        empleados.add(emp8);
        Operador emp9 = new Operador(Cargo.OPERADOR, 2,"Pedro Martinez",EstadoEmpleado.DISPONIBLE);
        empleados.add(emp9);
        Operador emp10 = new Operador(Cargo.OPERADOR, 1,"Daniela Alarcon",EstadoEmpleado.DISPONIBLE);
        empleados.add(emp10);
        Operador emp11 = new Operador(Cargo.OPERADOR, 1,"Erika Bello",EstadoEmpleado.DISPONIBLE);
        empleados.add(emp11);
        Supervisor emp12 = new Supervisor(Cargo.SUPERVISOR, 1,"Juan Manuel Castillo",EstadoEmpleado.DISPONIBLE);
        empleados.add(emp12);
             
        dispatcher.setEmpleados(empleados);
        for (int i = 0; i<20; i++) {
            dispatcher.dispatchCall();
        }
        
    }
    
}
