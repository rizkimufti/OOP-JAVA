/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilai;

/**
 *
 * @author rizki
 */


public class Nilai {
private char nHuruf = 'A';
private String predikat;

void setNilai(char nHuruf, String predikat){
this.nHuruf = nHuruf;
this.predikat = predikat;
}

public char getnHuruf(){
return this.nHuruf;
}

public String getpredikat(){
return this.predikat;
}

char getNilHuruf(float nilai){
if(nilai>=85 && nilai<=100)
nHuruf = 'A';
else if(nilai>=70 && nilai<84)
nHuruf = 'B';
else if(nilai>=60 && nilai<70)
nHuruf = 'C';
else if(nilai>=40 && nilai<60)
nHuruf = 'D';
else if(nilai>=0 && nilai<40)
nHuruf = 'E';
else
nHuruf='X';
return nHuruf;
}
String getPredikat(char huruf){
//buat di atas=> string predikat
switch (huruf){
case'A':

predikat= "Apik"; break;
case'B':
predikat= "Baik"; break;
case'C':
predikat= "cukup"; break;
case'D':
predikat= "Dablek"; break;
case'E':
predikat= "Elek"; break;
}
return predikat;
}
public static void main(String[] args){
Nilai nilai=new Nilai();
String nim ="08982983";
String nama ="Ghiyatsi";

System.out.println("Nim         : "+nim);
System.out.println("Nama        : "+nama);

double nilaiTugas = 80;
double pNilaiTugas =0.20*80;
double nilaiUts = 90;
double pNilaiUts =0.35*90;
double nilaiUas = 87;
double pNilaiUas = 0.45*87;
float nilaiAkhir = (float) ((0.35*nilaiTugas)+(0.20*nilaiUts)+(0.45*nilaiUas));


System.out.println("nilai Tugas : "+nilaiTugas+" \t 20%: "+pNilaiTugas);
System.out.println("nilai UTS   : "+nilaiUts+" \t 35%: "+pNilaiUts);
System.out.println("nilai UAS   : "+nilaiUas+" \t 45%: "+pNilaiUas);
System.out.println("nilai Akhir : "+nilaiAkhir);

System.out.println("Nilai Huruf : "+nilai.getNilHuruf(nilaiAkhir));
System.out.println("Predikat    : "+nilai.getPredikat(nilai.getNilHuruf(nilaiAkhir)));
}

}
