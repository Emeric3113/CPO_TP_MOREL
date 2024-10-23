/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.exo3;

/**
 *
 * @author emeri
 */
public class TP2Exo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2;
        Tartiflette a = assiette1;
        assiette1 = assiette2;
        assiette2 = a;
        
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;
        
        Moussaka[] tab = new Moussaka[10];
        for (int i = 0; i < tab.length; i++){ 
            tab[i] = new Moussaka((i+1)*100);
            Moussaka b = tab[i];
            System.out.println("Moussaka "+ (i+1) +" : "+ b.nbCalories + " calories");
        }

        
    }
    
}
