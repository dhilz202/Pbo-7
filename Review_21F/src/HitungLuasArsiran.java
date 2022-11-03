import com.lingkaran.Lingkaran;
import com.segitiga.Segitiga;

public class HitungLuasArsiran {
    public static void main(String[]args){
         Lingkaran l = new Lingkaran(10);
         Segitiga s = new Segitiga(5,5);
         
    double luas_l = l.getLuasLingkaran();
    double luas_s = s.getLuasSegitiga();
    
    double hasil = luas_l - luas_s;
      
    System.out.println("luas Arsirannya adalah = :" + hasil + "cm.");
    }
    
}
