public class Zadanie4 {
    public static void main(String[] args) {
        int[][] tab = new int[10][10];

        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                tab[i][j] = i*j;
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
}
