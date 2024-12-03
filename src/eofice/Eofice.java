/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eofice;

/**
 *
 * @author fauza
 */
import java.util.Scanner;

public class Eofice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int pil;
        
        
        while(true){
            eofice1.header();
            System.out.println("Silahkan pilih menu !");
            System.out.println("1. Homepage");
            System.out.println("2. About Us");
            System.out.print("Masukkan pilihan anda: ");
            pil = input.nextInt();
            switch(pil){
                case 1:
                    eofice1.header();
                    eofice1.homepage();
                    break;
                case 2:
                    eofice1.header();
                    eofice1.infopt();
                    break;
                default:
                    System.out.println("Pilihan Salah!");
                    break;
            }
        }
    }
    
}
