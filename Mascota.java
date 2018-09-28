/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.Modelo;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public abstract class Mascota {
    private int codigo ;
    private String alias;
    private String sexo;
    private String especie;
    private String raza;
    private String colorPelo;
    private Date fechaNacimiento;
    private double peso;
    private double promedioPeso;

    public Mascota(int codigo, String alias, String sexo, String especie, String raza, String colorPelo, Date fechaNacimiento, double peso, double promedioPeso) {
        this.codigo = codigo;
        this.alias = alias;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.promedioPeso = promedioPeso;
    }

    public Mascota() {
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public String getAlias() {
        return alias;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaza() {
        return raza;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public abstract void promedioPeso();
        

    
}
