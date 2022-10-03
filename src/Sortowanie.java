import java.util.Random;

public class Sortowanie {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tab = new int[50];
        for(int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(1001);
            System.out.print(tab[i] + " ");
        }
        System.out.println();

        boolean flag = true;
        while(flag) {
            flag = false;
            for (int i = 0; i < tab.length - 1; i++) {
                if(tab[i] > tab[i + 1]) {
                    int temp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = temp;
                    flag = true;
                }
            }
        }

        for(int element : tab) {
            System.out.print(element + " ");
        }

    }
}
