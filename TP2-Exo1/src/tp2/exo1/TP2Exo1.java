/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.exo1;

/**
 *
 * @author emeri
 */
public class TP2Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere();
        uneBiere.nom = "Cuvée des trolls";
        uneBiere.degreAlcool = 7.0;
        uneBiere.brasserie = "Dubuisson";
        uneBiere.ouverte = false;
        uneBiere.lireEtiquette();
        
        BouteilleBiere deuxiemeBiere = new BouteilleBiere();
        uneBiere.nom = "Leffe";
        uneBiere.degreAlcool = 6.6;
        uneBiere.brasserie = "Abbaye de Leffe";
        uneBiere.ouverte = false;
        uneBiere.lireEtiquette();        
    }
    
}
