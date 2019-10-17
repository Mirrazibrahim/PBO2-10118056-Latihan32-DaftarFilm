/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118056.latihan32.daftarfilm;

/**
 *
 * @author  
 * NAMA     : Mirrazibrahim
 * KELAS    : IF-2
 * NIM      : 10118056
 */
public class Film {
    
    public String Name,Genre;
    public Double Rating;
    public int Duration;
    
    public void nowPlaying(){
        System.out.println("");
        System.out.println("Judul Film : " + Name);
        System.out.println("Genre Film : " + Genre);
        System.out.println("Rating Film : " + Rating);
        System.out.println("Duration Film : " + Duration + " Menit");
    }
    
}
