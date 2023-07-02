public class UsaTv {
  public static void main (String[] Args){
    Tv tv1 = new Tv();
    tv1.trocarCanal(15);
    tv1.aumentarVolume();
    tv1.reduzirVolume();
    tv1.mostrar();	

    Tv tv2 = new Tv();
    tv2.trocarCanal(10);
    tv2.aumentarVolume();
    tv2.aumentarVolume();
    tv2.mostrar();
   
  
  }
}