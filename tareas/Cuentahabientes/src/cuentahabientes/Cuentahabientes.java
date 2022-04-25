/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentahabientes;

/**
 *
 * @author antonio
 */
public class Cuentahabientes {
    
    private String idCliente;
    private String nombre;
    private float balance;

    public Cuentahabientes() {
    }

    public Cuentahabientes(String idCliente, String nombre, float balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cuentahabientes{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", balance=" + balance + '}';
    }
    
    public void retirarDinero(float monto){
        System.out.println("Tu saldo es de: " + balance);
        balance = balance - monto;
        System.out.println("Saldo actual: " + balance );
    }
    
    public String evaluarNivelCliente(){
        
        return this.balance>50000.0f?"Cliente premium":"Cliente regular";
        
    }
    
}
