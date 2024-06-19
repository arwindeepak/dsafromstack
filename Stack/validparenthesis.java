package Stack;

import java.util.Stack;

import java.util.Scanner;

public class validparenthesis {
    public static boolean isValid(String str) {
        char[] chars = str.toCharArray();
        Stack<Character> stack1 = new Stack<>();
        for (char elem : chars) {
            if (elem == '[' || elem == '{' || elem == '(') {
                stack1.push(elem);
                continue;
            }else if (stack1.empty()) {
                return false;
            }
            char top = stack1.pop();
              
        if (top=='('&& elem!=')') {
            return false;
        }else if (top=='['&& elem!=']') {
            return false;
        } else if (top == '{' && elem != '}') {
            return false;
        }
        }
      
        return (stack1.empty()==true);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the string of parenthhes you want to check is valid or not");
        String str = input.nextLine();
        boolean isValid = isValid(str);
        if (isValid==true) {
            System.out.println("valid parenthesis");
        } else {
            System.out.println("not a valid parenthesis");
        }
       

    }
}
