/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarealibro;

/**
 *
 * @author antonio
 */
public class Libro {
    private String nombre;
    private String autor;
    private String editorial;
    private int año;
    private int paginas;

    public Libro() {
    }

    public Libro(String nombre, String autor, String editorial, String pais, int año, int paginas) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.año = año;
        this.paginas = paginas;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }


    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public void leer(){
        System.out.println ("Leyendo el libro " + this.nombre );
    }
    
    public void subrayar(){
        System.out.println("Subrayando el libro " + this.nombre );
    }
    
}
