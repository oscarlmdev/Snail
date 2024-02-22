public class Snail {

    public static int[] snail(int[][] array) {

        // Case empty array
        if (array.length == 1) return array[0];
        int n = array.length;
        int[] result = new int[n * n];
        int i = 0;

        int rTop = 0;
        int rBottom = n - 1;
        int cLeft = 0;
        int cRight = n - 1;

        while ((rTop <= rBottom) && (cLeft <= cRight)) {

            // Row left to right
            for (int r = cLeft; r <= cRight; r++) {
                result[i++] = array[rTop][r];
            }
            rTop++;

            // Column top to bottom
            for (int c = rTop; c <= rBottom; c++) {
                result[i++] = array[c][cRight];
            }
            cRight--;

            // Row right to left
            if (rTop <= rBottom) {
                for (int r = cRight; r >= cLeft; r--) {
                    result[i++] = array[rBottom][r];
                }
                rBottom--;

            // Column bottom to top
            }
            if (cLeft <= cRight) {
                for (int c = rBottom; c >= rTop; c--) {
                    result[i++] = array[c][cLeft];
                }
                cLeft++;
            }
        }
        return result;
    }
}
