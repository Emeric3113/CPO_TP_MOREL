/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy;

/**
 *
 * @author emeri
 */
public abstract class Arme {
    String nom;
    int attaque;

    public Arme(String nom, int attaque) {
        this.nom = nom;
        this.attaque = attaque;
    }

    void levelAttaque(){
        System.out.println("Niveau d’attaque : "+attaque);
    }
    
    void getNom(){
        System.out.println(nom);
    }
    
    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", attaque=" + attaque + '}';
    }
    
}
