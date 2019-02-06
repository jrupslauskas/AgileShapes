import org.junit.Test;

import static org.junit.Assert.*;

public class CylinderTest {

    Cylinder cylinder1 = new Cylinder(1,3);
    Cylinder cylinder2 = new Cylinder(2,5);
    Cylinder cylinder3 = new Cylinder(1,10);

    // Surface Area Tests
    @Test
    public void getSurfaceArea1() {
        assertEquals(25.13f, cylinder1.surfaceArea(), 0.01);
    }

    @Test
    public void getSurfaceArea2() {
        assertEquals(87.96f, cylinder2.surfaceArea(), 0.01);
    }

    @Test
    public void getSurfaceArea3() {
        assertEquals(69.11f, cylinder3.surfaceArea(), 0.01);
    }

    // Volume Tests
    @Test
    public void getVolume1() {
        assertEquals(9.42f, cylinder1.volume(), 0.01);
    }

    @Test
    public void getVolume2() {
        assertEquals(62.83f, cylinder2.volume(), 0.01);
    }

    @Test
    public void getVolume3() {
        assertEquals(31.41f, cylinder3.volume(), 0.01);
    }

    // Getters Tests
    @Test
    public void getRadius() {
        assertEquals(1, cylinder1.getRadius(), 0);
    }

    @Test
    public void getHeight() {
        assertEquals(3, cylinder1.getHeight(), 0);
    }
}