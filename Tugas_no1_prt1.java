/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu_3;
import java.util.Scanner;
public class Tugas_no1_prt1 {
   public static void main(String[] args) {
        Scanner baru = new Scanner(System.in);
        
        // Meminta input 
        System.out.print("Masukkan batas awal: ");
        int batasAwal = baru.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = baru.nextInt();
        
        
        if (batasAwal % 2 != 0) {
            batasAwal += 1; 
        }
        
        System.out.println("Bilangan genap dari " + batasAwal + " hingga " + batasAkhir + " adalah:");
        for (int i = batasAwal; i <= batasAkhir; i += 2) {
            System.out.print(i + " ");
        }
        
        baru.close();
    }
}

    

