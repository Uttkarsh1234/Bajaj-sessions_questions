class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        Queue<Pair> q = new LinkedList<>();
        int[][] visi = new int[n][m];
        q.offer(new Pair(sr,sc));
        visi[sr][sc]=color;

        int[] neigh_row = {-1,0,1,0};
        int[] neigh_col = {0,1,0,-1};
        while(!q.isEmpty()){
            Pair curr = q.poll();
            int pixel_start = image[sr][sc];
            for(int i=0;i<4;i++){
                int nrow = curr.r + neigh_row[i];
                int ncol = curr.c + neigh_col[i];

                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && visi[nrow][ncol]!=color && image[nrow][ncol]==pixel_start){
                    q.offer(new Pair(nrow,ncol));
                    visi[nrow][ncol] = color;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visi[i][j]!=color){
                    visi[i][j] = image[i][j];
                }
            }
        }
        return visi;
    }
}
class Pair{
    int r,c;
    Pair(int row,int col){
        this.r = row;
        this.c = col;
    }
}
