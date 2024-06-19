package Stack;

import java.util.Stack;

public class addbottom {
    public static void addlast(Stack<Integer> s, int data) {
        // while (!s.empty()) {
        //     s.pop();
        // }
if (s.empty()) {
    s.push(data);
    return;
}
      int top=  s.pop();
      addlast(s, data);
      s.push(top);
        //s.push(s);
        System.out.println(s);
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(2);
        s1.push(4);
        s1.push(5);
        System.out.println("stack after adding element to the end of the stack is ");
        addlast(s1,10);
    }
}
