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
public class BukuDemo {
public static void main(String[] args){
Buku bukuku = new Buku("- Pemrograman Berbasis Objek dengan Java","Indrajani","ElexmediaKomputindo",2007);
Buku bukumu = new Buku("- Dasar Pemrograman java","Abdul Kadir","Andi Offset",2004);
bukuku.info();
bukumu.info();
}
}