
import java.util.Stack;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int num[]={9,6,5,9,4,6,1};
        int k=3;
        Stack<Integer> stack=new Stack();
        for(int n:num){
            while(!stack.isEmpty()&&k!=0&&stack.peek()<n){
                stack.pop();
                k--;
            }
            stack.push(n);
        }
        System.out.print(stack);
    }
}