/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentahabiente;

/**
 *
 * @author antonio
 */
public class CuentahabientePruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cuentahabiente[] lista = new cuentahabiente[4];
        lista[0] = new cuentahabiente("319914-5", "Rene Perez", 50000);
        lista[1] = new cuentahabiente("319195-7", "Juana Lopez", 30000);
        lista[2] = new cuentahabiente("319258-8", "Raul Hernandez", 80000);
        lista[3] = new cuentahabiente("319159-3", "Oscar Sanchez", 10000);
        lista[4] = new cuentahabiente("319657-7", "Jesica Morales", 100000); 
        
        for(cuentahabiente cuentahabiente : lista){
            System.out.println(cuentahabiente.evaluarNivelCliente());
        }
    }
    
}
