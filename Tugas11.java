// muhammad raysa farhan
// 227064516100
// salma salsabila
// 227064516069

package tugas1.pkg1;
import java.util.Scanner;
public class Tugas11 {

    public static void main(String[] args) {
            Scanner masuk = new Scanner (System.in); //membuat Scanner baru dengan inputan baru
            int jml; //mendeklarasikan variabel jumlah
            String[] nama = new String[5]; //mendeklarasikan variabel array
            Scanner scan = new Scanner (System.in); //membuat Scanner baru dengan inputan Scan
           double nilai,total = 0,rata; //mendeklarasikan variabel nilai,total dan rata-rata
           
           System.out.print ("Masukan jumlah mahasiswa = "); //menampilkan output "Masukkan jumlah mahasiswa"
           jml = masuk.nextInt(); //menyimpan inputan variabel jumlah
           
            // mengisi data mahasiswa dan nilai
           for (int i=1; i<=jml; i++){ //untuk melakukan perulangan
               System.out.print ("Masukan nama mahasiswa = "); //menampilkan output "Masukkan nama mahasiswa"
               nama[i]= scan.nextLine(); //menyimpan inputan variabel nama menggunakan Scan
               System.out.print ("Masukan nilai mahasiswa "+ i + "= "); //menampilkan output nilai mahasiswa"
               nilai = masuk.nextDouble(); //menyimpan inputan variabel nilai menggunakan masuk
               total += nilai; //menggunakan operator += untuk menambahkan total dengan nilai untuk menhasilkan total
               
           }
           rata = total/jml; //menggunakan operator / untuk menghasilkan rata-rata
           System.out.println ("Total nilai mahasiswa = " +total); //menampilkan output "Total nilai mahasiswa"
           System.out.println ("Rata-Rata nilai mahasiswa = " +rata); //menampilkan "Rata-rata nilai mahasiswa"
        }
}
