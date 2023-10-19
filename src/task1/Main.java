package task1;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);


        for (int item : stack) {
            System.out.println(item);
        }
    }

}
