package tdd;
import java.util.Objects;

public class ArrayList implements List {
    private boolean isEmpty = true;
    private int size;
    private int capacity = 5;
    private String[] elements = new String[capacity];

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(String item) {
        int count=0;
        for (String str : elements){
            if (str != null){
                count++;
            }
        }
        if (count == capacity-1){
            int oldCap = capacity;
            capacity *= 2;
            String[] freshArray = new String[capacity];
            for (int i=0; i<oldCap;i++){
                freshArray[i]=elements[i];
            }
            elements=freshArray;
        }
        elements[size++] = item;
    }

    @Override
    public void remove(String item) {
        for (int i = 0; i < elements.length; i++) {
            if (!Objects.equals(elements[i], item)) {
//                for (int j = 0; j < elements.length; j++) {
//
//                }
                elements[i] = elements[++i];
//                set(i, elements[++i]);
                break;
            }
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }


    public boolean contain(String item) {
       for (int i =0; i< elements.length; i++){
           if (Objects.equals(elements[i], item)){
               return true;
           }
       }
       return false;
    }

    @Override
    public String get(int index) {
        return elements[index];
    }

    @Override
    public void set(int index, String item) {

    }

//    @Override
//    public void set(int index, String item) {
//
//    }

    @Override
    public int capacity() {
        return capacity;
    }

}