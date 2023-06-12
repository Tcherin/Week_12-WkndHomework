import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING727);
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(120, plane.getPlaneType().getCapacity());
    }

    @Test
    public void planeHasTotalWeight(){
        assertEquals(1200, plane.getPlaneType().getTotalWeight());
    }

}
