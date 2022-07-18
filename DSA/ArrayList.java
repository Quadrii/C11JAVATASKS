package DSA;

public class ArrayList implements List{
    private boolean isEmpty = true;
    private int size;
    private String[] elements = new String[5];
    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void add(String item) {
        elements[size++] = item;
    }

    @Override
    public void remove(String item) {
        --size;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String get(int index){
        return elements[index];
    }
}
