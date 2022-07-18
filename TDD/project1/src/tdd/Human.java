package tdd;

public class Human {
    private Walk walk = new ElephantWalk();

    public Human(Walk walk) {
        this.walk = walk;
    }

    public void setWalk(Walk walk) {
        this.walk = walk;
    }

    public void walk(){
        walk.walk();
    }
}
