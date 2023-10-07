package Pb_994_RottenOranges;

class Solution {
    public int orangesRotting(int[][] grid) {
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int minutes = 0;
        int freshOranges = 0;
        LinkedList <MyPair> queue = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == 1){
                    freshOranges += 1;
                    grid[i][j] = 1000;
                }
                if (grid[i][j] == 2){
                    queue.add(new MyPair(i , j));

                }
            }
        }
        if (freshOranges == 0){
            return 0;
        }
        while (queue.size() > 0) {
            MyPair current = queue.removeFirst();
            for(int i = 0; i < 4; i++){
                int xNew = current.x + dx[i];
                int yNew = current.y + dy[i];
                if (xNew >= 0 && yNew >= 0 && xNew < grid.length && yNew < grid[0].length && grid[current.x][current.y] + 1 < grid[xNew][yNew]) {
                    grid[xNew][yNew] = grid[current.x][current.y] + 1;
                    queue.add(new MyPair(xNew , yNew));
                    minutes = grid[xNew][yNew] -2;
                }
            }

        }
        System.out.println(grid);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == 1000){
                    return -1;
                }
            }
        }
        return minutes;
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


