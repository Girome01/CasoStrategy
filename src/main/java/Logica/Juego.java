/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;



import ArtesMarciales.*;
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

    public Juego(JugadorPrincipal jugador, JugadorNPC jugadorNPC) {
        this.jugador = jugador;
        this.jugadorNPC = jugadorNPC;
    }
    
    
   
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
    
   public String attackNPC(){ //ataca el NPC
       String combo = jugadorNPC.attack(jugadorNPC,jugador,jugadorNPC.combo);
       jugadorNPC.getCombo().clear();
       return combo;
   }
   
    public String attackJugador(){  //ataca el jugador
       String combo = jugador.attack(jugador,jugadorNPC,jugador.combo);
       jugador.getCombo().clear();
       return combo;
   }
   
   public int actualizarVida(Jugador jugadorSelec){
       return jugadorSelec.vida;
   }
   
   public void cambiarArtesJugador(Jugador jugadorSelec ){
       
       jugadorSelec.artesMarciales.clear(); // limpia las que tiene
       
       Set<String> nombreArtes1 = artesMarciales.keySet();  //arte existentes
       ArrayList<String> nombreArtes = new ArrayList<>(nombreArtes1); //lo convierte en un array
       
       
       for (int i = 0; i < 3; i++) {
           
            Random ran = new Random();
            int arteRandom = ran.nextInt(this.artesMarciales.size());  //random del largo de las artes
            
            String nombre = nombreArtes.get(arteRandom);
            if(!esRepetido(jugadorSelec,nombre)){
                jugadorSelec.getArtesMarciales().add((ArteMarcial)artesMarciales.get(nombre).clone());
            }
            else
                i--;
       }
       
       System.out.println(jugadorSelec.getArtesMarciales());
   }
   
   public boolean esRepetido(Jugador jugadorSelec, String nombre){
        for (ArteMarcial arte: jugadorSelec.getArtesMarciales()) {
           if(arte.getNombre().equals(nombre))
               return true;
        }
       return false;
   
   }
   
   public void crearArtes(){
       
       String url = "src/main/java/Images/";
       
       //KARATE
        Ataque maeGeri = new Ataque("Mae Geri",10,4);
        Ataque yokoGeri = new Ataque("Yoko Geri",5,3);
        Ataque MawashiGeri = new Ataque("Mawashi Geri",30,4);
        
        Karate karate = new Karate(url+"karate.jpg", "Karate");
        karate.addArte(maeGeri);
        karate.addArte(yokoGeri);
        karate.addArte(MawashiGeri);
        
        
        //BOX
        Ataque jab = new Ataque("Jab",8,4);
        Ataque gancho = new Ataque("Gancho",15,3);
        Ataque uppercut = new Ataque("Uppercut",40,2);
        
        Box box = new Box(url+"box.jpg", "Box");
        box.addArte(jab);
        box.addArte(gancho);
        box.addArte(uppercut);
        
        
        //CAPOEIRA 
        Ataque armada = new Ataque("Armada",8,4);
        Ataque martillo = new Ataque("Gancho",28,4);
        Ataque ponteira = new Ataque("Ponteira",12,1);
        
        Capoeira capoeira = new Capoeira(url+"capoeira.jpg", "Capoeira");
        capoeira.addArte(armada);
        capoeira.addArte(martillo);
        capoeira.addArte(ponteira);
        
        //WUSHU
        
        Ataque chien = new Ataque("Ch'ien",10,1);
        Ataque kuantsu  = new Ataque("Kuan tsu",11,4);
        Ataque peitsu = new Ataque("Pei tsu",22,4);
        
        Wushu wushu = new Wushu(url+"wushu.jpg", "Wushu");
        wushu.addArte(chien);
        wushu.addArte(kuantsu);
        wushu.addArte(peitsu);
        
        
        
        //JUDO 
        
        Ataque taiOtoshi = new Ataque("Tai-Otoshi",8,2);
        Ataque koshiGuruma  = new Ataque("Koshi-guruma",8,4);
        Ataque osotoGari = new Ataque("Osoto-gari",13,4);
        
        Judo judo = new Judo(url+"judo.jpg", "Judo");
        judo.addArte(taiOtoshi);
        judo.addArte(koshiGuruma);
        judo.addArte(osotoGari);
        
        
        //SUMO
        Ataque ashitori = new Ataque("Ashitori",8,4);
        Ataque abisetaoshi  = new Ataque("Abisetaoshi",15,3);
        Ataque amiuchi = new Ataque("Amiuchi",10,4);
        
        Sumo sumo = new Sumo(url+"sumo.jpg", "Sumo");
        sumo.addArte(ashitori);
        sumo.addArte(abisetaoshi);
        sumo.addArte(amiuchi);
        
        //Artes Marciales Mixtas
        Ataque legKick = new Ataque("Leg kick",12,4);
        Ataque armbar  = new Ataque("Armbar",15,2);
        Ataque chokehold = new Ataque("Choke Hold",5,4);
        
        ArtesMarcialesMixtas mixtas = new ArtesMarcialesMixtas(url+"artesmarcialesmixtas.jpg", "Mixtas");
        mixtas.addArte(legKick);
        mixtas.addArte(armbar);
        mixtas.addArte(chokehold);
        
        //Kendo
        Ataque koteuchi = new Ataque("Kote Uchi",10,4);
        Ataque katate  = new Ataque("Katate",8,4);
        Ataque tsuki = new Ataque("Tsuki",5,1);
        
        Kendo kendo = new Kendo(url+"kendo.jpg", "Kendo");
        kendo.addArte(koteuchi);
        kendo.addArte(katate);
        kendo.addArte(tsuki);
        
        //Iaido
        Ataque ryoteDori = new Ataque("Ryote Dori",15,4);
        Ataque kataDori  = new Ataque("Kata Dori",20,3);
        Ataque munaDori = new Ataque("Muna Dori",5,4);
        
        Iaido iaido = new Iaido(url+"laido.jpg", "Iaido");
        iaido.addArte(ryoteDori);
        iaido.addArte(kataDori);
        iaido.addArte(munaDori);
        
        //Taekwondo
        Ataque apChagui = new Ataque("Ap Chagui",15,2);
        Ataque yopChagui  = new Ataque("Yop Chagui",10,4);
        Ataque dwiChagi = new Ataque("Dwi Chagi",5,4);
        
        Taekwondo taekwondo = new Taekwondo(url+"taekwondo.jpg", "Taekwondo");
        taekwondo.addArte(apChagui);
        taekwondo.addArte(yopChagui);
        taekwondo.addArte(dwiChagi);
        
        
        
        
        System.out.println(karate.getAtaques());
        System.out.println(box.getAtaques());
        System.out.println(capoeira.getAtaques());
        System.out.println(wushu.getAtaques());
        System.out.println(judo.getAtaques());
        System.out.println(sumo.getAtaques());
        
        artesMarciales.put(karate.getNombre(), karate);
        artesMarciales.put(box.getNombre(), box);
        artesMarciales.put(capoeira.getNombre(), capoeira);
        artesMarciales.put(wushu.getNombre(), wushu);
        artesMarciales.put(judo.getNombre(), judo);
        artesMarciales.put(sumo.getNombre(), sumo);
        artesMarciales.put(mixtas.getNombre(), mixtas);
        artesMarciales.put(kendo.getNombre(), kendo);
        artesMarciales.put(iaido.getNombre(), iaido);
        artesMarciales.put(taekwondo.getNombre(), taekwondo);
   }
      
}
