import java.util.Scanner;
import java. util. Random;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("<---===Zadanie 1===--->");
        System.out.println("Wprowadz liczbe n: ");
        double n = keyboard.nextDouble();
        Metoda_1(n);
        System.out.println("<---===Zadanie 2===--->");
        System.out.println("Wprowadz ilosc losowych liczb");
        int N = keyboard.nextInt();
        Metoda_2(N);
        Metoda_3(N);
        System.out.println("<---===Zadanie 3===--->");
        System.out.println("Wprowadz liczbe Height: ");
        int H = keyboard.nextInt();
        paintPiramide(H);
    }

    public static int Metoda_1(double n){
        if (n > 0){
            for (int i = 0; i <= n; i++){
                System.out.println(i);
            }
        } else {
            for (int i = 0; i >= n; i--){
                System.out.println(i);
            }
        }
        return 0;
    }

    public static int Metoda_2(int N){
        int ilosc = 0;
        System.out.println("Metoda 2");
        while (ilosc != N){
            Random rand = new Random();
            int liczba = rand.nextInt();
            System.out.println(liczba);
            ilosc++;
        }
        return 0;
    }

    public static int Metoda_3(int N){
        int ilosc = 0;
        System.out.println("Metoda 3");
        do {
            Random rand = new Random();
            int liczba = rand.nextInt();
            System.out.println(liczba);
            ilosc++;
        } while (ilosc != N);
        return 0;
    }

    public static void paintPiramide(int H_liczba) {
            H_liczba = (H_liczba + 1);
            for (int i = 0; i <= H_liczba; i++) {
                if (i % 2 == 0) {
                    continue;
                } else {
                    for (int j = 0; j < (H_liczba - i)/2; j++) {
                        System.out.print(" ");
                    }
                    for (int l = 1; l <= i; l++) {
                        System.out.print("*");
                    }
                    if (i != H_liczba - 1) {
                        System.out.println();
                    }
                }
            }
    }

}