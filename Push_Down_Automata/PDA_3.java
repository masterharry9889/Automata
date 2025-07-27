// L = (a^2n b^n | n >= 1}

import java.util.Stack;
import java.util.Scanner;

public class PDA_3 {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<Character>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String!!!!");
        String a = sc.nextLine();
        int count = a.length();
        for (int i = 0; i < count; i++){
            if (a.charAt(i) == 'a')
                if (a.charAt(i+1) == 'a'){
                    s.push('X');
                }
            else if (a.charAt(i) == 'b')
            s.pop();
            else {
                System.out.println("Invalid character in the string. Only 'a' and 'b' are allowed.");
                return;
            }
            System.out.println(s);
        }
        if (s.isEmpty()) {
            System.out.println("Valid String");
        }
        else {
            System.out.println("Invalid String");
        }
    }
}
