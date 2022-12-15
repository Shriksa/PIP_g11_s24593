import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Wpisz liczbe n: ");
        int n = keyboard.nextInt();
        System.out.println("<--==Zadanie 1==-->");
        System.out.println(Fibanacci(n));
        System.out.println("<--==Zadanie 2==-->");
        System.out.println(Rekurencja(n));
        System.out.println("<--==Zadanie 3==-->");
        System.out.println("Wpisz liczbe w tablice: ");
        int n1 = keyboard.nextInt();
        int tablica[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            tablica[i] = keyboard.nextInt();
        }
        System.out.println("Normalna kolejność: ");
        for (int i = 0; i < n1; i++) {
            System.out.print(tablica[i] + ", ");
        }
        System.out.println("Odwrotna kolejność: " + Odwrotna_tablica(tablica));
        System.out.println("<--==Zadanie 4==-->");
        System.out.println("Wpisz key: ");
        int key = keyboard.nextInt();
        System.out.println(Zadanie_4(tablica, key));
        System.out.println(Zadanie_4_Rekurencja(tablica, tablica[0], tablica[tablica.length - 1], key));
    }

    public static int Fibanacci(int n){
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i = 0; i < n; i++){
            c = a;
            a = b;
            b = c + b;
        }
        return(a);
    }

    public static int Rekurencja(int n){
        if ( n == 0) {
            return 0;
        } else if (n == 1){
            return 1;
        } else {
            return Rekurencja(n-1) + Rekurencja(n-2);
        }
    }

    public static int Odwrotna_tablica(int tablica[]){
        for (int i = tablica.length - 1; i >= 0; i--) {
            System.out.print(tablica[i] + ", ");
        }
        return 0;
    }

    public static int Zadanie_4(int tablica[], int key){
        boolean Wynik = false;
        while (!Wynik){
            for (int i = 0; i <= tablica.length - 1; i++){
                if(tablica[i] == key){
                    System.out.println(tablica[i] + " <--- Key");
                    Wynik = true;
                    break;
                }
            }
        }
        return 0;
    }

    public static int Zadanie_4_Rekurencja(int tablica[], int pierwszy_Element, int ostatni_Element, int szukany_Element) {
        if (ostatni_Element >= pierwszy_Element) {
            int middle = (ostatni_Element + pierwszy_Element) / 2;
            if (tablica[middle] == szukany_Element) {
                return middle;
            }
            if (tablica[middle] > szukany_Element) {
                return Zadanie_4_Rekurencja(tablica, pierwszy_Element, middle - 1, szukany_Element);
            }
                return Zadanie_4_Rekurencja(tablica, middle + 1, ostatni_Element, szukany_Element);
        }
        return -1;
    }
}