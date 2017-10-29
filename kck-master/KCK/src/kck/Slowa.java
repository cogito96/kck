/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kck;

import java.io.IOException;
import java.util.Random;

/**
 *
 * @author aa
 */
public class Slowa {
    private String slowo = "anna";
    private char[] slowoZgadywane= new char[this.slowo.length()] ;
    private char [] uzyteLiterki = new char [32];
    private int probaZgadniecia =0;
    private int a = 1;
    public boolean odgadnieteHaslo=false;
    
    void wyswietlUzyteLiterki()
    {
        System.out.println(uzyteLiterki);
    }
    void wyswietlslowo()
    {
        System.out.println(this.slowo);
    }
    void wyswietlslowoZgadywane()
    {
        System.out.println("Słowo");
        System.out.println(this.slowoZgadywane);
    }
    void dodajDoTablicyWykorzystanychSlow(int literka)
    {
        int indeks = literka - 97;              // 
        uzyteLiterki[indeks] = (char) literka;
    }
    char [] tymczasoweZapelnienie ()
    {
        for( int i=0; i<slowoZgadywane.length ; i++)
        {
            this.slowoZgadywane[i] = '_';
        }
        return this.slowoZgadywane;
    }
    char[] dodajZgadnietaLiterke(int  indeks , char wybor)       
    {
        for (int i=0 ; i<this.slowo.length() ; i++)
        {
           if(i == indeks)
           {
               this.slowoZgadywane[i]=wybor;
               return this.slowoZgadywane;
           }
           
        }
        return this.slowoZgadywane;
    }
    
    void dodajLiterke(char wybor , Gracz gracz) throws IOException
    {
        a = 0;
        if(!sprawdzCzyLiterkaBylaUzyta(wybor))
        {
            dodajDoTablicyWykorzystanychSlow(wybor);
            for ( int i=0; i < slowo.length(); i++)
            {
                if (this.slowo.charAt(i)== wybor)                 // jeszeli zganie literke 
                {
                    dodajZgadnietaLiterke(i,wybor);
                    this.probaZgadniecia++;
                    a=1;
                    if(slowo.length()==slowoZgadywane.length)
                    {
                        odgadnieteHaslo = true;
                    }
                }
            }
            wyswietlslowoZgadywane();
          
            
            if(a == 0){
                gracz.blednaOdpowiedz();
            }
        }
    }
    void zgadnijHaslo (String wybor, Gracz gracz )
    {
        if( this.slowo == wybor )
        {
            if( this.probaZgadniecia == 0)
            {
                gracz.iloscZdobytychPunktow += 20;          //nagroda za zgadniecie hasla za pierwszym razem
            }
        }
        else 
            gracz.iloscSzans --;
    }

    void poprosLiterke (Gracz gracz) throws IOException                          // dobranie sobie literki
    {
        char wylosowaLiterka;
        gracz.iloscZdobytychPunktow -= 2;
        wylosowaLiterka = losujLiterke();
        
        System.out.println("Wylosowana literka "+ wylosowaLiterka);
        dodajLiterke(wylosowaLiterka, gracz );
        
    }
    char losujLiterke()
    {
        char literka;
        int indeks;
        Random random = new Random();
        while(true)
        {
            indeks = random.nextInt(slowo.length());
            if(slowoZgadywane[indeks] =='_')
            {
                return slowo.charAt(indeks);
            }
        }
    }

    boolean sprawdzCzyLiterkaBylaUzyta(char wybor)
    {
        for(int i=0; i < uzyteLiterki.length ; i++)
        {
            if ( this.uzyteLiterki[i] == wybor )
            {
                System.out.println("Literka "+ wybor +" tak juz zostala uzyta ");
                return true; 
            }
        }
        return false;
    }
}
