import java.util.Scanner;

class Main{
    public static String matchSub(String input, String comp){
        int N1 = input.length();
        int N2 = comp.length();
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
