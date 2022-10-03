public class Zadanie1 {
    public static void main(String[] args) {
        int[] tab = new int[100];
        //uzupelnianie tablicy i wypisywanie tablicy
        for(int i = 0; i < tab.length; i++) {
            tab[i] = i;
            System.out.println(tab[i]);
        }

        System.out.println("----------------------------------");

        //wypisywanie elementow podzielnych przez 2 lub przez 5
        for(int element : tab) {
            if(element % 2 == 0 && element % 5 == 0 && element != 0) {
                System.out.println(element);
            }
        }
    }
}
