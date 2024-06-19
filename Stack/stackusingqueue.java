package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class stackusingqueue {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
      
    public void push(int data) {
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }
        q1.offer(data);
        while (!q2.isEmpty()) {
            q1.offer(q2.poll());
        }
    }

    public void peek1() {
        if (q1.isEmpty()) {
            System.out.println("stack is empty");
        }
       System.out.println(q1.peek()); 
    }
       public void pop(){
        // if (q1.isEmpty()) {
        //     System.out.println("stack is empty");
        // }
      q1.poll();
    }

    public static void main(String[] args) {
        stackusingqueue s1 = new stackusingqueue();
        s1.push(8);
       

        s1.peek1();

        s1.pop();
        s1.peek1();
       
    }
}
