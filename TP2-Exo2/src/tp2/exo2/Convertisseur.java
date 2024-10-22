/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.exo2;

/**
 *
 * @author emeri
 */
public class Convertisseur {
    
    int nbConversions;

    public Convertisseur(double temp) {
        this.nbConversions = 0;
    }
    
    
    public double celsiusVersKelvin(double celsius) {
        nbConversions++;
        return celsius + 273.15;
    }
    public double kelvinVersCelsius(double kelvin) {
        nbConversions++;
        return kelvin - 273.15;
    }
    public double fahrenheitVersCelsius(double fahrenheit) {
        nbConversions++;
        return (fahrenheit - 32) * 5/9;
    }
    public double celsiusVersFahrenheit(double celsius) {
        nbConversions++;
        return celsius * 9/5 + 32;
    }
    public double kelvinVersFahrenheit(double kelvin) {
        nbConversions++;
        return (kelvin - 273.15) * 9/5 + 32;
    }
    public double fahrenheitVersKelvin(double fahrenheit) {
        nbConversions++;
        return (fahrenheit - 32) * 5/9 + 273.15;
    }
    
    
    @Override
    public String toString() {
        return "Nombre de conversions effectuées : " + nbConversions;
    }
    
    
}
