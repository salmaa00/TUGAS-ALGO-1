// muhammad raysa farhan
// 227064516100
// salma salsabila
// 227064516069

package tugas1.pkg1;
import java.util.Scanner;
public class Tugas11 {

    public static void main(String[] args) {
            Scanner masuk = new Scanner (System.in);
            int jml;
            String[] nama = new String[5];
            Scanner scan = new Scanner (System.in);
           double nilai,total = 0,rata;
           
           System.out.print ("Masukan jumlah mahasiswa = ");
           jml = masuk.nextInt();
                  
           for (int i=1; i<=jml; i++){
               System.out.print ("Masukan nama mahasiswa = ");
               nama[i]= scan.nextLine();
               System.out.print ("Masukan nilai mahasiswa "+ i + "= ");
               nilai = masuk.nextDouble();
               total += nilai;
               
           }
           rata = total/jml;
           System.out.println ("Total nilai mahasiswa = " +total);
           System.out.println ("Rata-Rata nilai mahasiswa = " +rata);
        }
}