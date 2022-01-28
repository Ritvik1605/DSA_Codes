/*
Given an array H representing heights of buildings. You have to count the buildings 
which will see the sunrise
*/
class Solution {
    int countBuildings(int h[], int n) {
        // code here
        int max = h[0];
        int count = 1;
        int i = 0;
        for(int j=i+1;j<n;j++){
            if(h[j] > max){
                max = h[j];
                count = count+1;
            }
        }
        return count;
    }
}
