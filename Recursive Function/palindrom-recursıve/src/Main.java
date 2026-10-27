import java.util.Scanner;

public class Main {
    static boolean palindromMu(String metin, int sol, int sag) {
        if (sol >= sag) {
            return true;
        }
         if (metin.charAt(sol) != metin.charAt(sag)) {
            return false;
        }

        return palindromMu(metin, sol + 1, sag - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir string giriniz: ");
        String metin = scanner.next();

        if (palindromMu(metin, 0, metin.length() - 1)) {
            System.out.println("Palindromdur.");
        } else {
            System.out.println("Palindrom değildir.");
        }

        scanner.close();
    }
}