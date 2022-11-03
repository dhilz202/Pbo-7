interface PesawatTerbang{
    int MAX_PENUMPANG=100;//interface mendifinisikan variabel harus menggunakan nilai
    String maskapai="Garuda";//interface tidak boleh menggunakan keyword private/protected
    void setKapasitas(int penumpang);//method pada interface hanya di tuliskan header tanpa body
    int getKapasitas();
    //interface di implementasikan menggunakan keyword implementasi

    //pada interface tidak boleh terdapat method dengan implementasi program
    
    void infoPesawat();
        
}

class GarudaAir implements PesawatTerbang{

    @Override
    public void setKapasitas(int penumpang) {
        
    }

    @Override
    public int getKapasitas() {
        return 150;
    }

    @Override
    public void infoPesawat() {
        
    }
    
}
class LionAir implements PesawatTerbang{
    int penumpang;

    @Override
    public void setKapasitas(int penumpang) {
        this penumpang;
    }

    @Override
    public int getKapasitas() {
        return 200;
    }

    @Override
    public void infoPesawat() {
        
    }
    
}
public class NaikPesawat {
    public static void main(String[] args){
        GarudaAir ga = new GarudaAir();
        LionAir la = new LionAir();
        la.setKapasitas(300);
        System.out.println(ga.getKapasitas());
        System.out.println(la.getKapasitas());
    }
}
