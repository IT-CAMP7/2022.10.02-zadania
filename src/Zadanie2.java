import java.util.Random;

public class Zadanie2 {
    public static void main(String[] args) {
        /*Random random = new Random();
        int a = random.nextInt(1001)-500;
        System.out.println(a);*/

        //generowanie tablicy
        Random random = new Random();
        int[] tab = new int[100];
        for(int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(1001);
            System.out.println(tab[i]);
        }

        //wyliczanie sredniej
        int total = 0;
        for(int element : tab) {
            total += element;
        }
        System.out.println("Total: " + total);
        System.out.println("Sredia: " + ((double) total) / ((double) tab.length));
    }
}
