
abstract class Pesawat{
    int MAX_PENUMPANG;//abstract boleh mendefinisikan variabel tanpa nilai
    protected String maskapai;//abstract boleh menggunakan keyword private/protected
    abstract void setKapasitas();//method dengan keyword abstract hanya dituliskanheader tanpa body
    abstract int getKapasitas();
    //abstract di implementasikan menggunakan keyword extends

    //pada kelas abstract boleh terdapat metode dengan implementasi program
    
    void infoPesawat(){
        System.out.println("kapasitas : "+ MAX_PENUMPANG);
    }
}
public class Main extends Pesawat{

    @Override
    void setKapasitas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    int getKapasitas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
