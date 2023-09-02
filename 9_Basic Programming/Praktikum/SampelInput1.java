public class SampelInput1 {
    public static void drawYZX(int height) {
        char[][] pattern = new char[height][height];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j == i || j == height - 1 - i) {
                    pattern[i][j] = 'Y';
                } else if ((i + j) % 3 == 0) {
                    pattern[i][j] = 'Z';
                } else {
                    pattern[i][j] = 'X';
                }
            }
        }

        // Menampilkan pola
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(pattern[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int height = 5;
        drawYZX(height);
    }
}
