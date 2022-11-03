
package com.segitiga;

public class Segitiga {
    double alas,tinggi;
    
public Segitiga(double alas,double tinggi){
      this.alas = alas;
      this.tinggi = tinggi;
       
   } 
   public double getLuasSegitiga(){
       return 0.5*alas*tinggi;
   }
}
