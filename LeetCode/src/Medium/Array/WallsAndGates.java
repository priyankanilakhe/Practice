//https://tenderleo.gitbooks.io/leetcode-solutions-/content/GoogleMedium/286.html
package Medium.Array;

public class WallsAndGates {
    static int EMPTY = 2147483647;


    public void wallsAndGates(int[][] rooms) {
        if(rooms == null || rooms.length == 0) return;
        for(int i=0; i< rooms.length; i++){
            for(int j=0; j< rooms[0].length; j++){
                if(rooms[i][j] == 0){
                    dfs(rooms, i, j, 0);
                    //bfs(rooms, i, j);
                }        
            }
        }
    }

    private void dfs(int[][] rooms, int x, int y, int dis){

        if(x < 0 || x >= rooms.length
            || y < 0 || y >= rooms[0].length || rooms[x][y] == -1)
                return;
        if( dis > rooms[x][y]) return;
        // don't really need the min methods, if it is 0 ,then only show once.
        rooms[x][y] = Math.min(rooms[x][y], dis);// since a room is already 0,
                                        // in first level, there is no set really.
        dfs(rooms, x+1, y, dis+1);
        dfs(rooms, x-1, y, dis+1);
        dfs(rooms, x, y+1, dis+1);
        dfs(rooms, x, y-1, dis+1);
    }

    
    ///BFS
}
