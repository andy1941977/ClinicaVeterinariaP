/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.Modelo;

/**
 *
 * @author Usuario
 */
public class Cliente {
    private int dni;
    private String nombre;
    private String direccion;
    private int telefono;
    private String personaAlternativo;
    private Mascota mascota;

    public Cliente(int dni, String nombre, String direccion, int telefono, String personaAlternativo, Mascota mascota) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.personaAlternativo = personaAlternativo;
        this.mascota = mascota;
        
    }

    public Cliente() {
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getPersonaAlternativo() {
        return personaAlternativo;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setPersonaAlternativo(String personaAlternativo) {
        this.personaAlternativo = personaAlternativo;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    
    
}
