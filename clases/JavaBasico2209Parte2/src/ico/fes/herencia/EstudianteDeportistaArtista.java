/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

/**
 *
 * @author antonio
 */
public class EstudianteDeportistaArtista extends Persona implements Deportista,Artista{
    private String carrera;
    private String numeroCuenta;
    private String disciplinaDportiva;
    private String generoArtistico;

    public EstudianteDeportistaArtista() {
    }

    public EstudianteDeportistaArtista(String carrera, String numeroCuenta, String disciplinaDportiva, String generoArtistico) {
        this.carrera = carrera;
        this.numeroCuenta = numeroCuenta;
        this.disciplinaDportiva = disciplinaDportiva;
        this.generoArtistico = generoArtistico;
    }

    public String getGeneroArtistico() {
        return generoArtistico;
    }

    public void setGeneroArtistico(String generoArtistico) {
        this.generoArtistico = generoArtistico;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getDisciplinaDportiva() {
        return disciplinaDportiva;
    }

    public void setDisciplinaDportiva(String disciplinaDportiva) {
        this.disciplinaDportiva = disciplinaDportiva;
    }

    

    @Override
    public void entrenar() {
        System.out.println(this.nombre + " Esta entrenando " + this.disciplinaDportiva);
    }

    @Override
    public void jugar() {
        System.out.println(this.nombre + "Esta jugando" + this.disciplinaDportiva);
        
    }

    @Override
    public void ensayar() {
        System.out.println(this.nombre + " Esta ensayando/practicando " + this.generoArtistico);
        
    }

    @Override
    public void presentar() {
        System.out.println(this.nombre + "Esta presentando su obra de " + this.generoArtistico);
        
    }
    
    
}
