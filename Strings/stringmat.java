import java.util.Scanner;

class Main{
    public static String matchSub(String input, String comp){
        int N1 = input.length();
        int N2 = comp.length();
        int i = 0;
        int begin = 0;
        int end = 0;
        int count = 0;
        for(int low=0,high=0;high<N1;high++){
            if(input.charAt(high) == comp.charAt(i)){
                high = high+1;
                i = i+1;
                count = count+1;
                if(count == N2){
                    begin = low;
                    end = high;
                    i = 0;
                    while(count >= N2){
                        low = low+1;
                    }
                }
            }
            else{
                high = high+1;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String input = sc.nextLine(); //String to be matched...
        sc.nextLine();
        String comp = sc.nextLine(); // String whose characters are searched..
        sc.close();
        String result = matchSub(input,comp);
        System.out.println(result);
    }
}
