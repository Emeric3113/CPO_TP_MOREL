/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.exo4;

/**
 *
 * @author emeri
 */
public class Personne {
    String Nom;
    String Prenom;

    public Personne(String Nom, String Prenom) {
        this.Nom = Nom;
        this.Prenom = Prenom;
    }

    @Override
    public String toString() {
        return "Personne{" + "Nom=" + Nom + ", Prenom=" + Prenom + '}';
    }
    
}
