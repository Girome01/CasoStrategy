/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.Random;

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
    
    public String actualizar(Jugador jugador,Jugador enemigo){
        //la idea es pon;er un switch donde en la opcion 1 se actualice la vida, 2 se aumente danno, 3 ambas cosas
        Random ran = new Random();
        switch (actualizacion) {
            case 1:
                //Se cura el jugadorJ
                jugador.setVida(jugador.getVida()+ran.nextInt(10)+5);
                break; 
            case 2:
                //Aumenta el daño
                enemigo.setVida(enemigo.getVida()-damage+(ran.nextInt(10)+5));
                break;
            case 3:
                //Ambas
                jugador.setVida(jugador.getVida()+ran.nextInt(10)+5);
                enemigo.setVida(enemigo.getVida()-damage+(ran.nextInt(10)+5));
                break;
            case 4: 
                //Danno
                enemigo.setVida(enemigo.getVida()-damage);
                break;
             
            default:
                System.out.println("Error, elija una opcion valida");;
        }
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
