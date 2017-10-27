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
public class Gracz {
    String imie;
    int iloscSzans;
    int iloscZdobytychPunktow;
    int poziomGry;
    public Gracz (String imie, int iloscSzans)
    {
        this.imie = imie;
        this.iloscSzans = iloscSzans;
        
    }
    void wyswietlGracza ()
    {
        System.out.println("Czesc "+ this.imie + " witamy Cie w grze ");
    }
    void blednaOdpowiedz ()
    {
         System.out.println("Nie trafiłem mlotu :/ ");
         this.iloscSzans --;   
         System.out.println("Zostało Ci "+ this.iloscSzans);
    }

  
    
}
