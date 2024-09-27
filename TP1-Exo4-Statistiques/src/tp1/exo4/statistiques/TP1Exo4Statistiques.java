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
        int a; int b; int c; int d; int e; int f;
        a=0; b=0; c=0; d=0; e=0; f=0;
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        int[] tab = new int[6];
        System.out.println("Saisissez un entier entre 0 et 5 :");
        m = sc.nextInt();
        
        for (int i = 0; i<=m; i++){
            tab[i] = generateurAleat.nextInt(5);
        }
        for (int i = 0; i< m; i++){
            if (tab[i]==0){a=a+1;}
            if (tab[i]==1){b=b+1;}
            if (tab[i]==2){c=c+1;}
            if (tab[i]==3){d=d+1;}
            if (tab[i]==4){e=e+1;}
            if (tab[i]==5){f=f+1;}
        }
        System.out.println("0 : "+ (a*100)/m+"%\n"+"1 : "+ (b*100)/m+"%\n"+"2 : "+ (c*100)/m+"%\n"+"3 : "+ (d*100)/m+"%\n"+"4 : "+ (e*100)/m+"%\n"+"5 : "+ (f*100)/m+"%");
        
        
            
        
        
        
    }
    
}
