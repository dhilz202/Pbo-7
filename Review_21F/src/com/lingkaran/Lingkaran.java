
package com.lingkaran;

public class Lingkaran {
    
    final double PHI =3.14;
    double jari2;
    
    public Lingkaran(double jari2){
        this.jari2= jari2;
    } 
    public double getLuasLingkaran (){
        return PHI*jari2*jari2;    
    }
}
