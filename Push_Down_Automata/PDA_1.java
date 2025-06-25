//{a^n b^n | n >= 0}


import java.util.Scanner;
import java.util.Stack;
public class PDA_1 {

    public static void main(String[] args){
        Stack<Character> s = new Stack<Character>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String!!!!");
        String a = sc.nextLine();
        int count = a.length();
        int i = 0;
        for (i = 0; i < count-1; i++){
            if (a.charAt(i) == 'b' && a.charAt(i+1) == 'a'){
                System.out.println("Invalid string");
                return;
            }
        }
        for (i = 0; i < count; i++){
            if (a.charAt(i) == 'a')
            s.push('X');
            else if (a.charAt(i) == 'b')
            s.pop();
            else {
                System.out.println("Invalid character in the string. Only 'a' and 'b' are allowed.");
                return;
            }
            System.out.println(s);
        }
        System.out.println("Final Stack: " + s);
        if (s.isEmpty()) {
            System.out.println("validddd String");
        } else {
            System.out.println("Invalidddd String");
        }
    }
}