/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0.exo3.calculator;

import java.util.Scanner;

/**
 *
 * @author emeri
 */
public class TP0Exo3Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int operateur;
        int operande1;
        int operande2;
        System.out.println("Choisissez un opérateur : \n1) add \n2) substract \n3) multiply \n4) divide \n5) modulo ");
        Scanner sc = new Scanner(System.in);
        operateur = sc.nextInt();
        System.out.println("Choisissez un nombre :");
        operande1 = sc.nextInt();
        System.out.println("Choisissez un deuxième nombre :");
        operande2 = sc.nextInt();
    
        switch(operateur){
            case 1 :
                System.out.println(operande1 + operande2);
                break;
            case 2 :
                System.out.println(operande1 - operande2);
                break;
            case 3 :
                System.out.println(operande1 * operande2);
                break;
            case 4 :
                System.out.println((float)operande1 / (float)operande2);
                break;
            case 5 :
                System.out.println(operande1 % operande2);
                break;
            default:
                System.err.println("erreur de saisie");
        }
        // TODO code application logic here
    }
    
}
