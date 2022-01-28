/*
Given a matrix of size N x N. Print the elements of the matrix in the snake like pattern depicted below.
*/
class Solution
{
    //Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        // code here 
        ArrayList<Integer> arrli = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            if(i%2==0){
                for(int j=0;j<matrix[i].length;j++){
                    arrli.add(matrix[i][j]);
                }
            }
            else{
                for(int j=matrix[i].length-1;j>=0;j--){
                    arrli.add(matrix[i][j]);
                }
            }
        }
        return arrli;
    }
}
