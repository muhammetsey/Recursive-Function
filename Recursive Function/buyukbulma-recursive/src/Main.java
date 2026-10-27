public class Main {
    static int BuyukBul(int[] A, int N) {
        
        if (N <= 0) {
            throw new IllegalArgumentException("Dizi bos veya gecersiz uzunlukta olamaz!");
        }
        if (N == 1) {
            return A[0]; 
        }
        int oncekiEnBuyuk = BuyukBul(A, N - 1);
        if (A[N - 1] > oncekiEnBuyuk) {
            return A[N - 1];
        }

        return oncekiEnBuyuk;
    }
    public static void main(String[] args) {
        int[] A = {12, 5, 27, 8, 19};
        int N = A.length;

        System.out.println("Dizideki en büyük eleman: " + BuyukBul(A, N));
    }
}