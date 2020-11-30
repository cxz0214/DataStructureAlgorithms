package MyCode.Week_02.Stack;

public class Test {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>(20);
        for(int i = 0; i < 20; i++){
            stack.push(i);
        }
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
