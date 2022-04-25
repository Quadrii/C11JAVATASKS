package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrillerTest {
    @Test
    public void utmeDrillertOneToFour(){
        Driller theDriller = new Driller();
        theDriller.drillerPrice(3);
        assertEquals(6000, theDriller.getCopies());
    }

    @Test
    public void utmeDrillerFiveToNine(){
        Driller theDriller = new Driller();
        theDriller.drillerPrice(7);
        assertEquals(12600, theDriller.getCopies());
    }

    @Test
    public void utmeDrillerTenToTwentyNine(){
        Driller theDriller = new Driller();
        theDriller.drillerPrice(20);
        assertEquals(32000, theDriller.getCopies());
    }

    @Test
    public void utmeDrillerThirtyToFortyNine(){
        Driller theDriller = new Driller();
        theDriller.drillerPrice(40);
        assertEquals(60000, theDriller.getCopies());
    }

    @Test
    public void utmeDrillerFivetyToNinetyNine(){
        Driller theDriller = new Driller();
        theDriller.drillerPrice(60);
        assertEquals(78000, theDriller.getCopies());
    }

    @Test
    public void utmeDrillerHundredToOneNinetyNine(){
        Driller theDriller = new Driller();
        theDriller.drillerPrice(160);
        assertEquals(192000, theDriller.getCopies());
    }

    @Test
    public void utmeDrillerTwoHundredToFounhundredNinetyNine(){
        Driller theDriller = new Driller();
        theDriller.drillerPrice(350);
        assertEquals(385000, theDriller.getCopies());
    }

    @Test
    public void utmeDrillerFiveHundredAndAbove(){
        Driller theDriller = new Driller();
        theDriller.drillerPrice(550);
        assertEquals(38500000, theDriller.getCopies());
    }
}
