// {a^n b^n | n >= 1}


import java.util.Stack;
import java.util.Scanner;
public class Auto_2 {

    public static void main(String[] args){
        Stack<Character> s = new Stack<Character>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String!!!!");
        String a = sc.nextLine();
        if (a.length() != 0){
            for (int i = 0; i < a.length(); i++){
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
            if (s.isEmpty()) {
                System.out.println("validddd String");
            } else {
                System.out.println("String is invalid. Please enter a valid string.");
            }
        }
        else {
            System.out.println("String is empty. Please enter a valid string.");
            return;
        }
    }
}