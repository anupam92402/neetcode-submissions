class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Integer>> row = new HashMap<>();
        Map<Integer, Set<Integer>> col = new HashMap<>();
        Map<Integer, Set<Integer>> box = new HashMap<>();
        for(int i = 0; i < 9; i++){
            row.put(i, new HashSet<>());
            col.put(i, new HashSet<>());
            box.put(i, new HashSet<>());
        }
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                int value = board[i][j] - '0';
                if(row.get(i).contains(value)){
                    return false;
                }
                if(col.get(j).contains(value)){
                    return false;
                }
                int boxNo = 0;
                int rl = i / 3;
                int cl = j / 3;
                boxNo = rl * 3 + cl;
                if(box.get(boxNo).contains(value)){
                    return false;
                }
                row.get(i).add(value);
                col.get(j).add(value);
                box.get(boxNo).add(value);
            }
        }
        return true;
    }
}

