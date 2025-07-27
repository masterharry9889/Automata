// L = {a^m b^n || m>=n}

import java.util.Scanner;
import java.util.Stack;

public class PDA_5 {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<Character>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String!!!!");
        String a = sc.nextLine();
        int count = a.length();
        int i = 0;
        while (i < count){
            switch (a.charAt(i)){
                case 'a':
                    s.push('X');
                    break;
                case 'b':
                    s.pop();
                    break;
                default:
                    System.out.println("Invalid character in the string. Only 'a' and 'b' are allowed.");
                    return;
            }
            System.out.println(s);
            i++;
        }
        if (s.isEmpty() || s.peek() == 'X') {
            System.out.println("Valid String");
        }
        else {
            System.out.println("Invalid String");
        }
    }
}
