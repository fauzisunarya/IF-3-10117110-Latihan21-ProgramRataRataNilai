

/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * Rata Rata Nilai Mahasiswa Yang di Inputkan
 */
package pkgif.pkg3.pkg10117110.latihan21.programrataratanilai;

import java.util.Scanner;

public class IF310117110Latihan21ProgramRataRataNilai {

    public static void main(String[] args) {
        
          
        Scanner scan = new Scanner(System.in);
        int banyakMHS, jml, nilai[];
        float rata2, jumlah = 0;
 
        //Input jumlah mahasiswa
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        banyakMHS = scan.nextInt();
 
        //Inisialisasi array
        nilai = new int[banyakMHS];
 
        //Input nilai
        for(int i=0;i<= banyakMHS-1;i++){
            System.out.print("Nilai Mahasiswa ke- " + (i+1) + " : ");
            nilai[i] = scan.nextInt();
            System.out.println();
        }
 
        //Hitung Jumlah
        for(int j=0;j<= banyakMHS-1;j++){
            jumlah = jumlah + nilai[j];
        }
 
        //Hitung Rata-rata
        rata2 = jumlah/banyakMHS;
 
        //Output
        System.out.println("Maka Rata-rata Nilainya adalah : " + rata2);

    }
    
}
