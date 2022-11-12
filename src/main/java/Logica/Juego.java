/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Javi
 */
public class Juego {
    
    JugadorPrincipal jugador;
    JugadorNPC jugadorNPC;
    
    
   public void attackNPC(){ //ataca el NPC
       jugadorNPC.generarCombo(); //crea el combo de ataque
       jugadorNPC.attack(jugadorNPC,jugador,jugadorNPC.combo);
       
   
   }
   
    public void attackJugador(){  //ataca el jugador
       jugadorNPC.generarCombo(); //crea el combo de ataque
       jugadorNPC.attack(jugador,jugadorNPC,jugador.combo);
       
   
   }
   
   public int actualizarVida(Jugador jugador){
       return jugador.vida;
   }
   
    
          
}
