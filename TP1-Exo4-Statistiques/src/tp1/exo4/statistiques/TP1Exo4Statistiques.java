/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1.exo4.statistiques;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author emeri
 */
public class TP1Exo4Statistiques {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m;
        int alea;
        int i;
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        int[] tab = new int[6];
        System.out.println("Saisissez un entier :");
        m = sc.nextInt();
        
        for (i = 0; i<=m; i++){
            tab[i] = generateurAleat.nextInt(5);
            System.out.println(tab[i]);
        }
        
            
        
        
        
    }
    
}
