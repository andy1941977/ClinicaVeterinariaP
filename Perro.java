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
public class Perro extends Mascota {

    public Perro(int codigo, String alias, String sexo, String especie, String raza, String colorPelo, Date fechaNacimiento, double peso, double promedioPeso) {
        super(codigo, alias, sexo, especie, raza, colorPelo, fechaNacimiento, peso, promedioPeso);
    }
    

    @Override
    public void promedioPeso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
