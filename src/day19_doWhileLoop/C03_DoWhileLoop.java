package day19_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        // kullanicidan pozitif bir tamsayi alip
        // while loop ile sayidan kucuk pozitif tamsayilari yazdiralim
        int input=5;

        int sayi=1;

        while (sayi<input){
            System.out.println(sayi);
            sayi++;
        }


        // Ayni soruyu do-while loop ile yapalim
        sayi=1;
        do {
            System.out.println(sayi);
            sayi++;
        } while (sayi<input);

    }
}

