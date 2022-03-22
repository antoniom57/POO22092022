/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacomposición;

import Libro.Libro;
import Película.Pelicula;
import actorDirectorProductora.Actor;
import actorDirectorProductora.Director;
import actorDirectorProductora.Productora;
import autorEditorial.Autor;
import autorEditorial.Editorial;

/**
 *
 * @author antonio
 */
public class TareaComposición {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro lib1 = new Libro("El visitante", "Novela",
                new Autor("Stephen King", 74),
                new Editorial("Charles Scribner's Sons", "Estados Unidos"));
        System.out.println(lib1);
        
        System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
       
        Pelicula peli1 = new Pelicula("Doctor Strange: hechicero supremo", "Cine de superhéroes",
                new Actor("Benedict Cumberbatch", 45),
                new Director("Scott Derrickson", 55),
                new Productora("Marvel Studios", "Estados Unidos"));
        System.out.println(peli1);
        
    }
    
}
