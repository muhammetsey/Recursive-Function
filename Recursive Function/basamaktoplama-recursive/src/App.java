public class App {
    static int basamaktopla(int sayi) {
        if (sayi == 0) {
            return 0;
        }

        return (sayi % 10) + basamaktopla(sayi / 10);
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        int sayi = scanner.nextInt();

        System.out.println("Basamaklarının toplamı: " + basamaktopla(sayi));

        scanner.close();
    }
}