import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("---===1===---");
        System.out.println("Wprowadz dwie liczby calkowite: ");
        String pierwszy_wiersz = keyboard.nextLine();
        String drugi_wiersz = keyboard.nextLine();
        int pierwsza_L = Integer.parseInt(pierwszy_wiersz);
        int druga_L = Integer.parseInt(drugi_wiersz);
        System.out.println("Wybierz operacje: ");
        System.out.println("ADD: +");
        System.out.println("SUB: -");
        System.out.println("DIV: /");
        System.out.println("MUL: *");
        String Operacja = keyboard.nextLine();
        int Wynik = 0;
        switch (Operacja) {
            case ("ADD"):
                Wynik = pierwsza_L + druga_L;
                break;
            case ("SUB"):
                Wynik = pierwsza_L - druga_L;
                break;
            case ("DIV"):
                Wynik = pierwsza_L / druga_L;
                break;
            case ("MUL"):
                Wynik = pierwsza_L * druga_L;
                break;
        }
        System.out.println("Wynik: " + Wynik);
        System.out.println("Wykorzystanie metody absoluteValue: ");
        absoluteValue(Wynik);
        System.out.println("<---===3===--->");
        System.out.println("Generator losowych 5 znakow: ");
        getRandomString(5);

    }
    public static void absoluteValue(int a) {
        if (a < 0){
            a = a - (2 * a);
            System.out.println("Metoda zmienia liczbe na dodatnia: " + a);
        } else {
            System.out.println("Liczba jest dodatnia, metoda nie zmienia wartosc: " + a);
        }
    }
    public static String getRandomString(int lenght){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random_symbol = new Random();
        StringBuffer sb =new StringBuffer();
        for(int i = 0; i < lenght; i++){
            int number = random_symbol.nextInt(62);
            sb.append(str.charAt(number));
        }
        System.out.println(sb);
        return sb.toString();
    }
}