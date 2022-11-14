/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Javi
 */
public class Juego {
    
    JugadorPrincipal jugador;
    JugadorNPC jugadorNPC;
    HashMap<String, ArteMarcial> artesMarciales = new HashMap<>();
    

    public JugadorPrincipal getJugador() {
        return jugador;
    }

    public void setJugador(JugadorPrincipal jugador) {
        this.jugador = jugador;
    }

    public JugadorNPC getJugadorNPC() {
        return jugadorNPC;
    }

    public void setJugadorNPC(JugadorNPC jugadorNPC) {
        this.jugadorNPC = jugadorNPC;
    }

    public HashMap<String, ArteMarcial> getArtesMarciales() {
        return artesMarciales;
    }

    public void setArtesMarciales(HashMap<String, ArteMarcial> artesMarciales) {
        this.artesMarciales = artesMarciales;
    }
       
    public void generarCombo(Jugador jugadorSelec){
       jugadorSelec.generarCombo(); //crea el combo de ataque
   }
    
   public void attackNPC(){ //ataca el NPC
       jugadorNPC.attack(jugadorNPC,jugador,jugadorNPC.combo);
       jugadorNPC.getCombo().clear();
        
   }
   
    public void attackJugador(){  //ataca el jugador
       jugador.attack(jugador,jugadorNPC,jugador.combo);
       jugador.getCombo().clear();
     
   }
   
   public int actualizarVida(Jugador jugadorSelec){
       return jugadorSelec.vida;
   }
   
   public void cambiarArtesJugador(Jugador jugadorSelec ){
       
       jugadorSelec.artesMarciales.clear();
       
       Set<String> nombreArtes1 = artesMarciales.keySet();
       ArrayList<String> nombreArtes = new ArrayList<>(nombreArtes1);
       
       
       for (int i = 0; i < 3; i++) {
           
            Random ran = new Random();
            int arteRandom = ran.nextInt(10);
            
            String nombre = nombreArtes.get(arteRandom);
            jugadorSelec.getArtesMarciales().add(artesMarciales.get(nombre));
           
       }
       
   }
      
}
