package OOP.Diary;

import java.util.Scanner;

public class DiaryMain {
    static String answer = " ";
    static Diary diary;
    static int count = 0;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String userName = "Tolu'sDiary";
        String password = "234568";
        diary = new Diary(userName, password);
        int sentinel = 0;
        while (sentinel != -1){
            System.out.println("Hello "  + " " + userName.toUpperCase() + ", " + " how are you doing today");
            System.out.println("Enter 1 to create a note");
            System.out.println("Enter 2 view note");
            System.out.println("Enter 3 delete a note");
            System.out.println("Enter 0 to quit");
            int response = input.nextInt();
            switch (response){
                case 1:
                    createDiary();
                    break;
                case 2:
                    System.out.println("Enter note ID");
                    int entryId = input.nextInt();
                    diary.getEntry(entryId);
                    break;
                case 0:
                    sentinel = -1;
            }
        }
    }
    static void createDiary(){
        System.out.println("Enter diary title: ");
        String title = input.next();
        System.out.println("Enter text: ");
        String text= input.next();
        Entry entry = new Entry(title,text);
        diary.createDiary(entry);
        System.out.println("Entry created");
    }

}
