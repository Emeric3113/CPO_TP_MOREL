/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1.exo3.guessmynumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author emeri
 */
public class TP1Exo3GuessMyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saisie;
        boolean a;
        a = true;
        Random generateurAleat = new Random();
        Scanner sc = new Scanner(System.in);
        int nb = generateurAleat.nextInt(100);
        saisie = -1;
        while(a){
        saisie = sc.nextInt();
        if(saisie == nb){System.out.println("gagné !"); a = false;}}
        if (saisie > nb){System.out.println("trop grand !");}
        if (saisie < nb){System.out.println("trop petit !");}
        }
    
}
