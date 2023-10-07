package Pb_733_FloodFill;

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color){
            return image;
        }
        int initialColor = image[sr][sc];
        image[sr][sc] = color;
        fill(image, sr, sc, color, initialColor);
        return image;





//        int[] dx = {-1, 0, 1, 0};
//        int[] dy = {0, 1, 0, -1};
//        int m = image.length;
//        int n = image[0].length;
//        int initial = image[sr][sc];
//        image[sr][sc] = color;
//        LinkedList<MyPair> Q = new LinkedList<MyPair>();
//        Q.add(new MyPair(sr, sc));

//        while (Q.size() > 0) {
//            MyPair current = Q.removeFirst();
//            for(int i = 0; i < 4; i++){
//                 int xNew = current.x + dx[i];
//                 int yNew = current.y + dy[i];
//                 if (xNew >= 0 && yNew >= 0 && xNew < m && yNew < n && image[xNew][yNew] == initial) {
//                     image[xNew][yNew] = color;
//                     Q.add (new MyPair(xNew, yNew));
//                 }
//             }
//         }
//        return image;
    }
    public void fill (int[][] image, int sr, int sc, int color, int initialColor){
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int m = image.length;
        int n = image[0].length;
        for (int i = 0; i < 4; i++){
            int xNew = sr + dx[i];
            int yNew = sc + dy[i];
            if (xNew >= 0 && yNew >= 0 && xNew < m && yNew < n && image[xNew][yNew] == initialColor) {
                image[xNew][yNew] = color;
                fill(image, xNew, yNew, color, initialColor);
            }
        }
    }
}
class MyPair {
    public int x;
    public int y;
    public MyPair (int x, int y){
        this.x = x;
        this.y = y;
    }
}


