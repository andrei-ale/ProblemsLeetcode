package Pb_695_MaxAreaOfIsland;

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxLength = 0;
        int m = grid.length;
        int n = grid[0].length;
        LinkedList<MyPair> Q = new LinkedList<MyPair>();
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (grid[i][j] == 1) {
                    int length = getArea (grid, i, j, m, n);
                    if (maxLength < length){
                        maxLength = length;
                    }
                }
            }
        }
        return maxLength;
    }
    public int getArea (int[][] grid, int i, int j, int m, int n){
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        LinkedList<MyPair> Q = new LinkedList<MyPair>();
        int length = 0;
        Q.add(new MyPair(i, j));
        length++;
        grid[i][j] = 0;
        while (Q.size() > 0) {
            MyPair current = Q.removeFirst();
            for(int k = 0; k < 4; k++){
                int xNew = current.x + dx[k];
                int yNew = current.y + dy[k];
                if (xNew >= 0 && yNew >= 0 && xNew < m && yNew < n && grid[xNew][yNew] == 1) {
                    Q.add (new MyPair(xNew, yNew));
                    length++;
                    grid[xNew][yNew] = 0;
                }
            }
        }
        return length;
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


