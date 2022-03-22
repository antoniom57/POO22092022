/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

import autorEditorial.Autor;
import autorEditorial.Editorial;

 
/**
 *
 * @author antonio
 */
public class Libro {
    private String nombre;
    private String genero;
    private Autor autor;
    private Editorial editorial;

    public Libro() {
        autor = new Autor();
        editorial = new Editorial();
    }

    public Libro(String nombre, String genero, Autor autor, Editorial editorial) {
        this.nombre = nombre;
        this.genero = genero;
        this.autor = autor;
        this.editorial = editorial;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", genero=" + genero + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
    
    public void leer(){
        System.out.println("Leyendo el libro " + this.nombre);
    }
       
 
}
