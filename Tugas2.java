//Muhammad Raysa Farhan
//227064516100
//Salma Salsabila
//227064516069

package Tugas2;
import java.util.Scanner;

public class Tugas2 {
     public static void main(String[] args) {
         
       Scanner input = new Scanner(System.in); //membuat Scanner baru dengan input
        System.out.println ("\t Sistem Menghitung Nilai Mahasiswa\t"); //menampilkan output Sistem Menghitung Nilai Mahasiswa
        System.out.println (" \t================================\t"); 
        System.out.println(); 
        
        String[] nama; //mendeklarasikan array dengan nama
        double rata = 0; //mendeklarasikan variabel rata
        
        System.out.print("Jumlah Mahasiswa ="); //menampilkan output "Jumlah Mahasiswa"
        int n = input.nextInt(); //menyimpan variabel n 
        input.nextLine(); 
        nama = new String[n]; //menyimpan variabel nama ke array
          System.out.println();
          
        int[][] data = new int[n][3]; //mendeklarasikan array dua dimensi dengan tipe integer  
          
          //untuk mengisi data mahasiswa dan nilai
        for(int i=0; i<n; i++){ //untuk melakukan perulangan 0 sampai < n
            System.out.print("Nama Mahasiswa = "); //menampilkan output "Nama Mahasiswa"
            nama[i] = input.next(); //menyimpan inputan ke variabel nama
            
            System.out.print("Nilai Uts  = "); //menampilkan output "Nilai Uts"
            data[i][0] = input.nextInt(); //menyimpan inputan ke variabel data [i][0]
            
            System.out.print("Nilai Uas  = "); //menampilkan output "Nilai Uas"
            data[i][1] = input.nextInt(); //menyimpan inputan ke variabel data [i][1]
            data[i][2]=data[i][0]+data[i][1]; //menghitung data [i][2] dengan cara data [i][0] + data [i][1]
            input.nextLine();
            System.out.println();
        }        
        System.out.println();
        System.out.println("No.\tNAMA\tUTS\tUAS\tTotal\tRata-Rata"); //menampilkan output "No,Nama,UTS,UAS,Total,Rata-Rata"
        System.out.println("========================================");
        
          //untuk menampilkan isi array yang sudah diisi dalam variabel
        for(int i=0; i<nama.length; i++){ //untuk melakukan perulangan 0 sampai <nama
            System.out.print((i+1)+"\t"+nama[i]+"\t"); //menampilkan variabel nama
            for(int j=0; j<3; j++){ //untuk melakukan perulangan 0 sampai <3
                System.out.print(data[i][j]+"\t"); //menampilkan variabel data i dan j
            }
            rata = data[i][2]; //menghitung rata-rata data [i][2]
            System.out.println(rata/2+"\t"); //menampilkan output rata-rata
        }
     }
}

