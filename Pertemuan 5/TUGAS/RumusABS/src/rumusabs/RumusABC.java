/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rumusabs;

import java.util.Scanner;

/**
 *
 * @author rizki
 */

public class RumusABC {
static Scanner input = new Scanner(System.in);
float a,b,c,x1,x2,D;
public void input(){
System.out.print("Masukkan Nilai A = "); this.a = input.nextFloat();
System.out.print("\nMasukkan Nilai B = "); this.b = input.nextFloat();
System.out.print("\nMasukkan Nilai C = "); this.c = input.nextFloat();
this.D = (this.b*this.b) - (4*this.a*this.c);
if(this.D > 0){
statement1(this.a,this.b,this.c,this.D);
}
else if(this.D == 0){
statement2(this.a,this.b,this.c);
}
else {
System.out.println("\nMenghasilkan akar - akar imajiner ");
statement3(this.a,this.b,this.c,this.D);
}
}
public void statement1(float a,float b,float c,float D){
this.x1 = (float) ((b*(-1)) + Math.sqrt(D)) / (2*a);
this.x2 = (float) ((b*(-1)) - Math.sqrt(D)) / (2*a);
}
public void statement2(float a,float b,float c){
this.x1 = (b * (-1)) / (2*a);
this.x2 = this.x1;
}
public void statement3(float a,float b,float c,float D){
this.x2 = ((b*(-1)) / (2*a)) - ((float)(Math.sqrt(D*(-1)))/(2*a));

this.x1 = ((b*(-1)) / (2*a)) + ((float)(Math.sqrt(D*(-1)))/(2*a));
}
public void print(){
System.out.println("Persamaan\t = "+this.a+"X^2 + "+this.b+"X + "+this.c);
System.out.println("Mempunyai Akar\t = "+this.x1+" dan "+this.x2);
}
}