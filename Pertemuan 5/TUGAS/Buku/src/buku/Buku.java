/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buku;

/**
 *
 * @author rizki
 */
public class Buku {
String Judul;
String Pengarang;
String Penerbit;
int Tahun;


public Buku(String Judul, String Pengarang, String Penerbit, int Tahun)
{
this.Judul=Judul;
this.Pengarang=Pengarang;
this.Penerbit=Penerbit;
this.Tahun=Tahun;
}
public void info(){
System.out.print(" "+this.Judul);
System.out.print(", "+this.Pengarang);
System.out.print(", "+this.Penerbit);
System.out.println(", "+this.Tahun);
}

}