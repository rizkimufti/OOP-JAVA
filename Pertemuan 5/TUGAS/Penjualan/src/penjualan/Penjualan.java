/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan;

import java.util.List;

/**
 *
 * @author rizki
 */

public class Penjualan {
public String Kode,Nama;
public static String bonus;
public float Harga;
public int Jumlah;
public static double totalPembelian = 0, total=0;
public Penjualan(){
}
public Penjualan(String k, String n, float h, int j){
Kode = k;
Nama = n;
Jumlah = j;
Harga = h;
}
public void setData(String kode, String nama, float harga, int jumlah){
Kode = kode;
Nama = nama;
Harga = harga;
Jumlah += jumlah;
}
public double getTotalPembelian(List<Penjualan> listPenjualan){
for(Penjualan n : listPenjualan){
total = n.getTotal() + n.getJumlah();
}
return total;
}
public static String getBonus(){
if(totalPembelian>= 500000 && total> 5){

bonus = "Setrika";
}
else if(totalPembelian >= 100000 && total > 3){
bonus = "Payung";
}
else if(totalPembelian >= 50000 && total > 2){
bonus = "Ballpoint";
}
else{
bonus = "Tidak Mendapatkan Bonus" ;
}
return bonus;
}
public void cetakNota(){
System.out.print("Kode\t : "+Kode);
System.out.print("\t| Nama\t : "+Nama);
System.out.print("\t\t| Harga\t : "+Harga);
System.out.print("\t| Jumlah\t : "+Jumlah);
System.out.println(" ");
}
public float getHarga(){
return Harga;
}
public int getJumlah(){
return Jumlah;
}
public double getTotal(){
return total;
}
public static double getTotPembelian(List<Penjualan> listPenjualan){
for(Penjualan n : listPenjualan){
totalPembelian =totalPembelian + (n.getJumlah() * n.getHarga());
}
return totalPembelian;
}
}