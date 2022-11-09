/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Usuario
 */
public class Ataque {
    private String nombre;
    private int damage;
    private int actualizacion;

    public Ataque(String nombre, int damage) {
        this.nombre = nombre;
        this.damage = damage;
    }
    
    public String actualizar(Jugador jugador){
        //la idea es poner un switch donde en la opcion 1 se actualice la vida, 2 se aumente danno, 3 ambas cosas
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getActualizacion() {
        return actualizacion;
    }

    public void setActualizacion(int actualizacion) {
        this.actualizacion = actualizacion;
    }
}
