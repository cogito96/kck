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
        slowo.dodajLiterke('a',gracz1);
        
        
        slowo.wyswietlslowo();
        slowo.wyswietlslowoZgadywane();
        
        
        
        
        
   
        
        
    }
    
}
