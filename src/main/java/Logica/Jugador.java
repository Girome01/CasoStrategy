/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public abstract class Jugador {
    protected String nombre;
    protected int vida;
    protected ArteMarcial arteMarcialSelec;
    protected ArrayList<Strategy> artesMarciales;
    protected ArrayList<Ataque> combo;

    public Jugador(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }
    
    public abstract void attack(Jugador jugador,Jugador enemigo, ArrayList<Ataque> combo);
    //Jugador se refiere al enemigo que recibe daño, combo se refiere al combo de ataques que se van a hacer
    
    public abstract void generarCombo();
    //Generar combo asigna un arraylist al atributo combo con las llaves de los ataques que tiene que generar al jugador
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public ArteMarcial getArteMarcialSelec() {
        return arteMarcialSelec;
    }

    public void setArteMarcialSelec(ArteMarcial arteMarcialSelec) {
        this.arteMarcialSelec = arteMarcialSelec;
    }

    public ArrayList<Strategy> getArtesMarciales() {
        return artesMarciales;
    }

    public void setArtesMarciales(ArrayList<Strategy> artesMarciales) {
        this.artesMarciales = artesMarciales;
    }

    public ArrayList<Ataque> getCombo() {
        return combo;
    }

    public void setCombo(ArrayList<Ataque> combo) {
        this.combo = combo;
    }
    
    
    
    
    
}
