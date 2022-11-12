/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArtesMarciales;

import Logica.ArteMarcial;
import Logica.Jugador;

/**
 *
 * @author Usuario
 */
public class ArtesMarcialesMixtas extends ArteMarcial{

    public ArtesMarcialesMixtas(String imagen, String nombre) {
        super(imagen, nombre);
    }


    @Override
    public IPrototype clone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IPrototype deepClone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
