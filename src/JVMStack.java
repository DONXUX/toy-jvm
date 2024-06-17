import java.util.Stack;

public class JVMStack {
    private Stack<Object> stack;

    public JVMStack() {
        this.stack = new Stack<>();
    }

    public void push(Object value) {
        stack.push(value);
    }

    public Object pop() {
        return stack.pop();
    }
}
