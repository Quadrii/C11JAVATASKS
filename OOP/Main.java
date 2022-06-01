package OOP;

public class Main {
    public static void main(String[] args) {
        Native olamide = new Native();
        olamide.eat();
        String whatIDo = olamide.learnJava();
        System.out.println(whatIDo);

        Facilitator chibob = new Facilitator();
        chibob.talk();
        String whatFacilitatorDo = chibob.teachJava();
        System.out.println(whatFacilitatorDo);
    }
}
