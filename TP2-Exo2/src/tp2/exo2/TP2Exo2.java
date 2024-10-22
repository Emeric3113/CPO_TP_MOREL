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
        Scanner sc;
        sc = new Scanner(System.in);
        String temperature = sc.nextLine();
        double temp = Double.parseDouble(temperature);
        Convertisseur conv1 = new Convertisseur(temp);

        // Exécution de quelques conversions
        double tempKelvin = conv1.celsiusVersKelvin(temp);
        System.out.println(temp + "°C en Kelvin : " + tempKelvin);

        double tempCelsius = conv1.kelvinVersCelsius(temp);
        System.out.println(temp + "K en Celsius : " + tempCelsius);

        double tempFahrenheit = conv1.celsiusVersFahrenheit(temp);
        System.out.println(temp + "°C en Fahrenheit : " + tempFahrenheit);

        // Affichage du nombre de conversions effectuées
        System.out.println(conv1);

        // Création d'un deuxième convertisseur
        Convertisseur conv2 = new Convertisseur(temp);
        double tempKelvin2 = conv2.fahrenheitVersKelvin(temp);
        System.out.println(temp + "°F en Kelvin : " + tempKelvin2);

        // Affichage du nombre de conversions effectuées par le deuxième convertisseur
        System.out.println(conv2);
    }
    
}
