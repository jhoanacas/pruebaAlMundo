package co.com.alMundo.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import co.alMundo.enumeradores.Cargo;
import co.alMundo.enumeradores.EstadoEmpleado;
import co.com.alMundo.Director;
import co.com.alMundo.Dispatcher;
import co.com.alMundo.Empleado;
import co.com.alMundo.Operador;
import co.com.alMundo.Supervisor;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jhoana castillo
 */
public class CallCenterJUnitTest {
    
    public CallCenterJUnitTest() {
    }
    
    /**
     * Test que envia 10 llamadas, que se envian a 12 empleados de los cuales hay 9 operadores,
     * dos supervisor y un director donde se muestra que no se asignan llamadas al director y que 
     * las 10 llamadas son atendindas.
     */
    @Test
    public void testCallCenterDiezLlamadas() {
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
        for (int i = 0; i<10; i++) {
            dispatcher.dispatchCall();
        }
        
        assertTrue(dispatcher.getLlamadasContestadas().size()== 10);
        assertTrue(emp1.getLlamadasRecibidas() == 0);
        
    }
    
    
    /**
     * Test que envia 20 llamadas, que se envian a 12 empleados de los cuales hay 9 operadores,
     * dos supervisor y un director donde se muestra que todas las llamadas son recibidas.
     */
    @Test
    public void testCallCenterVienteLlamadas() {
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
        
        assertTrue(dispatcher.getLlamadasContestadas().size()== 20);
        
    }
    
}
