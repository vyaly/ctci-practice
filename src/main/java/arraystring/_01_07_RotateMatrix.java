package arraystring;

/**
 * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
 * write a method to rotate the image by 90 degrees. Can you do this in place?
 */
class _01_07_RotateMatrix {
    int[][] rotate(int[][] m) {
        int n = m.length;
        for(int layer = 0; layer < n/2; layer++) {
            for( int i = layer; i < n - layer; i++ ){
                int last = n - layer;
                int top = m[layer][i];
//                top <- bottom
                m[layer][i] = m[last][i];
                m[last][i] = m[i][0];
            }
        }
        return m;
    }


}
