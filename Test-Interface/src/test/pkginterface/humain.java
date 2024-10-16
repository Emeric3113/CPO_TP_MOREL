/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.pkginterface;

/**
 *
 * @author emeri
 */
public class humain {
    String nom;
    int age;
    
    public humain(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    @Override
    public String toString() {
        return "humain{" + "nom=" + nom + ", age=" + age + '}';
    }
}
