package tdd;

public interface List {
    boolean isEmpty();

    void add(String item);

    void remove(String item);

    int size();

    boolean contain(String item);

    String get(int index);

    void set(int index, String item);

    int capacity();
}
