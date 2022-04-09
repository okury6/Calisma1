package practice_basic_day06;
import java.util.Scanner;
public class Q10_Varargs01 {
    static int toplam;
    // istedigimiz kadar sayi girdigimizde
    // toplamlari bize veren bir method yazalim...
    public static void main(String[] args) {
        // Not ; Var-args ---> Arguman cesitliligi
        // Var --->variety args--->arguments
        Scanner scan = new Scanner(System.in);
        int sayi =1;
        while (sayi>0){
            System.out.println("istediginiz kadar sayi girinz :" + "\nSayilarin toplami icin 0 a basiniz");
            sayi = scan.nextInt();
            sayiToplama(sayi);
        }
    }
    private static void sayiToplama(int...sayi){ //varargs 3 noktadan anliyoruz
        for (int each:sayi
        ) {
            toplam+=each;
        }
        System.out.println(toplam);
    }
}
