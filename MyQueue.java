import java.util.Stack;
class MyQueue {
    private Stack<Integer> first;
    private Stack<Integer> second;
    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }
    
    public void push(int x) {
        first.push(x);
    }
    
    public int pop() {
        if(second.isEmpty()){
            while(!first.isEmpty()){
                second.push(first.pop());
            }
        }
        return second.pop();
    }
    
    public int peek() {
        if (second.isEmpty()) {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
        }
        return second.peek();
    }
    
    public boolean empty() {
        return first.isEmpty() && second.isEmpty();
    }
}

