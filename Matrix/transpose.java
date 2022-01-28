/*
Write a program to find the transpose of a square matrix of size N*N. 
Transpose of a matrix is obtained by changing rows to columns and columns to rows.
*/
class Solution
{
    
    //Function to find transpose of a matrix.
    static void transpose(int matrix[][], int n)
    {
        // code here
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}