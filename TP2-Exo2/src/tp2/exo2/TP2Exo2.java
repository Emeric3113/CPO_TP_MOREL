/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.exo2;

import java.util.Scanner;

/**
 *
 * @author emeri
 */
public class TP2Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int conv;
        boolean a;
        a = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez une température :");
        double temperature = sc.nextDouble();
        System.out.println("Saissisez une coversion :");
        System.out.println("""
            1. Kelvin vers Celcius
            2. Celcius vers Kelvin
            3. Farenheit vers Celcius
            4. Celcius vers Farenheit
            5. Kelvin vers Farenheit
            6. Farenheit vers Kelvin""");
        
        while (a){
            conv=sc.nextInt();
            switch(conv){
                case 1:
                    Convertisseur tempKC = new Convertisseur(temperature);
                    tempKC.LireTemp();
                    a=false;
                    break;
                case 2:
                    Convertisseur tempCK = new Convertisseur(temperature);
                    tempCK.LireTemp();
                    a=false;
                    break;
                case 3:
                    Convertisseur tempFC = new Convertisseur(temperature);
                    tempFC.LireTemp();
                    a=false;
                    break;
                case 4:
                    Convertisseur tempCF = new Convertisseur(temperature);
                    tempCF.LireTemp();
                    a=false;
                    break;
                case 5:
                    Convertisseur tempKF = new Convertisseur(temperature);
                    tempKF.LireTemp();
                    a=false;
                    break;
                case 6:
                    Convertisseur tempFK = new Convertisseur(temperature);
                    tempFK.LireTemp();
                    a=false;
                    break;
                
                
                default:
                    System.err.println("erreur de saisie");
                    break;
            }
        }
    }
    
}
