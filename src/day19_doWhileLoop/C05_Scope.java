package day19_doWhileLoop;

public class C05_Scope {

    // 1- Bir method icerisinde olusturulan variable lar sadece olusturlduklari 
    // methodlarda kullanilabilirler , baska methodlarda kullanilamazlar
    //2- tum methodlarin kullanabilmesini istedigimiz variable lari 
    // Class level da olustururuz.
    // Class level da olusturdugumuz variable i satatic yaparsak tum methodlar kullana bilir
    // --static olmazsa (instance) o zaman static olmayan methodlar kullanabilir
    //3- Loop icinde olusturulan variable lar loop icerisinde kullanilabilinir
    // Ama loopun disinda kulanilamaz

    static String kurs="Java";
    int level=10;
    static int sayi4;
    
    public static void main(String[] args) {
        int sayi=10;
        //isim="Vali Yan";
        System.out.println(kurs);
        //System.out.println(level);

        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
            int loopSayi=20;

            
        }

        //System.out.println(i);
        //loopSayi=30;
        int sayi2;
        sayi4++ ; // class seviyesinde olusturup deger atamadigim sayi4 u artirmama java izin veriyor
        //sayi2++; // ama metod icerisinde olusturup deger atadigim sayiyi artirmama java izin vermiyor/
    }
    public static void method1(){
        //sayi=20;
        //String isim="Ali Can";
        System.out.println(kurs);
        //System.out.println(level);
        
        
    }
    public void method2(){
        //sayi=30;
        //isim="Ayse San"
        System.out.println(kurs);
        System.out.println(level);
        
    }
}
