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
    private String nombre;
    private int vida;
    private int arteMarcialSelec;
    private ArrayList<Strategy> artesMarciales;
    private ArrayList<String> combo;

    public Jugador(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }
    
    public abstract void attack(Jugador jugador, ArrayList<String> combo);
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

    public int getArteMarcialSelec() {
        return arteMarcialSelec;
    }

    public void setArteMarcialSelec(int arteMarcialSelec) {
        this.arteMarcialSelec = arteMarcialSelec;
    }

    public ArrayList<Strategy> getArtesMarciales() {
        return artesMarciales;
    }

    public void setArtesMarciales(ArrayList<Strategy> artesMarciales) {
        this.artesMarciales = artesMarciales;
    }

    public ArrayList<String> getCombo() {
        return combo;
    }

    public void setCombo(ArrayList<String> combo) {
        this.combo = combo;
    }
    
    
    
    
    
}
