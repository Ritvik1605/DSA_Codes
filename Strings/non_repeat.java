/*
    Given a string S consisting of lowercase Latin Letters. Find the first non-repeating character in S.
    Input: S = hello
    Output: h
*/
import java.util.Scanner;
class Main{
    static char nonrepeatingCharacter(String S)
    {
        int[] count = new int[256];
        for(int i=0;i<S.length();i++){
            count[S.charAt(i) - 'a'] = count[S.charAt(i) - 'a'] + 1;
        }
        char index = '$';
        for(int j=0;j<S.length();j++){
            if(count[S.charAt(j) - 'a'] == 1){
                index = S.charAt(j);
                return index;
            }
        }
        return index;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        nonrepeatingCharacter(str);
    }
}
