import java.util.Scanner;
import java. util. Random;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("<---===Zadanie 1===--->");
        System.out.println("Wprowadz liczbe n - elementow: ");
        int n = keyboard.nextInt();
        int[] array = new int[n];
        generateArray(array);
        System.out.println("<---===Zadanie 2===--->");
        int[] sortedArr = sort(array);
        printArray(sortedArr);
        System.out.println("<---===Zadanie 3===--->");
        int[] revArr = reverse(sortedArr);
        printArray(revArr);
        System.out.println("<---===Zadanie 4===--->");
        System.out.println(equalsReverse(sortedArr, revArr));

    }

    public static void generateArray(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(101);
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] sort(int[] array) {
        int[] sorted_array = array.clone();
        for (int i = 0; i < sorted_array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < sorted_array.length; j++) {
                if (sorted_array[j] < sorted_array[min]) {
                    min = j;
                }
            }
            int zmiena = sorted_array[i];
            sorted_array[i] = sorted_array[min];
            sorted_array[min] = zmiena;
        }
        return sorted_array;
    }

    public static int[] reverse(int[] array) {
        int[] odwrotna_array = array.clone();
        for (int i = 0; i < odwrotna_array.length / 2; i++) {
            int zmiena = odwrotna_array[i];
            odwrotna_array[i] = odwrotna_array[odwrotna_array.length - 1 - i];
            odwrotna_array[odwrotna_array.length - 1 - i] = zmiena;
        }
        return odwrotna_array;
    }

    public static int[] printArray(int[] array) {
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }

    public static boolean equalsReverse(int[] array1, int[] array2){
        for (int i = 0; i < array1.length; i++){
            if (array1[i] != array2[array2.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

}