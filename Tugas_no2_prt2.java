/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu_3_prt2;
import java.util.Random;
import java.util.Scanner;
public class Tugas_no2_prt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Masukkan jumlah deret: ");
        int jumlahDeret = sc.nextInt();

        int[] deretAcak = new int[jumlahDeret];

        for (int i = 0; i < jumlahDeret; i++) {
            deretAcak[i] = random.nextInt(100); 
        }

        System.out.println("Deretan array acak:");
        for (int i = 0; i < jumlahDeret; i++) {
            System.out.print(deretAcak[i] + " ");
        }
    }
}
    

