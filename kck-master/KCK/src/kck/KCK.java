/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kck;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author aa
 */
public class KCK {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        RysunkiWisielec rysunki = new RysunkiWisielec();
        rysunki.wyswietlTytul();
        
        System.out.println(" 1 Gracz ");
        System.out.println(" 2 gracze");
         
        
        System.out.println("Podaj imie gracza ");
        Scanner nazwa = new Scanner(System.in);
        String imie = nazwa.nextLine();
        
        Gracz gracz1 = new Gracz(imie, 5);
        gracz1.wyswietlGracza();
        
        Slowa slowo = new Slowa ();
        slowo.tymczasoweZapelnienie();
        
        while(gracz1.iloscSzans >= 0 || slowo.odgadnieteHaslo == false)
        {
            slowo.wyswietlslowoZgadywane();
            
            System.out.println("Podaj literke ");
            Scanner literkaScanner = new Scanner(System.in);
            char literka = literkaScanner.next().charAt(0);
            while(true)
            {
                if( literka < 96 || literka > 122 )
                {
                    System.out.println("Błędna litrka!!! \nPodaj małą literke ");
                    literkaScanner = new Scanner(System.in);
                    literka = literkaScanner.next().charAt(0);
                }
                else
                break;
            }
            
        
            
            slowo.dodajLiterke(literka,gracz1);
            if (slowo.odgadnieteHaslo == true)
            {
                rysunki.wyswietlWygrana();
                return;
            }
            
            slowo.wyswietlUzyteLiterki();
            
         
        } 
        
    }
    
}
