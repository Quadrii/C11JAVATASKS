package tdd;

import java.util.Objects;

public class Stack {
    ArrayList stack = new ArrayList();
    public boolean isEmpty() {
        return true;
    }

    public void push(String item) {
        stack.add(item);
    }

    public int size() {
        return stack.size();
    }

    public void pop(String item) {
        stack.remove(item);
    }


    public String peek() {
        String element = stack.get(stack.size()-1);
        return element;
    }
}
