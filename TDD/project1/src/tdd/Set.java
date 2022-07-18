package tdd;

import java.util.Objects;

public class Set {
    ArrayList set = new ArrayList();
    private String item;

    public void add(String item){
        if (!set.contain(item)){
            set.add(item);
        }
    }


    public boolean isEmpty() {
        return set.isEmpty();
    }

    public boolean contain(String element) {
       return set.contain(element);
    }

    public int size() {
        return set.size();
    }
}
