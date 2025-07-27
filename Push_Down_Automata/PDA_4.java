// L = {a^n b^2n | n >= 0}

import java.util.Scanner;
import java.util.Stack;

public class PDA_4 {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<Character>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String!!!!");
        String a = sc.nextLine();
        int count = a.length();
        for (int i = 0; i < count; i++){
            switch (a.charAt(i)){
                case 'a':
                    s.push('X');
                    break;
                case 'b':
                    if (a.charAt(i+=1) == 'b'){
                        s.pop();
                    }
                    else {
                        System.out.println("One b is missing");
                        return;
                    }
                    break;
                default:
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
