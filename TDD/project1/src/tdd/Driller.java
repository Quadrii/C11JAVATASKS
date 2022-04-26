package tdd;

public class Driller {
    private int copies;

    public void drillerPrice(int numberOfCopies){
        if (numberOfCopies <= 4) {
            copies = numberOfCopies * 2_000;
        } else if (numberOfCopies > 4 && numberOfCopies <= 9) {
            copies = numberOfCopies * 1_800;
        } else if (numberOfCopies > 9 && numberOfCopies <= 29) {
            copies = numberOfCopies * 1600;
        } else if (numberOfCopies > 29 && numberOfCopies <= 49) {
            copies = numberOfCopies * 1500;
        } else if (numberOfCopies > 49 && numberOfCopies <= 99) {
            copies = numberOfCopies * 1300;
        } else if (numberOfCopies > 99 && numberOfCopies <= 199) {
            copies = numberOfCopies * 1200;
        } else if (numberOfCopies > 199 && numberOfCopies <= 499) {
            copies = numberOfCopies * 1100;
        } else if (numberOfCopies > 499) {
            copies = numberOfCopies * 70000;
        }
    }

    public int getCopies() {
        return copies;
    }

}
