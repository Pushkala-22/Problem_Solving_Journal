class Solution {
    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(i,j,grid);
                }
            }
        }
        return count;
    }
    public void dfs(int r,int c, char[][] grid){
        int rl=grid.length;
        int cl =grid[0].length;
        if(r<0 ||r>=rl ||c<0 ||c>=cl ||grid[r][c]=='0'){
            return;
        }
        grid[r][c]='0';
        dfs(r,c+1,grid);
        dfs(r,c-1,grid);
        dfs(r-1,c,grid);
        dfs(r+1,c,grid);
    }
}