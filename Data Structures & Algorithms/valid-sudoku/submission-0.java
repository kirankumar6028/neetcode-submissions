class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> aleadyExist = new HashSet<>();

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char num = board[i][j];
                if(num != '.'){
                    if(!aleadyExist.add(num + " at row " + i) ||
                    !aleadyExist.add(num + " at col " + j) ||
                    !aleadyExist.add(num + " at sub box " + i/3 + "-" + j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
