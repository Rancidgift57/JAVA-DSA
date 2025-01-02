import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class StackExample{
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.pop());

        Queue<Integer> qu = new LinkedList<>(); 
        qu.add(3);
        qu.add(4);
        qu.add(5);
        qu.add(6);
        System.out.println(qu.peek());
    }
}
