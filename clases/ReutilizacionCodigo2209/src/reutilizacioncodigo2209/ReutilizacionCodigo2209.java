/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizacioncodigo2209;

import asus.com.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;
import ico.fes.herencia.Alumno;
import ico.fes.herencia.Servidor;
import ico.fes.herencia.poliformismo.Animal;
import ico.fes.herencia.poliformismo.Perro;
import javax.swing.JFrame;

/**
 *
 * @author antonio
 */
public class ReutilizacionCodigo2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = new String("José José");
        System.out.println(nombre);
        System.out.println(nombre.charAt(3));
        System.out.println(nombre.toUpperCase());
        
        /*
        JFrame ventana = new JFrame("Mi primer ventana Java");
        ventana.setSize(600, 400);
        ventana.setVisible(true);
        */
        Computadora miCompu = new Computadora();
        miCompu.setMarca("Asus");
        miCompu.setCpu(new Procesador("Intel", 2.6f));
        System.out.println(miCompu);
        miCompu.getCpu().setMarca("AMD");
        System.out.println(miCompu);
        //ejercicio: establecer un mouse de marca logitech tipo optico
        miCompu.setRaton(new Mouse("Logitech", "Óptico"));
        System.out.println(miCompu);
        
        
        Computadora compu2 = new Computadora("Apple", "MacBook Pro", 
                new Monitor("Toshiba", 14.3f),
                new Mouse("Acteck", "Óptico"), 
                new Teclado("Apple", 101), 
                new Procesador("M1", 3.4f));
        
        System.out.println(compu2);
        
        //mouse apple y touch
        
        compu2.getRaton().setMarca("Apple");
        compu2.getRaton().setTipo("Touch");
        
        System.out.println(compu2);
        System.out.println("----------------------------------------------------");
        Alumno alu1 = new Alumno();
        alu1.setNombre("José");
        System.out.println(alu1);
        
        
        Alumno alu2 = new Alumno("3242342", "ICO", "Jose Perez", 19);
        System.out.println(alu2);
        
        alu1.setNumeroCuenta("46654185");
        alu1.setEdad(19);
        System.out.println(alu1);
        
        System.out.println("______________ composicion y herencia en la misma clase _______________________________");
        Servidor server = new Servidor();
        System.out.println(server);
        server.setNumeroTarjetasRed(2);
        System.out.println(server);
        server.setMarca("HP");
        System.out.println(server);
        server.setRaton(new Mouse("LG", "óptico"));
        System.out.println(server);
        server.getRaton().setMarca("Logitech");
        System.out.println(server);
        
        
        System.out.println("______________________Ejemplo poliformismo___________________________");
        Perro dog = new Perro("Bull dog", "5 estrellas", 4);
        Animal animal1 = new Animal(4);
        dog.emitirSonido();
        animal1.emitirSonido();

        //dog.emitirSonido();
        //((Animal)dog).emitirSonido();
        //Animal animal = (Animal)dog;
        //System.out.println(animal.getClass());
    }
    
}
