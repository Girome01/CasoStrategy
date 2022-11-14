/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import ArtesMarciales.IPrototype;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Usuario
 */
public abstract class ArteMarcial implements Strategy, IPrototype{
    private String imagen;
    private String nombre;
    private HashMap<String,Ataque> ataques = new HashMap<>();
    private Jugador refJugador;

    public ArteMarcial(String imagen, String nombre) {
        this.imagen = imagen;
        this.nombre = nombre;
    }
    
    public void addArte(Ataque ataque){
        ataques.put(ataque.getNombre(), ataque);
    }
    
    public HashMap<String,Ataque> getHash(){
        return ataques;
    }
    
    public ArrayList<String> getAtaques(){
        
        return (ArrayList<String>)ataques.keySet();
    }
    
    public ArrayList<Ataque> getAtaques2(String ataque1, String ataque2, String ataque3){
        ArrayList<Ataque> ataquesArr = new ArrayList<>();
        ataquesArr.add(ataques.get(ataque1));
        ataquesArr.add(ataques.get(ataque2));
        ataquesArr.add(ataques.get(ataque3));
        return ataquesArr;
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
    
    @Override
    public void attack(Jugador jugador,Jugador enemigo, String tipoAtaque) {
        Ataque ataque  = ataques.get(tipoAtaque);
        ataque.actualizar(jugador,enemigo);
     }
    
    @Override
    public IPrototype clone() {
        ArteMarcial arteMarcial = new ArteMarcial(imagen, nombre) {};
            
        return arteMarcial;
    }

    @Override
    public IPrototype deepClone() {
        return clone();
    }
     
    
}
