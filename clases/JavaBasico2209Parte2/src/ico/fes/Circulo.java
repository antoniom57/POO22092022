/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author antonio
 */
public class Circulo implements Figura{
    
    private float radio;

    
    //java bean o POJO, es diferente a los EJB Enterprise Java Beans
    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public float calcularArea() {
        return Figura.PI * (this.radio * this.radio);
        /*
        Principio de diseño de lenguaje de progrmacion: 0, 1 e infinito
        Solo los valores 0.1 e infinitos son validos para usarse en la 
        codificacion de algoritmos.
        El lenguajes de programacion debe proporcionar un mecaniso para
        evitar usar literales numericas en el programa.
        */
        
    }
    
    
    
}
