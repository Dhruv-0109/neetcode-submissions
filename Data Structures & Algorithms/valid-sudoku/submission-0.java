class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<Character> rowSet = new HashSet<>();
        HashSet<Character> column = new HashSet<>();
        HashSet<Character> square = new HashSet<>();

        //SQUARE
        for (int row = 0; row < 9; row += 3) {// Jump to next 3x3 block row
            for (int col = 0; col < 9; col += 3) {// Jump to next 3x3 block col
                 square.clear(); 
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char ch = board[row + i][col + j]; // FIXED
                        if (ch != '.') {
                            if(!square.add(ch))
                                return false;
                        }
                    }
                }
            }
        }

        //ROWS
        for(int col =0; col < 9; col++) //rows
        {
            rowSet.clear();
            for(int row =0; row<9; row++)
            {
                char ch = board[row][col];
                if(ch != '.')
                {
                    if(!rowSet.add(ch))
                        return false;   
                }
            }
        }

        //COLS
        for(int row = 0; row<9; row++) //column
        {
            column.clear();
            for (int col = 0; col < 9; col++) {
                char ch = board[row][col];
                if (ch!= '.') {
                    if (!column.add(ch) )
                        return false;
                }
            }
        }

        return true;    
    }
}
