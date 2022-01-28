/*
Given a boolean 2D array of n x m dimensions where each row is sorted. 
Find the 0-based index of the first row that has the maximum number of 1's.
*/
class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int max = 0;
        int index = -1;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<m;j++){
                //int count = 0;
                if(arr[i][j] == 1){
                    count = count+1;
                }
            }
            if(count > max){
                max  = count;
                index = i;
            }
        }
        return index;
    }
}