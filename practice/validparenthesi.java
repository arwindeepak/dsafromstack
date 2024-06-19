package practice;

import java.util.Scanner;
import java.util.Stack;

public class validparenthesi {
    public static boolean valid(String str) {
        char chars[] = str.toCharArray();
        Stack<Character> stack1 = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            char elem = chars[i];
            if (elem == '[' || elem == '{' || elem == '(') {
                stack1.push(elem);
                continue;//loop gets incremented by one after the continue statement and iterates next for i=1;
            }
           else if (stack1.empty()) {
                return false;
            }
            char top = stack1.pop();
            if (top == '[' && elem != ']') {
                return false;
            }
            if (top == '{' && elem != '}') {
                return false;
            }else if (top=='('&& elem!=')') {
                return false;
            }
        }
        return (stack1.empty()==true);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the string of the parenthesis ");
        String str = input.nextLine();
        boolean valid = valid(str);
        if (valid==true) {
            System.out.println("the parenthesis you entered was valid");
        } else {
            System.out.println("not valid");
        }
    }
}
