/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class JugadorPrincipal extends Jugador{

    public JugadorPrincipal(String nombre, int vida) {
        super(nombre, vida);
    }

    @Override
    public void attack(Jugador jugador,Jugador enemigo, ArrayList<String> combo) {
        
          Random ran = new Random();
        int numGolpes = ran.nextInt(6)+3;
        int seleccionArteMarcial = ran.nextInt(3); //selecciona un arte marcial de los 3 
        
        ArteMarcial arteMarcial = (ArteMarcial)artesMarciales.get(seleccionArteMarcial);
        
        ArrayList<String> ataquesArte  = arteMarcial.getAtaques(); //ataques del arte marcial seleccionado
        
        
        for (int i = 0; i < numGolpes; i++) {
            
            String ataque = ataquesArte.get(ran.nextInt(ataquesArte.size())); //nombre del ataque a realizar
            
            arteMarcial.attack(jugador, jugador, ataque); //ataca al jugador -- Cambiar la referencia del jugador enemigo
            
            combo.add(ataque); //ingresa el ataque a combo
        }
        
    }

    @Override
    public void generarCombo() {    
        
    }
    
}
