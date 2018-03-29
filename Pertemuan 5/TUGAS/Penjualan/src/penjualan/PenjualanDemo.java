/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rizki
 */

public class PenjualanDemo {
public static void main(String[] args){
List<Penjualan> data = new ArrayList<Penjualan>();
Penjualan hit = new Penjualan();
Penjualan hit1 = new Penjualan();
Penjualan hit2 = new Penjualan();
Penjualan hit3 = new Penjualan();
Penjualan hit4 = new Penjualan();
Penjualan hit5 = new Penjualan();
Penjualan hit6 = new Penjualan();
Penjualan hit7 = new Penjualan();
Penjualan hit8 = new Penjualan();


hit1.setData("011", "Sepatu Adidas ",50000, 3);
hit2.setData("012", "Sepatu Nike \t",15000, 2);
hit3.setData("013", "Sepatu Piero\t",14500, 4);
hit4.setData("014", "Sepatu Bata \t",30000, 2);
hit5.setData("015", "Sepatu Vans\t",35000, 3);
hit6.setData("016", "Sepatu Revenge", 25000, 5);
hit7.setData("017", "Sendal Swalow", 5000, 5);
hit8.setData("018", "Sendal Ardiles", 25000, 5);




data.add(hit1);
data.add(hit2);
data.add(hit3);
data.add(hit4);
data.add(hit5);
data.add(hit6);
data.add(hit7);
data.add(hit8);


for(Penjualan n : data){
n.cetakNota();
}
System.out.println("=======================================================================");
System.out.println("Total Jumlah Barang\t : "+hit.getTotalPembelian(data));
System.out.println("Total Pembelian\t\t : "+Penjualan.getTotPembelian(data));
System.out.println("Bonus\t\t\t : "+Penjualan.getBonus());
}
}
