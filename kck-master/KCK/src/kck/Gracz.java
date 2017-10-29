/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kck;

import java.io.IOException;

/**
 *
 * @author aa
 */
public class Gracz {
    String imie;
    int iloscSzans;
    int iloscZdobytychPunktow;
    int poziomGry;
    
    
    RysunkiWisielec rysunkiWisielec = new RysunkiWisielec();
   

    public Gracz (String imie, int iloscSzans)
    {
        this.imie = imie;
        this.iloscSzans = iloscSzans;
        
    }
    void wyswietlGracza ()
    {
        System.out.println("Czesc "+ this.imie + " witamy Cie w grze ");
    }
    void blednaOdpowiedz () throws IOException
    {
         System.out.println("Nie trafiłem :/ ");
         this.iloscSzans --;
         if(iloscSzans == 4)
         {
             rysunkiWisielec.rysynekIloscSzans4();
         }
         else if(iloscSzans == 3)
         {
               rysunkiWisielec.rysunekIloscSzans3();
         }
         else if(iloscSzans == 2)
         {
                rysunkiWisielec.rysunekIoscSzans2();
         }
         else if(iloscSzans == 1)
         {
                rysunkiWisielec.rysunekIloscSzans1();
         }
         else if(iloscSzans == 0)
         {
                rysunkiWisielec.rysunekIloscSzans0();
         }
         else 
         {
                rysunkiWisielec.wyswietlPrzegrana();
             return;
         }
         
         wyswietlIloscSzans();
    }
    
    void wyswietlIloscSzans()
    {
        System.out.println("Szanse do wykorzystania: " + iloscSzans);
    }

}




