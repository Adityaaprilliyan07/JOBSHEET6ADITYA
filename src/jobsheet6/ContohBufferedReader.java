/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Asus
 */
public class ContohBufferedReader {
    public static void main(String[] args) throws IOException {
       String nama;
       // Mmebuat objek inputstream
       InputStreamReader isr = new InputStreamReader(System.in );
       BufferedReader br = new BufferedReader (isr) ;
       // Mengisi variabel nama dengan BufferedReader
       System.out.print("Inputkan nama: ");
       nama = br.readLine();
       // tampilkan output isi variabel nama
       System.out.println("Nama kamu adalah " + nama);
       
       
       
       
       
       
        
    }
    
}
