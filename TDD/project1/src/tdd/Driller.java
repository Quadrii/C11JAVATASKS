package tdd;

public class Driller {
    private int copies;

    public void drillerPrice(int copyAmount){
        if (copyAmount <= 4) {
            copies = copyAmount * 2_000;
        } else if (copyAmount > 4 && copyAmount <= 9) {
            copies = copyAmount * 1_800;
        } else if (copyAmount > 9 && copyAmount <= 29) {
            copies = copyAmount * 1600;
        } else if (copyAmount > 29 && copyAmount <= 49) {
            copies = copyAmount * 1500;
        } else if (copyAmount > 49 && copyAmount <= 99) {
            copies = copyAmount * 1300;
        } else if (copyAmount > 99 && copyAmount <= 199) {
            copies = copyAmount * 1200;
        } else if (copyAmount > 199 && copyAmount <= 499) {
            copies = copyAmount * 1100;
        } else if (copyAmount > 499) {
            copies = copyAmount * 70000;
        }
    }

    public int getCopies() {
        return copies;
    }

}
