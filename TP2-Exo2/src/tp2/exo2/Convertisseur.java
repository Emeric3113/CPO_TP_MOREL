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
    double temp;
    int nbConversions = 0;

    public Convertisseur(double temp) {
        this.temp = temp;
    }
    
    
    public double CelciusVersKelvin(double tCelcius){
        nbConversions++;
        return tCelcius+273;
    }
    public double KelvinVersCelcius(double tKelvin){
        nbConversions++;
        return tKelvin-273;
    }
    public double FarenheitVersCelcius(double tFarenheit){
        nbConversions++;
        return (tFarenheit-32/1.8);
    }
    public double CelciusVersFarenheit(double tCelcius){
        nbConversions++;
        return (tCelcius*1.8)+32;
    }
    public double KelvinVersFarenheit(double tKelvin){
        nbConversions++;
        return CelciusVersFarenheit(KelvinVersCelcius(tKelvin));
    }
    public double FarenheitVersKelvin(double tFarenheit){
        nbConversions++;
        return CelciusVersKelvin(FarenheitVersCelcius(tFarenheit));
    }
    
    public void LireTemp(){
        System.out.println("La temperature est de " + temp+ "\n il y a eu : "+nbConversions+" conversions");
    }
    
}
