import java.util.Stack;
public class parenthesis{
    public static void main(String[] args){
        parenthesis obj = new parenthesis();
        String s = "([])";
        System.out.println(obj.isValid(s));


    }

    public boolean isValid(String a){
        Stack<Character> stack = new Stack<>();
        for(char ch : a.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else{
                if(ch == ')'){
                    if(stack.isEmpty() ||stack.pop() != '('){
                        return false;}
                }
                if(ch == '}'){
                    if( stack.isEmpty() ||stack.pop() != '{'){
                        return false;}
                }
                if(ch == ']'){
                    if(stack.isEmpty() ||stack.pop()!='['){
                        return false;}
                }
            }
            
        }
        return stack.isEmpty();
    }
}