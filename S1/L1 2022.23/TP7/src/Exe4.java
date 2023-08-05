package tp7;

public class Exe4 {

    public static int[][] copieurTab2D(int[][] r2) {
        int[][] tabR = new int[r2.length][];
        for (int i = 0; i < tabR.length; i++) {
            tabR[i] = new int[r2[i].length];

            for (int j = 0; j < tabR[i].length; j++) {
                tabR[i][j] = r2[i][j];
            }
        }
        return tabR;
    }

    public static void afficheTab2D(int[][] r2) {

        System.out.print("+");
        for (int i = 0; i < r2[0].length; i++) {
            System.out.print("--+");
        }

        for (int i = 0; i < r2.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < r2[i].length; j++) {
                System.out.print("|" + r2[i][j] + ((r2[i][j] - r2[i][j] % 10) >= 10 ? "" : " "));
            }

            System.out.print("|");

            System.out.print("\n");

            System.out.print("+");
            for (int j = 0; j < r2[0].length; j++) {
                System.out.print("--+");
            }
        }

        System.out.print("\n\n");
    }

    // Écrire une fonction qui renvoie la somme, case par case, de deux rectangles
    public static int[][] sommeRectangles(int[][] tab1, int[][] tab2) {
        int[][] tabR = copieurTab2D(tab1);
        for (int i = 0; i < tabR.length; i++) {
            for (int y = 0; y < tabR[i].length; y++) {
                tabR[i][y] += tab2[i][y];
            }
        }
        return tabR;
    }

    // Écrire une fonction qui renvoie la symétrie horizontale du rectangle d'entrée
    public static int[][] symetrieHorizontale(int[][] tab1) {
        int[][] tabR = copieurTab2D(tab1);
        for (int i = 0; i < tabR.length; i++) {
            for (int y = 0; y < tabR[i].length; y++) {
                tabR[i][y] = tab1[tabR.length - i - 1][y];
            }
        }
        return tabR;
    }

    // Écrire une fonction qui renvoie la symétrie verticale du rectangle d'entrée
    public static int[][] symetrieVerticale(int[][] tab1) {
        int[][] tabR = copieurTab2D(tab1);
        for (int i = 0; i < tabR.length; i++) {
            for (int y = 0; y < tabR[i].length; y++) {
                tabR[i][y] = tab1[i][tabR[i].length - y - 1];
            }
        }
        return tabR;
    }
    // Écrire une fonction qui renvoie la transposition du rectangle d'entrée

    // Écrire une fonction qui renvoie la rotation du rectangle d'entrée

    public static void main(String[] args) {
        int[][] rectangle = {{1, 12, 20, 8, 17, 6, 13},
                {14, 2, 10, 21, 9, 16, 5},
                {18, 19, 3, 4, 7, 11, 15}};


        int[][] rectangle2 = {{3, 5, 54, 1, 7, 10, 3},
                {2, 2, 12, 21, 13, 21, 0},
                {18, 19, 3, 4, 7, 11, 5}};

        afficheTab2D(sommeRectangles(rectangle, rectangle2));

        afficheTab2D(rectangle);

        afficheTab2D(symetrieHorizontale(rectangle));
        afficheTab2D(symetrieVerticale(rectangle));
    }
}