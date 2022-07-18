package OOP.Diary;

public class Entry {
    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    private String text;

    private final int id;

    public int getId() {
        return id;
    }

    private static int  diaryCount = 0;
    public Entry(String title, String text){
        this.text = text;
        this.title = title;
        this.id = diaryCount;
    }


    @Override
    public String toString() {
        return String.format("""
                Title: %s
                Text: %s
                ID: %d
                """, getTitle(), getText(), getId());
    }
}
