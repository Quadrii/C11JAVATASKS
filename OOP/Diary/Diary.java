package OOP.Diary;

import java.util.ArrayList;
import java.util.Objects;

public class Diary {
    private String userName;
    private String password;
    ArrayList<Entry> entries = new ArrayList<>();

    public Diary(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
    public ArrayList<Entry> getAllEntries(){
        return entries;
    }

    public void createDiary(Entry note) {
        for (Entry entry : entries) {
            if (entry.getText().equals(note.getText())){
                throw new DiaryExceptions("A Note already exists with name title");
            }
        }
        entries.add(note);
    }

    public Entry getEntry(int id) {
        Entry foundDiary = findEntry(id);
        return foundDiary;
    }

    private Entry findEntry(int id) {
        int entryIndex = -1;
        for (int i = 0; i < entries.size(); i++) {
            if (Objects.equals(entries.get(i).getId(), id)) {
                entryIndex = i;
                break;
            }
        }
        if (entryIndex == -1) {
            throw new IllegalArgumentException("Entry with id" + id + "not found");
        }
        return entries.get(entryIndex);
    }
}
