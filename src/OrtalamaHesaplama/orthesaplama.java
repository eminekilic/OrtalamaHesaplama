package OrtalamaHesaplama;
/*Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan
 ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
 Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması
  60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
 */
import java.util.Scanner;
public class orthesaplama {
    public static void main(String[] args) {
        int matematik,fizik,kimya,turkce,tarih,muzik;
        double ortalama;
        Scanner okuyucu = new Scanner(System.in);
        System.out.println("Matematik notunu giriniz--> ");
        matematik = okuyucu.nextInt();
        System.out.println("Fizik notunu giriniz--> ");
        fizik = okuyucu.nextInt();
        System.out.println("Kimya notunu giriniz--> ");
        kimya = okuyucu.nextInt();
        System.out.println("Türkçe notunu giriniz--> ");
        turkce = okuyucu.nextInt();
        System.out.println("Tarih notunu giriniz--> ");
        tarih = okuyucu.nextInt();
        System.out.println("Müzik notunu giriniz--> ");
        muzik = okuyucu.nextInt();
        ortalama = (matematik+fizik+kimya+turkce+tarih+muzik)/6;
        if(ortalama>=60)
            System.out.println("Sınıfı geçtiniz");
        else
            System.out.println("Sınıfı geçemediniz");



    }
}
