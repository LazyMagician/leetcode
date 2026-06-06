class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean [][] row = new boolean [9][9];
        boolean [][] col = new boolean [9][9];
        boolean [][] boxes = new boolean [9][9];

        int rowLen = board.length;
        int colLen = board[0].length;
        int boxNum = -1;
        char ele =0;

        // row check
        for(int i=0;i<rowLen;i++){
            for(int j=0;j<colLen;j++){
                ele = board[i][j];
                if(ele != '.'){
                    int num = ele - '0';

                    // row check
                    if(row[i][num-1]){
                        // System.out.println("false row");
                        return false;
                    }else{
                        row[i][num-1]=true;
                    }

                    // col check
                    if(col[j][num-1]){
                        // System.out.println("false col");
                        return false;
                    }else{
                        col[j][num-1]=true;
                    }

                    // box check
                    boxNum = (i/3)*3+(j/3);
                    if(boxes[boxNum][num-1]){
                        // System.out.println("false box "+i+" "+j+" "+boxNum+" "+(num-1)+" "+boxes[boxNum][num-1]);
                        return false;
                    }else{
                        boxes[boxNum][num-1]=true;
                    }
                }
            }
        }  
        return true;
    }
}