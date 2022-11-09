/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Usuario
 */
public abstract class ArteMarcial implements Strategy{
    private String imagen;
    private String nombre;
    private HashMap<String,Ataque> ataques;
    private Jugador refJugador;

    public ArteMarcial(String imagen, String nombre) {
        this.imagen = imagen;
        this.nombre = nombre;
    }
    
    public ArrayList<String> getAtaques(){
        //Devolver en string las keys del hasmap para saber todos los ataques
        return null;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Jugador getRefJugador() {
        return refJugador;
    }

    public void setRefJugador(Jugador refJugador) {
        this.refJugador = refJugador;
    }
    
    public void setAtaques(HashMap<String, Ataque> ataques){
        this.ataques = ataques;
    }
}
