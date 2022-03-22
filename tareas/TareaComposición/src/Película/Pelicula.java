/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Película;

import actorDirectorProductora.Director;
import actorDirectorProductora.Productora;
import actorDirectorProductora.Actor;

/**
 *
 * @author antonio
 */
public class Pelicula {
    private String titulo;
    private String genero;
    private Actor actor;
    private Director director;
    private Productora productora;

    public Pelicula() {
        actor = new Actor();
        director = new Director();
        productora = new Productora();
    }

    public Pelicula(String titulo, String genero, Actor actor, Director director, Productora productora) {
        this.titulo = titulo;
        this.genero = genero;
        this.actor = actor;
        this.director = director;
        this.productora = productora;
    }

    public Productora getProductora() {
        return productora;
    }

    public void setProductora(Productora productora) {
        this.productora = productora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", genero=" + genero + ", actor=" + actor + ", director=" + director + ", productora=" + productora + '}';
    }
    
    public void ver(){
        System.out.println("Viendo la pelicula " + this.titulo);
    }
}
