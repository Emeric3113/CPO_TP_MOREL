/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1.exo2.convertisseur;

import java.util.Scanner;

/**
 *
 * @author emeri
 */
public class TP1Exo2Convertisseur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double temp;
        int conv;
        boolean a;
        a = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez une température :");
        temp = sc.nextDouble();
        System.out.println("Saissisez une coversion :");
        System.out.println("1. Kelvin vers Celcius\n" +"2. Farenheit vers Celcius\n" +"3. Celcius vers Farenheit\n" +"4. Kelvin vers Farenheit\n" +"5. Farenheit vers Kelvin");
        
        while (a){
            conv=sc.nextInt();
            switch(conv){
                case 1:
                    System.out.println(KelvinVersCelcius(temp));
                    a=false;
                    break;
                case 2:
                    System.out.println(FarenheitVersCelcius(temp));
                    a=false;
                    break;
                case 3:
                    System.out.println(CelciusVersFarenheit(temp));
                    a=false;
                    break;
                case 4:
                    System.out.println(KelvinVersFarenheit(temp));
                    a=false;
                    break;
                case 5:
                    System.out.println(FarenheitVersKelvin(temp));
                    a=false;
                    break;
                default:
                    System.err.println("erreur de saisie");
                    break;
            }
        }
        
        
        // TODO code application logic here
    }
    public static double CelciusVersKelvin(double tCelcius){
        return tCelcius+273;
    }
    public static double KelvinVersCelcius(double tKelvin){
        return tKelvin-273;
    }
    public static double FarenheitVersCelcius(double tFarenheit){
        return (tFarenheit-32/1.8);
    }
    public static double CelciusVersFarenheit(double tCelcius){
        return (tCelcius*1.8)+32;
    }
    public static double KelvinVersFarenheit(double tKelvin){
        return CelciusVersFarenheit(KelvinVersCelcius(tKelvin));
    }
    public static double FarenheitVersKelvin(double tFarenheit){
        return CelciusVersKelvin(FarenheitVersCelcius(tFarenheit));
    }
}
