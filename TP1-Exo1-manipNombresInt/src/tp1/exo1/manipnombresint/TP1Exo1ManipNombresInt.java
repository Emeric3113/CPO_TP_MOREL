/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1.exo1.manipnombresint;

import java.util.Scanner;

/**
 *
 * @author emeri
 */
public class TP1Exo1ManipNombresInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nb1;
        int nb2;
        int somme;
        int diff;
        
        Scanner sc = new Scanner(System.in);
        nb1 = sc.nextInt();
        nb2 = sc.nextInt();
        System.out.println("nb1 : "+nb1 +"; nb2 : "+ nb2);
        somme = nb1 + nb2;
        diff = nb1 - nb2;
        System.out.println("Somme : "+ somme +"\nDifférence : "+ diff + "\nProduit : "+ nb1*nb2);
        System.out.println("Quotient : "+nb1/nb2);
        System.out.println("Reste : "+nb1%nb2);
        
        // TODO code application logic here
    }
    
}
