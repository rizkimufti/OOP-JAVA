/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

/**
 *
 * @author rizki
 */


/*

Nama : Rizki Mufti Ilmawan
NIM : A11/2016.09493
Kelompok : A11.4110

*/

class Mobil2{

    String Warna ;
    int TahunProduk;
    String hidupkanMobil;
    String matikanGigi;
    String ubahGigi;
}

public class MobilDemo2 {
    
    public static void main (String [] args)
    {
        Mobil2 mobilku = new Mobil2();
        Mobil2 mobilmu = new Mobil2();
    
            mobilku.Warna = "Hitam";
            mobilku.TahunProduk = 2006;
            mobilmu.Warna = "Hijau";
            mobilmu.TahunProduk = 2010;
            
          String hidupkanMobil= mobilku.Warna;
          String matikanGigi = mobilku.Warna;
          String ubahGigi = mobilku.Warna;
            
              System.out.println("Warna          : " +mobilku.Warna);
              System.out.println("Tahun Produksi : "+mobilku.TahunProduk);
              
              System.out.println("Warna          : " +mobilmu.Warna);
              System.out.println("Tahun Produksi : "+mobilmu.TahunProduk);
                      
              System.out.println("Hidupkan Mobil : " +hidupkanMobil);
              System.out.println("Matikan Giig   : "+matikanGigi);
              System.out.println("Ubah Gigi      : " +ubahGigi);
                
                
    }
    
    
}
