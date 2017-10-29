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
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

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
             System.out.println("| .__________" + ANSI_YELLOW + "))" + ANSI_RESET + "______| ");
             System.out.println("| | / / ");
             System.out.println("| |/ / ");
             System.out.println("| | /  ");
             System.out.println("| |/   ");
             System.out.println("| |    ");
             System.out.println("| |    ");
             System.out.println("| |    ");
             System.out.println("| |    ");
             System.out.println("| |    ");
             System.out.println("| |    ");
             System.out.println("| |    ");
             System.out.println("| |    ");
             System.out.println("| |    ");
             System.out.println("| |    ");
             System.out.println("| |    ");
             System.out.println(ANSI_GREEN + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\" " + ANSI_RESET);
             System.out.println(ANSI_GREEN + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\" "+ ANSI_RESET);
         }
         else if(iloscSzans == 3)
         {
             System.out.println("| .__________" + ANSI_YELLOW + "))" + ANSI_RESET + "______| ");
             System.out.println("| | / /      " + ANSI_YELLOW + "|| " + ANSI_RESET);
             System.out.println("| |/ /       " + ANSI_YELLOW + "|| " + ANSI_RESET);
             System.out.println("| | /        " + ANSI_YELLOW + "||" + ANSI_RESET);
             System.out.println("| |/         " + ANSI_YELLOW + "||" + ANSI_RESET);
             System.out.println("| |          " + ANSI_YELLOW + "|| " + ANSI_RESET);
             System.out.println("| |         " + ANSI_YELLOW + "//\\\\ " + ANSI_RESET);
             System.out.println("| |        " + ANSI_YELLOW + "//  \\\\" + ANSI_RESET);
             System.out.println("| |        " + ANSI_YELLOW + "\\\\  //" + ANSI_RESET);
             System.out.println("| |         " + ANSI_YELLOW + "\\\\//" + ANSI_RESET);
             System.out.println("| |        ");
             System.out.println("| |          ");
             System.out.println("| |          ");
             System.out.println("| |           ");
             System.out.println("| |          ");
             System.out.println("| |          ");
             System.out.println(ANSI_GREEN + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\" " + ANSI_RESET);
             System.out.println(ANSI_GREEN + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\" "+ ANSI_RESET);
         }
         else if(iloscSzans == 2)
         {
             System.out.println("| .__________" + ANSI_YELLOW + "))" + ANSI_RESET + "______| ");
             System.out.println("| | / /      " + ANSI_YELLOW + "|| " + ANSI_RESET);
             System.out.println("| |/ /       " + ANSI_YELLOW + "|| " + ANSI_RESET);
             System.out.println("| | /        " + ANSI_YELLOW + "||" + ANSI_RESET + ANSI_PURPLE + ".-''. " + ANSI_RESET);
             System.out.println("| |/         " + ANSI_YELLOW + "|" + ANSI_RESET + ANSI_PURPLE + "/  _  \\ " + ANSI_RESET);
             System.out.println("| |          " + ANSI_YELLOW + "||" + ANSI_RESET + ANSI_CYAN +  "  `" + ANSI_RESET + ANSI_PURPLE + "/" + ANSI_RESET + ANSI_CYAN + "," + ANSI_RESET + ANSI_PURPLE + "| " + ANSI_RESET);
             System.out.println("| |          " + ANSI_YELLOW + "(\\\\\\) " + ANSI_RESET + ANSI_PURPLE + "_/" + ANSI_RESET);
             System.out.println("| |         " + ANSI_PURPLE + "/|. .| \\    " + ANSI_RESET);
             System.out.println("| |        " + ANSI_RED + "." + ANSI_RESET + ANSI_PURPLE + " |   |" + ANSI_RESET + ANSI_RED + "  .    " + ANSI_RESET);
             System.out.println("| |        " + ANSI_RED + ".         .   " + ANSI_RESET);
             System.out.println("| |          " + ANSI_RED + "|   |    . " + ANSI_RESET);
             System.out.println("| |        " + ANSI_RED + ". .    .  .    " + ANSI_RESET);
             System.out.println("| |        " + ANSI_RED + ". |   . .   .  "+ ANSI_RESET);
             System.out.println("| |          " + ANSI_RED + ".   |   .  " + ANSI_RESET);
             System.out.println("| |        " + ANSI_RED + ".  .   ..   . " + ANSI_RESET);
             System.out.println("| |       " + ANSI_RED + "_______________     " + ANSI_RESET);
             System.out.println(ANSI_GREEN + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\" " + ANSI_RESET);
             System.out.println(ANSI_GREEN + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\" "+ ANSI_RESET);
         }
         else if(iloscSzans == 1)
         {
             System.out.println("| .__________" + ANSI_YELLOW + "))" + ANSI_RESET + "______| ");
             System.out.println("| | / /      " + ANSI_YELLOW + "|| " + ANSI_RESET);
             System.out.println("| |/ /       " + ANSI_YELLOW + "|| " + ANSI_RESET);
             System.out.println("| | /        " + ANSI_YELLOW + "||" + ANSI_RESET + ANSI_PURPLE + ".-''. " + ANSI_RESET);
             System.out.println("| |/         " + ANSI_YELLOW + "|" + ANSI_RESET + ANSI_PURPLE + "/  _  \\ " + ANSI_RESET);
             System.out.println("| |          " + ANSI_YELLOW + "||" + ANSI_RESET + ANSI_CYAN +  "  `" + ANSI_RESET + ANSI_PURPLE + "/" + ANSI_RESET + ANSI_CYAN + "," + ANSI_RESET + ANSI_PURPLE + "| " + ANSI_RESET);
             System.out.println("| |          " + ANSI_YELLOW + "(\\\\\\) " + ANSI_RESET + ANSI_PURPLE + "_/" + ANSI_RESET);
             System.out.println("| |        " + ANSI_PURPLE + "/Y . . Y\\ " + ANSI_RESET);
             System.out.println("| |       " + ANSI_PURPLE + "// |   | \\\\ " + ANSI_RESET);
             System.out.println("| |      " + ANSI_PURPLE + "//  | . |  \\\\ " + ANSI_RESET);
             System.out.println("| |     " + ANSI_PURPLE + "')   |   |   (` " + ANSI_RESET);
             System.out.println("| |          " + ANSI_PURPLE + "||'|| " + ANSI_RESET);
             System.out.println("| |          " + ANSI_PURPLE + "\\/ \\/ " + ANSI_RESET);
             System.out.println("| |          " + ANSI_RED + ".  .    " + ANSI_RESET);
             System.out.println("| |          " + ANSI_RED + ".  .   " + ANSI_RESET);
             System.out.println("| |      " +ANSI_RED + "____________      " + ANSI_RESET);
             System.out.println(ANSI_GREEN + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\" " + ANSI_RESET);
             System.out.println(ANSI_GREEN + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\" "+ ANSI_RESET);
         }
         else if(iloscSzans == 0)
         {
             System.out.println("| .__________" + ANSI_YELLOW + "))" + ANSI_RESET + "______| ");
             System.out.println("| | / /      " + ANSI_YELLOW + "|| " + ANSI_RESET);
             System.out.println("| |/ /       " + ANSI_YELLOW + "|| " + ANSI_RESET);
             System.out.println("| | /        " + ANSI_YELLOW + "||" + ANSI_RESET + ANSI_PURPLE + ".-''. " + ANSI_RESET);
             System.out.println("| |/         " + ANSI_YELLOW + "|" + ANSI_RESET + ANSI_PURPLE + "/  _  \\ " + ANSI_RESET);
             System.out.println("| |          " + ANSI_YELLOW + "||" + ANSI_RESET + ANSI_CYAN +  "  `" + ANSI_RESET + ANSI_PURPLE + "/" + ANSI_RESET + ANSI_CYAN + "," + ANSI_RESET + ANSI_PURPLE + "| " + ANSI_RESET);
             System.out.println("| |          " + ANSI_YELLOW + "(\\\\\\) " + ANSI_RESET + ANSI_PURPLE + "_/" + ANSI_RESET);
             System.out.println("| |        " + ANSI_PURPLE + "/Y . . Y\\ " + ANSI_RESET);
             System.out.println("| |       " + ANSI_PURPLE + "// |   | \\\\ " + ANSI_RESET);
             System.out.println("| |      " + ANSI_PURPLE + "//  | . |  \\\\ " + ANSI_RESET);
             System.out.println("| |     " + ANSI_PURPLE + "')   |   |   (` " + ANSI_RESET);
             System.out.println("| |          " + ANSI_PURPLE + "||'|| " + ANSI_RESET);
             System.out.println("| |          " + ANSI_PURPLE + "|| || " + ANSI_RESET);
             System.out.println("| |          " + ANSI_PURPLE + "|| || " + ANSI_RESET);
             System.out.println("| |          " + ANSI_PURPLE + "|| || " + ANSI_RESET);
             System.out.println("| |         " + ANSI_PURPLE + "/ | | \\ " + ANSI_RESET);
             System.out.println(ANSI_GREEN + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\" " + ANSI_RESET);
             System.out.println(ANSI_GREEN + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\" "+ ANSI_RESET);
         }
         else 
         {
             System.out.println("Niestety przegrałes ");
             return;
         }
         wyswietlIloscSzans();
    }
    
    void wyswietlIloscSzans()
    {
        System.out.println("Szanse do wykorzystania: " + iloscSzans);
    }

}




