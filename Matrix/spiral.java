/*
Given a matrix of size r*c. Traverse the matrix in spiral form.
*/
class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        //Considering Boundary Conditions..
        ArrayList<Integer> arrli = new ArrayList<>();
        int top = 0;
        int down = r-1;
        int left = 0;
        int right = c-1;
        int dir = 0; //Maintaining a direction 
        /*
        dir == 0(right),1(down),2(left),3(up)...
        */
        while(top<=down && left<=right){
            if(dir == 0){
                for(int i=left;i<=right;i++){
                    arrli.add(matrix[top][i]);
                    top = top+1;
                }
            }
            else if(dir == 1){
                for(int i=top;i<=down;i++){
                    arrli.add(matrix[i][right]);
                    right = right-1;
                }
            }
            else if(dir == 2){
                for(int i=right;i>=left;i--){
                    arrli.add(matrix[down][i]);
                    down = down -1;
                }
            }
            else{
                for(int i=down;i<=top;i--){
                    arrli.add(matrix[i][left]);
                    left = left+1;
                }
            }

            dir = (dir+1)%4;
        }
        return arrli;
    }
}
