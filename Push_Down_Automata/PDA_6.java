// L = {a^m b^n | m<=n}

import java.util.Stack;
import java.util.Scanner;

public class PDA_6 {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<Character>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String a = sc.nextLine();
        int count = a.length();
        int i = 0;
        while(i < count){
            if (a.charAt(i) == 'a'){
                s.push('X');
            }
            else if (a.charAt(i) == 'b' && s.isEmpty()){
                System.out.println("Valid String");
                return;
            }
            else if (a.charAt(i) == 'b'){
                s.pop();
            }
            else{
                System.out.println("Invalid String");
            }
            System.out.println(s);
            i++;
        }
        if(s.isEmpty() || s.peek() == 'X'){
            System.err.println("no. of 'b' should be more the 'a'");
        }
    }
}
