package Stack;

import java.util.Stack;

public class reversestack {
    public static void reverse(Stack<Integer> s) {
        Stack<Integer> aux = new Stack<>();
        while (!s.empty()) {
            aux.push(s.pop());
        }
        s = aux;
        System.out.println(s);

    }
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(2);
        stack1.push(3);
        stack1.push(5);
        System.out.println("stack before reversal is " + stack1);
        System.out.println("stack after reversal is ");
        reverse(stack1);
    }
}
