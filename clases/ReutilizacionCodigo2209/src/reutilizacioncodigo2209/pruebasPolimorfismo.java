/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reutilizacioncodigo2209;

import ico.fes.herencia.Alumno;
import ico.fes.herencia.Persona;

/**
 *
 * @author antonio
 */
public class pruebasPolimorfismo {
    public static void main(String[] args) {
        System.out.println("hola polimorfismo");
        Persona per1 = new Persona();
        per1.setNombre("José");
        per1.dormir();
        
        Alumno al1 = new Alumno();
        al1.setNombre("José");
        al1.dormir();
        al1.dormir(4);
    }
}
