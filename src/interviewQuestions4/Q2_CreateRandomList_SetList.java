package interviewQuestions4;

import java.util.ArrayList;

public class Q2_CreateRandomList_SetList {

    // int array list oluşturun 10 elemandan oluşmalı
    // random ekle isinde void bir metod oluşturun  ve parametresi int array list olsun.
    // bu metod array list içinde 0' dan 20 ye kadar değer atasın.
    // eğer çift sayı atarsa o elemaının yerine 111 yazsın
    // eğer çift sayı yoksa çift sayı yoktur mesajını versin.


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        randomEkle(list);
    };





        private static void randomEkle (ArrayList < Integer > list) {
            for (int i = 0; i < 10; i++) {

                list.add((int) (Math.random() * 20)); // double veri tipine sahip olan Mat.random clasini
                // Cast ederek int yaptik..
                //random() methodu 0-1 arasi sayi uretir


            }
            System.out.println("Random Liste" + list);

            int sayac = 0;

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) % 2 == 0) { // cift sayi varsa
                    sayac++;
                    list.set(i, 111);

                }

            }
            System.out.println("111 eklendikten sonra Random Liste" + list);

            if (sayac == 0) {
                System.out.println("Bu listede cift sayi yoktur");
            }
            System.out.println("listenin son hali : " + list);
        }
    }

