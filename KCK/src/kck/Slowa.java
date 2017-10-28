/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kck;

/**
 *
 * @author aa
 */
public class Slowa {
    private String slowo = "anna";
    private char[] slowoZgadywane= new char[this.slowo.length()] ;
    private char [] uzyteLiterki = new char [32];
    private int probaZgadniecia =0;
    
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
    
    void dodajLiterke(char wybor , Gracz gracz)
    {
        if(!sprawdzCzyLiterkaBylaUzyta(wybor))
        {
            dodajDoTablicyWykorzystanychSlow(wybor);
            for ( int i=0; i < slowo.length(); i++)
            {
                if (this.slowo.charAt(i)== wybor)                 // jeszeli zganie literke 
                {
                    dodajZgadnietaLiterke(i,wybor);
                    this.probaZgadniecia++;
                    return;
                }
            }
            wyswietlslowoZgadywane();
            gracz.blednaOdpowiedz();
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
    
    void losuj()
    {
        this.slowo.length();
    }
    void poprosLiterke (Gracz gracz)                          // dobranie sobie literki
    {
        gracz.iloscZdobytychPunktow -= 2;
        losuj();
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
