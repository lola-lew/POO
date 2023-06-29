/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author VBehe
 */
public class PersonaServicio {
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public Persona crearPersona () {
        
        Persona persona1 = new Persona();
        
        System.out.println("Ingresa el nombre de la persona");
        persona1.setNombre(leer.next());
        
        System.out.println("Ingresa el año");
        int anio = (leer.nextInt() - 1900);
        System.out.println("Ingresa el mes");
        int mes = (leer.nextInt()-1); 
        System.out.println("Ingresa el día");
        int dia = (leer.nextInt());
        
        Date fecha = new Date (anio,mes, dia);
        
        persona1.setFecha(fecha);
        
        return persona1;
    }
    
    public int calcularEdad(Persona persona1){

        
        Period edadPersona = Period.between(LocalDate.of(persona1.getFecha().getYear(), persona1.getFecha().getMonth(), persona1.getFecha().getDay()), LocalDate.now());
        
        int edad = (edadPersona.getYears() - 1900);
        
        return edad;
    }
    
    public boolean menorQue (int edad) {
        
       
        System.out.println("Ingresa la edad con la que quieres comparar la edad calculada");
        int nuevaEdad = leer.nextInt();
        
        if (edad>nuevaEdad) {
            
            return true;
        } else { return false;
    }
}

    public void mostrarPersona (Persona persona1) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Esta es la persona creada:");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Fecha de nacimiento: " + sdf.format(persona1.getFecha()));
    }


}
