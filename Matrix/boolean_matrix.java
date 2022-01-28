/*
Given a boolean matrix of size RxC where each cell contains either 0 or 1, modify it
such that if a matrix cell matrix[i][j] is 1 then all the cells in its ith row and jth column will become 1.
*/
class Solution
{
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int matrix[][])
    {
        // code here 
        int R = matrix.length;
        int C = matrix[0].length;
        int row[] = new int[R];
        int col[] = new int[C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(matrix[i][j] == 1){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(matrix[i][j] == 0){
                    if(row[i] == 1 || col[j] == 1){
                        matrix[i][j] = 1;
                    }
                }
            }
        }
    }
}
