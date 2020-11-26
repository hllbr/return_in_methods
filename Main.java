
public class Main {
    public static int toplama(int a,int b ,int c){
        //System.out.print("sonucumuz :");
        return (a+b+c); 
        //dışarıya int bir değer döndürecek bu yüzden void yerine int yazdık
    }
  
    public static int sayı_carp(int a,int b){
        return (a*b);
     
    }
    public static int ikile_topla(int a){
        return a+2;
    }
    public static double kalan_bul(double a){
        return (a/2);
    }
       public static int elli_sekiz(int a){
        return (a*58);
    }
       
    public static void main(String[] args) {
        /*
        metodlarda return kullanımı 
        return =  metodlarımız çağrıldıkları yerlere değerler dönüyor bunu sağlayan anahtar kelimemiz return.... 
        !!!void fonksiyonu return ile hiçbir şey dönmez 
        void return ile değer döndürmeyen anlamına geliyor.
 
        */
        
        System.out.println("fonksiyonumuzun verilenlerle oluşan pozitif sonucu :"+toplama(58, 85, 958));
        /*
        eğer print ile yapsaydık alt kısımda(main) içinde void hatası alcaktık
        return çıktı almamızı sağlıyor
        */
        System.out.println("çarpma işlemi sonucumuz : "+sayı_carp(85, 58));
        System.out.println("double fonksiyonumuzun sonucu " +kalan_bul(58.85));
        System.out.println("iki ile toplama işlemimizin sonucu :" +ikile_topla(58));
        System.out.println("üst mantık : " +kalan_bul(sayı_carp(elli_sekiz(ikile_topla(68)), 85)));
        
        //fonksiyonlar iç içe gönderilebilir parametreler eşleştiği sürece...
        //JAVA PEK ÇOK DİLDE OLAN BİR ÖZELLİĞE SAHİPTİR.
        //return ifadesinin altına yazılan ifadeler çalıştırılmaz çünkü return fonksiyonun en son cümlesidir.
        //döngülerde break fonksiyonlarda return aynı işe yarıyorlar....
    }
    
}
