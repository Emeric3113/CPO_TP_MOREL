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
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0,"Dubuisson");
        uneBiere.lireEtiquette();
        System.out.println("Ouverture : " + uneBiere.Decapsuler());
        
        BouteilleBiere deuxiemeBiere = new BouteilleBiere("Leffe",6.6,"Abbaye de Leffe");
        deuxiemeBiere.lireEtiquette();
        System.out.println("Ouverture : " + deuxiemeBiere.Decapsuler());
        
        BouteilleBiere troisiemeBiere = new BouteilleBiere("3",99.0,"brasserie 1");
        troisiemeBiere.lireEtiquette();
        System.out.println("Ouverture : " + troisiemeBiere.Decapsuler());
        
        BouteilleBiere quatriemeiemeBiere = new BouteilleBiere("4",47.1,"brasserie 2");
        quatriemeiemeBiere.lireEtiquette();
        System.out.println("Ouverture : " + quatriemeiemeBiere.Decapsuler());
        
        BouteilleBiere cinquiemeBiere = new BouteilleBiere("5",21.4,"brasserie 3");
        cinquiemeBiere.lireEtiquette();
        System.out.println("Ouverture : " + cinquiemeBiere.Decapsuler());
        
        
        
        System.out.println(uneBiere);
    }
    
}
