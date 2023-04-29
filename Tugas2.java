//Muhammad Raysa Farhan
//227064516100
//Salma Salsabila
//227064516069

package Tugas2;
import java.util.Scanner;

public class Tugas2 {
     public static void main(String[] args) {
         
       Scanner input = new Scanner(System.in);
        System.out.println ("\t Sistem Menghitung Nilai Mahasiswa\t");
        System.out.println (" \t================================\t");
        System.out.println();
        
        String[] nama;
        double rata = 0;
        
        System.out.print("Jumlah Mahasiswa =");
        int n = input.nextInt();
        input.nextLine();
        nama = new String[n];
          System.out.println();
          
        int[][] data = new int[n][3];       
        for(int i=0; i<n; i++){
            System.out.print("Nama Mahasiswa = ");
            nama[i] = input.next();
            
            System.out.print("Nilai Uts  = ");
            data[i][0] = input.nextInt();
            
            System.out.print("Nilai Uas  = ");
            data[i][1] = input.nextInt();
            data[i][2]=data[i][0]+data[i][1];
            input.nextLine();
            System.out.println();
        }        
        System.out.println();
        System.out.println("No.\tNAMA\tUTS\tUAS\tTotal\tRata-Rata");
        System.out.println("========================================");
        
        for(int i=0; i<nama.length; i++){
            System.out.print((i+1)+"\t"+nama[i]+"\t");
            for(int j=0; j<3; j++){
                System.out.print(data[i][j]+"\t");
            }
            rata = data[i][2];
            System.out.println(rata/2+"\t");
        }
     }
}

