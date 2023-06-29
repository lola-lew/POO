/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopersona;

import Entidades.Persona;
import Servicios.PersonaServicio;
import java.text.SimpleDateFormat;

/**
 *
 * @author VBehe
 */
public class ProyectoPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        PersonaServicio ns = new PersonaServicio();
        
        Persona p1 = ns.crearPersona();
        
        System.out.println("El nombre de la persona es: " + p1.getNombre());
        System.out.println("La fecha de nacimiento de la persona es: " + sdf.format(p1.getFecha()));
        
        int edad = ns.calcularEdad(p1);
        
        System.out.println ("La edad de esta persona es: " + edad );
       
        boolean menorQue = ns.menorQue(edad);
        
        if (menorQue == true) {
            
            System.out.println("La nueva edad ingresada es menor a la de la persona que creaste");
        } else { System.out.println ("La nueva edad ingresada es mayor a la de la persona que creaste");
    }
    
        ns.mostrarPersona(p1);
} }
