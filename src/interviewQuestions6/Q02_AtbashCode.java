package interviewQuestions6;

import java.util.Scanner;

public class Q02_AtbashCode {
    /*
      AtbashCode ; bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
      Alfabenin ilk harfi son harfi yerine kullanilmaktadir..
      "abcdefghijklmnopqrstuvwxyz"; 26 harf
      "zyxwvutsrqponmlkjihgfedcba";
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("sifrelinecek ifadeyi giriniz");
        String ifade = scan.nextLine().toLowerCase();

        for (int i = 0; i <ifade.length() ; i++) {
            int index = 'z'-ifade.charAt(i);// tersten bakacagi icin sondan cikardik.
            System.out.print((char)( ('a')+index));

        }
    }

}