/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116458.latihan47.nilaimahasiswa;

/**
 *
 * @author
 * NAMA     : Rinanda Al Qorrie Akbar
 * NIM      : 10116458
 */
public class PBOUlang10116458Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NilaiMhs nima = new NilaiMhs(75,80,75);
        
        System.out.println("QUIZ \t = "+nima.getQuiz());
        System.out.println("UTS \t = "+nima.getUts());
        System.out.println("UAS \t = "+nima.getUas());
        System.out.println("\nNilai Akhir = "+ nima.nilaiAkhir());
        System.out.println("\nIndex = "+ nima.indexNilai());
        System.out.println("Keterangan = "+ nima.ketereangan());
    }
    
}
