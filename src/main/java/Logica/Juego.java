/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author Javi
 */
public class Juego {
    
    JugadorPrincipal jugador;
    JugadorNPC jugadorNPC;
    HashMap<String, ArteMarcial> artesMarciales = new HashMap<>();
    
    
    
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
       
       ArrayList<String> nombreArtes = (ArrayList<String>) artesMarciales.keySet();
       
       for (int i = 0; i < 3; i++) {
           
            Random ran = new Random();
            int arteRandom = ran.nextInt(10);
            
            String nombre = nombreArtes.get(arteRandom);
            jugadorSelec.getArtesMarciales().add(artesMarciales.get(nombre));
           
       }
       
   }
      
}
