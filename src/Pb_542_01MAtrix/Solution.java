package Pb_542_01MAtrix;

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        LinkedList <MyPair> queue = new LinkedList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++){
                if (mat[i][j] == 0){
                    queue.add(new MyPair(i , j));
                }
                else {
                    mat[i][j] = 2000000;
                }
            }
        }
        while (queue.size() > 0) {
            MyPair current = queue.removeFirst();
            for(int i = 0; i < 4; i++){
                int xNew = current.x + dx[i];
                int yNew = current.y + dy[i];
                if (xNew >= 0 && yNew >= 0 && xNew < mat.length && yNew < mat[0].length && mat[current.x][current.y] + 1 < mat[xNew][yNew]) {
                    mat[xNew][yNew] = mat[current.x][current.y] + 1;
                    queue.add(new MyPair(xNew , yNew));
                }
            }
        }
        return mat;
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


