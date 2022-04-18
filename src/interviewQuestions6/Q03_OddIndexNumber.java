package interviewQuestions6;


import java.util.Scanner;

public class Q03_OddIndexNumber {

    // indexi tek sayi olan karakterleri yazdiran bir code create ediniz
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir metin giriniz : ");
        String  str = scan.nextLine();

        int index = 0;
        do{
            if (index%2==1){
                System.out.print(str.charAt(index)+" ");
            }
            index++;
        }while(index<str.length());
    }
}
