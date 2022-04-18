package YeniCalisma;

import java.util.Scanner;

public class X03 {
    public static void main(String[] args) {
        /*
         AtbashCode ; bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
         Alfabenin ilk harfi son harfi yerine kullanilmaktadir..
         "abcdefghijklmnopqrstuvwxyz"; 26 harf
         "zyxwvutsrqponmlkjihgfedcba";
         */

     Scanner scan = new Scanner(System.in);
        System.out.println("sifrelinecek ifadeyi giriniz");
        String ifade = scan.nextLine().toLowerCase();

        for (int i = 0; i <ifade.length() ; i++) {
            int index = 'z'-ifade.charAt(i);// tersten bakacagi icin sondan cikardik.
            System.out.print((char)( ('a')+index));

        }



    }
}
