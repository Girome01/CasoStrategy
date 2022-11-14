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
public class JugadorNPC extends Jugador{

    public JugadorNPC(String nombre, int vida) {
        super(nombre, vida);
    }

    @Override
    public String attack(Jugador jugador, Jugador enemigo,ArrayList<Ataque> combo) {
        
        String comboGenerado = "";
        for (Ataque ataque : combo) {
            
            ArteMarcial arteMarcial = encontrarArte(ataque.getNombre());
            arteMarcial.attack(jugador, enemigo, ataque.getNombre());
            comboGenerado += ataque.getNombre()+" ";
            
        }
           
        return comboGenerado;
        
    }

    @Override
    public void generarCombo() {
        
        Random ran = new Random();
        int numGolpes = ran.nextInt(3)+3;
        int seleccionArteMarcial; //selecciona un arte marcial de los 3 
        
        ArteMarcial arteMarcial;
        
        ArrayList<String> ataquesArte ; //ataques del arte marcial seleccionado
        
        
        for (int i = 0; i < numGolpes; i++) {
            
            seleccionArteMarcial = ran.nextInt(3); //selecciona un arte marcial de los 3 
        
            arteMarcial = (ArteMarcial)artesMarciales.get(seleccionArteMarcial);
        
            ataquesArte  = arteMarcial.getAtaques(); //ataques del arte marcial seleccionado

            String ataqueNombre = ataquesArte.get(ran.nextInt(ataquesArte.size())); //nombre del ataque a realizar
            
            Ataque ataque = arteMarcial.getHash().get(ataqueNombre);
            
            combo.add(ataque); //agrega el ataque al combo
            
        }
        
    }
    
    public ArteMarcial encontrarArte(String nombre){
        
        
        for (Strategy arte : artesMarciales) {
            
              ArteMarcial arteSeleccionado = (ArteMarcial)arte;
              ArrayList<String> ataquesArte  = arteSeleccionado.getAtaques(); //ataques del arte marcial seleccionado
              
              if(ataquesArte.get(0).equals(nombre) || ataquesArte.get(1).equals(nombre) || ataquesArte.get(2).equals(nombre)){
              
                  return arteSeleccionado;
              }  
        }
        return null;
    
    }
    
}
