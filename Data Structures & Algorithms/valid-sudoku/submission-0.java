class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i=0; i<board.length; i++) {

            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.')
                    continue;
                if (Integer.parseInt(String.valueOf(board[i][j])) < 1 || Integer.parseInt(String.valueOf(board[i][j])) > 9) {
                    return false;
                }
            }
        }

            for(int i=0; i<board.length; i++) {
                HashMap<Integer, Integer> map = new HashMap<>();

                for(int j=0; j<board[i].length; j++ ) {
                    if (board[i][j] == '.')
                        continue;
                    if(map.put((int) board[i][j], 0) != null) {
                        return  false;
                    }

                }
        }


        for(int i=0; i<board.length; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for(int j=0; j<board[i].length; j++ ) {
                if (board[j][i] == '.')
                    continue;
                if(map.put((int) board[j][i], 0) != null) {
                    return  false;
                }

            }
        }



        for(int rowbox = 0 ; rowbox <9; rowbox+=3) {

            for(int rowcol = 0 ; rowcol <9; rowcol+=3) {
                HashMap<Integer, Integer> map = new HashMap<>();
                for(int i=rowbox; i< rowbox+3; i++) {

                    for(int j=rowcol ; j<rowcol+3; j++) {
                        if (board[i][j] == '.')
                            continue;
                        if(map.put((int) board[i][j], 0) != null) {
                            return  false;
                        }
                    }

            }
        }

        }


        return true;
    }
}
