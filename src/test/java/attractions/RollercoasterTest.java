package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    Visitor visitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(18, 1.9, 10.0);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasDefaultPrize(){
        assertEquals(8.40, rollerCoaster.defaultPrize(), 0);
    }

    @Test
    public void hasPriceFor(){
        assertEquals(8.40, rollerCoaster.priceFor(visitor), 0);
    }

    @Test
    public void canAllowedTo(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void canGetReview(){
        assertEquals("Review: Blue Ridge Rating: 10", rollerCoaster.review());
    }
}

