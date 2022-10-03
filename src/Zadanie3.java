public class Zadanie3 {
    public static void main(String[] args) {
        /*int[][] tab = new int[5][8];
        int[][][] tab2 = new int[3][3][3];
        int[] tab3 = new int[5];
        tab[2][3] = 5;
        tab2[1][1][1] = 8;

        for(int[] e : tab) {
            e[5] = 7;
        }*/

        int[][] tab = new int[5][5];
        //wiersze
        for(int i = 0; i < 5; i++) {
            //kolumny
            for(int j = 0; j < 5; j++) {
                tab[i][j] = 5;
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
}
