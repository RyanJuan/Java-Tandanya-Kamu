/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulg.pkg10115557.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author RyanJuan
 * NAMA              : RAYAN
 * KELAS             : PBOULG
 * NIM               : 10115557
 * Deskripsi Program : menampilkan umur dan keterangan sesuai umur
 */
public class PBOULG10115557Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Age age = new Age(2019);

        Scanner sca = new Scanner(System.in);
        System.out.print("Masukkan Tahun lahir anda : ");
        age.setYearBirth(sca.nextInt());

        System.out.println("======Hasil Perhiyungan Umur======");
        System.out.println("Tahun Lahir Anda : " + age.getYearBirth(0));
        System.out.println("Hari ini Tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "
                + age.hitungUmur() + " tahun");
        System.out.println("Tandanya Kamu : " + age.tandanyaKamu(age.hitungUmur()));
    }
    
}
