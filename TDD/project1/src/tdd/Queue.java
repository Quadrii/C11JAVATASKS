package tdd;

public class Queue {
    ArrayList queue = new ArrayList();
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void add(String item) {
        queue.add(item);
    }

    public void remove(String item) {
        queue.remove(item);
    }

    public int size() {
        return queue.size();
    }

    public String peek() {
        String element = queue.get(0);
        return element;
    }
}
