package stackqueue;

import java.util.Stack;

class _03_04_QueueViaStacks {

    private Stack stack1 = new Stack<Integer>();
    private Stack stack2 = new Stack<Integer>();

    void enqueue(int val) {
        stack1.push(val);
    }

    int size() {
        return stack1.size() + stack2.size();
    }

    int peek() {
        if(stack2.isEmpty()) {
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return (int) stack2.peek();
    }

    int dequeue() {
        if(stack2.isEmpty()) {
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return (int) stack2.pop();


    }


}
