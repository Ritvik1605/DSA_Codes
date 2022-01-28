/*
Given two strings of lowercase alphabets and a value K, your task is to complete the given function
which tells if  two strings are K-anagrams of each other or not.
*/
class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        // code here
        if(s1.length() == s2.length()){
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            int N = s1.length();
            List<Character> li = new ArrayList<>();
            for(int i=0;i<N;i++){
                if(arr1[i] != arr2[i]){
                    li.add(arr2[i]);
                }
            }
            if(li.size() <= k){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}