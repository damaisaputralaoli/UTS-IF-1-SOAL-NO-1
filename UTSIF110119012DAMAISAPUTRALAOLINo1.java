
package uts.if1.pkg10119012.damaisaputralaoli.no1;

import java.time.Year;
import java.util.Scanner;

/**
 *   NAMA    : DAMAI SAPUTRA LAOLI
 *   KELAS   : IF-1
 *   NIM     : 10119012
 * @author damai
 */
public class UTSIF110119012DAMAISAPUTRALAOLINo1 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tahunLahir, tahunSekarang, umur;
        String normal = "\u001b[0m";
        String merah = "\u001B[31m";

        tahunSekarang = Year.now().getValue();
        Age pengguna = new Age(tahunSekarang);

        System.out.print("Masukkan Tahun Lahir Anda : ");
        pengguna.setYearBirth(scanner.nextInt());
        tahunLahir = pengguna.getYearBirth();
        umur = pengguna.hitungUmur();

        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : "+ tahunLahir);
        System.out.println("Hari ini tahun   : "+tahunSekarang);
        System.out.printf("Umur kamu sampai hari ini adalah %d tahun%n", umur);
        System.out.println("Tandanya Kamu "+ merah+ pengguna.tandanyaKamu(umur)+ normal);
    }
}