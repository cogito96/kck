/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kck;
import java.util.Scanner;
/**
 *
 * @author aa
 */
public class KCK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" Wisilec ");
        System.out.println(" 1 Gracz ");
        System.out.println(" 2 gracze");
        
        
        System.out.println("Podaj imie gracza ");
        Scanner nazwa = new Scanner(System.in);
        String imie = nazwa.nextLine();
        
        Gracz gracz1 = new Gracz(imie, 5);
        gracz1.wyswietlGracza();
        
        Slowa slowo = new Slowa ();
        slowo.tymczasoweZapelnienie();
        
        while(gracz1.iloscSzans >= 0)
        {
            slowo.wyswietlslowoZgadywane();
            
            System.out.println("Podaj literke ");
            Scanner literkaScanner = new Scanner(System.in);
            char literka = literkaScanner.next().charAt(0);
        
            
            slowo.dodajLiterke(literka,gracz1);
        
            slowo.wyswietlUzyteLiterki();
       
        }
        
        
        
        
   
        
        
    }
    
}
