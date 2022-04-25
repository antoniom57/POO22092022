/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentahabientes;

/**
 *
 * @author antonio
 */
public class PruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Cuentahabientes[] lista = new Cuentahabientes[5];
       lista[0]= new Cuentahabientes("319159-9", "Rene Perez", 50001);
       lista[1]= new Cuentahabientes("319951-1", "Juana Ortiz", 50000);
       lista[2]= new Cuentahabientes("319357-7", "Oscar Sanchez", 80000);
       lista[3]= new Cuentahabientes("319753-3", "Raul Hernandez", 20000);
       lista[4]= new Cuentahabientes("319468-8", "Jesica Morales", 100000);
       
       
       
       for(Cuentahabientes cuentahabientes : lista){
           System.out.println(cuentahabientes.evaluarNivelCliente());
       }
       
       
       
    }

}
