// L = {a^2n b^n | n >= 1}

import java.util.Scanner;
import java.util.Stack;

public class PDA_3 {
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
                    if (a.charAt(i+=1) == 'a'){
                        s.push('X');
                    }
                    else {
                        System.out.println("One a is missing");
                        return;
                    }
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
        if (s.isEmpty()) {
            System.out.println("Valid String");
        }
        else {
            System.out.println("Invalid String");
        }
    }
}
