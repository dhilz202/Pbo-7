
public class MyKendaraan extends Kendaraan implements InterfaceKendaraan{
    
    @Override
   public void infoKendaraan(){
        System.out.println("ini Kendaraan saya");
    }
   @Override
   public void infoKendaraanAbstract(){
     System.out.println("ini Kendaraan dia");
   }
    
}
