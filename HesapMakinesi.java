import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] Args) {

        boolean islem_durumu = true;
        while (islem_durumu) {

            System.out.println("""

            ---------------------------------------------
                    1:Toplama
                    2:Çıkarma
                    3:Çarpma
                    4:Bölme
            ---------------------------------------------
                    """);
            System.out.println("Yapmak istediğiniz işlem numarasını girin: ");
            Scanner scannerIslemNumarası = new Scanner(System.in); // Kullanıcıdan işlem seçmesi için bir scanner oluşturuyoruz
            int IslemNumarası = scannerIslemNumarası.nextInt(); // Oluşturduğumuz scanner'ı bir değişkene atıyoruz.

            if(IslemNumarası >=1 && IslemNumarası <=4 ) { // Eğer IslemNumarası 1'den büyük ve 4'den küçük ise:

                double birinciSayi = sayiAl("Birinci sayıyı girin: ");
                double ikinciSayi = sayiAl("İkinci sayıyı girin: ");
                switch(IslemNumarası) {
                    case 1: // Eğer IslemNumarası 1'e eşit ise:
                        ToplamaYap(birinciSayi, ikinciSayi);
                        break;
                    case 2: // Eğer IslemNumarası 2'ye eşit ise:
                        CikarmaYap(birinciSayi, ikinciSayi);   
                        break;
                    case 3: // Eğer IslemNumarası 3'e eşit ise:
                        CarpmaYap(birinciSayi, ikinciSayi);
                        break;
                    case 4: // Eğer IslemNumarası 4'e eşit ise:
                        BolmeYap(birinciSayi, ikinciSayi);
                        break;        
                }
            }else{ // Eğer IslemNumarasi 1,2,3 veya 4'e eşit değilse uygulanacak işlem.
                System.out.println("Hatalı işlem numarası, lütfen tekrar deneyin.");
                islem_durumu=false;
            }
        }

    }

    public static double sayiAl(String mesaj) { // birinciSayi ve ikinciSayi değişkenlerini her defasında tekrar almamak için bir fonksiyon.
        System.out.println(mesaj);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
        
    }
    public static void ToplamaYap(double sayi1, double sayi2) { 
        double sonuc = sayi1+sayi2;
        System.out.println("Sonuç: " + sonuc);
    }
    public static void CikarmaYap(double sayi1, double sayi2) {
        double sonuc = sayi1-sayi2;
        System.out.println("Sonuç: " + sonuc);
    }
    public static void CarpmaYap(double sayi1, double sayi2) {
        double sonuc = sayi1*sayi2;
        System.out.println("Sonuç: " + sonuc);
    }
    public static void BolmeYap(double sayi1, double sayi2) {
        if(sayi2 != 0) {
            double sonuc = sayi1/sayi2;
            System.out.println("Sonuç: " + sonuc);
        }else{ // 0'a bölünemeyeceği ve "undefined" hatası almamak için bir koşul ekliyoruz.
            System.out.println("Bir sayıyı 0'a bölemezsiniz.");
        }
        
    }

}
