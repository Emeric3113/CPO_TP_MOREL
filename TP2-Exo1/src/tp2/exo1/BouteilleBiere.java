/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.exo1;

/**
 *
 * @author emeri
 */
public class BouteilleBiere {
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    
    public void Biere(String nom, double degreAlcool, String brasserie) {
        
    }
    public void lireEtiquette(){
        System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ;
    }
    public boolean Decapsuler(){
        return true;
    }
    public String toString(){
        return "";
    }
}
