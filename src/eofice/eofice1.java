/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eofice;

/**
 *
 * @author fauza
 */
import java.util.Scanner;
import java.util.Arrays;

public class eofice1 {
    Scanner input = new Scanner(System.in);
    public static void header(){
        System.out.println("===================================================");
        System.out.println("                   E-OFFICE BPM");
        System.out.println("===================================================");
    }
    public static void infopt(){
        System.out.println("PT. BPM adalah perusahaan yang berdiri dibidang\n"
                         + "jaringan komputer, menyediakan layanan jaringan\n"
                         + "bagi perusahaan dan rumah pribadi.");
        System.out.println("\nInformasi kontak perusahaan");
        System.out.println("===========================");
        System.out.println("No. Telp : 0212228592\nWebsite  : www.bpm.co.id\n"
                + "email   : bpmoffice.bpm.co.id");
    }
    public static void homepage(){
        System.out.println("Selamat Datang di E-Office BPM!");
        System.out.println("\nAgenda Perusahaan :");
        System.out.println("24/10/2024 : Project UPTD Karawang Start");
        System.out.println("25/10/2024 : Project CCTV Halim Start");
        System.out.println("29/10/2024 : Project Jombare Start");
        System.out.println("30/10/2024 : Meeting Board Team");
    }
    
}
