/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu_3;
import java.util.Scanner;
/**
 *
 * @author Alvian YW
 */
public class Tugas_bintang_kebalik {
    public static void main(String[] args) {
       
        Scanner baru = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah baris segitiga: ");
        int n = baru.nextInt(); 
        for (int i = n; i >= 1; i--) {
        
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        baru.close();
    }
}
    

