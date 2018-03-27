/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package konversi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author rizki
 */public class Konversi {
BufferedReader Waktu = new BufferedReader(new InputStreamReader(System.in));
int detik, jam, hari, menit, detikAwal;
public Konversi(){}

public Konversi(int detik)
{
    
this.detik = detik;

}

void isiDetik() throws IOException
{

System.out.print("Input Detik : ");
detik = Integer.parseInt(Waktu.readLine());

}

void hitungDetik()
{

detikAwal = detik;
hari = detik / 86400;
jam = (detik - (86400*hari)) / 3600;
menit = ((detik - ((86400*hari) + (3600 * jam))) / 60);
detik = (detik - ((86400*hari) + (3600 * jam) + (60 * menit)));

}

void cetakDetik()

{
    
System.out.println("Detik Awal : " +detikAwal);
System.out.println("Hari       : " +hari);
System.out.println("Jam        : " +jam);
System.out.println("Menit      : " +menit);
System.out.println("Detik      : " +detik);

}

 }