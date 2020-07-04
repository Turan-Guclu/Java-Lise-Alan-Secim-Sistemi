package fiinal.proje;


public class Ogrenci {
   String Isim;
   String Soyisim;
   int Dogumyili;
   int DogumAyi;
   int DogumGun;
    String OkulNumarasi;
    String Sayisal;
    

    public Ogrenci(){}

    public Ogrenci(String i, String S, int D, String O) {
        Isim = i;
        Soyisim = S;
        Dogumyili = D;
        OkulNumarasi = O;
    }
    
      public void isimVer(String i){
     if(i.length()< 3){
         System.out.println("Uygun Olmayan İsim Girişi Yapıldı. Varsayılan Olarak İsminiz Kullanıcı Atandı");
     Isim = "Kullanıcı";
     
     } 
     else {
     
     Isim =i ;
     
     
     }
      }
      public String isimAl(){return Isim;}
        public void SoyisimVer(String S){
     if(S.length()< 3){
         System.out.println("Uygun Olmayan Soyİsim Girişi Yapıldı. Varsayılan Olarak soyisminiz Kullanıcı Atandı");
     Soyisim = "Yılmaz";
     
     } 
     else {
     
     Soyisim =S ;
     
     
     }
      
      }  
         public String SoyisimAl(){return Soyisim;} 
        public void DogumYiliVer(int i){
     if( i < 1900 || i > 2017){
         System.out.println("Uygun Olmayan Doğum Tarihi Girişi Yapıldı. Varsayılan Olarak Doğum Tarihiniz 0 olarak Atandı");
         i = 0;
     } 
     else{
        Dogumyili = i;
    
     } }  
        public int DogumyiliAl(){return Dogumyili;}  
        public void OkulNoVer(String O){
     if(O.length() != 4){
         System.out.println("Uygun Olmayan OkulNumarası Girişi Yapıldı. Varsayılan Olarak OkulNumaranız 0 Atandı");
     OkulNumarasi = "0";
     
     } 
     else {
     
     OkulNumarasi= O ;
     
     
     }
      
      }  
        public String OkulNoAl(){return OkulNumarasi;} }