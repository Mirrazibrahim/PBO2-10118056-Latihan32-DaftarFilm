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
public class Mainclass {
    public static void main(String[] args) {
        Film flm = new Film();
        
        System.out.println("===Daftar Film Sedang Tayang===");
        
        flm.Name = "Venom";
        flm.Genre = "Action, Horror, Scifi";
        flm.Rating = 8.5;
        flm.Duration = 120;
        
        flm.nowPlaying();
        
        flm.Name = "Small Foot";
        flm.Genre = "Animation";
        flm.Rating = 9.0;
        flm.Duration = 96;
        
        flm.nowPlaying();
        
        flm.Name = "Crazy Rich Asian";
        flm.Genre = "Comedy";
        flm.Rating = 7.0;
        flm.Duration = 119;
        
        flm.nowPlaying();
        
        flm.Name = "Asih";
        flm.Genre = "Horror";
        flm.Rating = 6.0;
        flm.Duration = 100;
        
        flm.nowPlaying();
    }
    
}
