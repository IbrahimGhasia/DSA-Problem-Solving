import java.util.Stack;

public class BaseballGame {

    public static int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();

        for (String s : operations) {
            if (s.equals("+")) {
                stack.push(stack.peek() + stack.elementAt(stack.size() - 2));
            } else if (s.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (s.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(s));
            }
        }

        int result = 0;

        for (int i : stack) {
            result += i;
        }

        return result;
    }

    public static void main(String[] args) {
        String[] op = { "5", "2", "C", "D", "+" };
        int res = calPoints(op);
        System.out.println(res);
    }
}