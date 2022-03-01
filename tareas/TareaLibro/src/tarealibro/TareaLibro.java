/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarealibro;

/**
 *
 * @author antonio
 */
public class TareaLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libro lib1 = new Libro();
        lib1.setNombre("El visitante");
        lib1.setAutor("Stephen King");
        lib1.setEditorial("Charles Scribner's Sons");
        lib1.setAño(2018);
        lib1.setPaginas(586);
        
        System.out.println("Nombre: " + lib1.getNombre());
        System.out.println("Autor: " + lib1.getAutor());
        System.out.println("Editorial: " + lib1.getEditorial());
        System.out.println("Año: " + lib1.getAño());
        System.out.println("Paginas: " + lib1.getPaginas()); 
        lib1.leer();
        lib1.subrayar();
        
        
        Libro lib2 = new Libro();
        lib2.setNombre("El alquimista");
        lib2.setAutor("Paulo Coelho");
        lib2.setEditorial("Booket");
        lib2.setAño(1988);
        lib2.setPaginas(192);
        
        System.out.println("Nombre: " + lib2.getNombre());
        System.out.println("Autor: " + lib2.getAutor());
        System.out.println("Editorial: " + lib2.getEditorial());
        System.out.println("Año: " + lib2.getAño());
        System.out.println("Paginas: " + lib2.getPaginas()); 
        lib2.leer();
        lib2.subrayar();
       
        // TODO code application logic here
    }
    
}
