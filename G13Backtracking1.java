public class G13Backtracking1 {
    /*
     * Recursion and Backtracing are powerfull tech used to solve
     * complex problems on matrice and grids.
     * given grid of characters and string
     * exits in the grid.
     * The word can be constructed from letters
     * The same letter cell cannot be used more
     * word
     * return true if word
     * in adjacent cells(hor and ver)
     * than once.
     * Approach:
     * use dfs(depth first search) with backtracking
     * 
     * start from each cell, try to match the first letter of the word
     * explore in all four possible directions
     * if the char of the word matches, return false, if the path is incorrect then backtrack and mark all the cells as unvisited
     * 
     * leetcode 79
     */
    public static boolean exist(char[][]brd,String wrd){
        int r=brd.length;
        int c=brd[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(brd[i][j]==wrd.charAt(0)&&dfs(brd,i,j,wrd,0)){
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean dfs(char[][] brd,int i,int j,String wrd,int index){
        if(index==wrd.length()) return true;
        if(i<0||j<0||i>=brd.length||j>=brd[0].length||brd[i][j]!=wrd.charAt(index)){
            return false;
        }
        char temp=brd[i][j];
        brd[i][j]='#';

        boolean fou=dfs(brd,i+1,j,wrd,index+1)||dfs(brd,i-1,j,wrd,index+1)||dfs(brd,i,j+1,wrd,index+1)||dfs(brd,i,j-1,wrd,index+1);

        brd[i][j]=temp;

        return fou;
    }
    public static void main(String[] args) {
        char[][]brd={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String wrd="ASDFG";
        System.out.println("word found: "+exist(brd,wrd));
    }
}
