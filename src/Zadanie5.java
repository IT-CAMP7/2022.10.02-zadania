import java.util.Random;

public class Zadanie5 {
    public static void main(String[] args) {
        int[] tablica = new int[100];

        // Stworzenie objektu Random
        Random rnd = new Random();
        // Wypełnienie tablicy losowymi elemantami
        for (int i = 0; i < tablica.length; i++) {
            // przypisywanie losowego elementu z zakresu 0 - 1000
            tablica[i] = rnd.nextInt(1001);
        }

        int max = tablica[0];
        for (int wynik : tablica) {
            if (wynik > max)
                max = wynik;
            System.out.println(wynik);
        }

        System.out.println("............");
        System.out.println(max);

    }
}
