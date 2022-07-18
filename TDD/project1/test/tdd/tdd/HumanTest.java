package tdd;

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class HumanTest {
    @Test
    public void diTest(){
//        ElephantWalk elephantWalk = new ElephantWalk();
        Walk catwalk = new CatWalk();
        Human jummie = new Human(catwalk);
        jummie.setWalk(catwalk);
        jummie.walk();
    }
    @Test
    public void elomwalk(){
        Walk elepahntwalk = new ElephantWalk();
        Human elomJoseph = new Human(elepahntwalk);
        elomJoseph.setWalk(elepahntwalk);
        elomJoseph.walk();
    }
}
