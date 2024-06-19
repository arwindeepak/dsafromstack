package queue;

import java.util.Stack;

public class queueusingstack {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int data) {
        stack1.push(data);
    };

    public void dequeue() {
        if (stack1.empty() && stack2.empty()) {
            System.out.println("queue is empty");
            return;
        }
        while (!stack1.empty()) {
            int element = stack1.pop();
            stack2.push(element);
        }
        int fifo = stack2.pop();
        System.out.println(fifo);
    }
    public static void main(String[] args) {
        queueusingstack q = new queueusingstack();
       

        q.dequeue();
    }
}
