import org.junit.Test;

import static org.junit.Assert.*;

public class SphereTest {

    Sphere sphere1 = new Sphere(1.0f);
    Sphere sphere2 = new Sphere(2.0f);
    Sphere sphere3 = new Sphere(3.0f);


    // Surface Area Tests
    @Test
    public void getSurfaceArea1() {
        assertEquals(12.56f, sphere1.surfaceArea(), 0.01);
    }

    @Test
    public void getSurfaceArea2() {
        assertEquals(50.26f, sphere2.surfaceArea(), 0.01);
    }

    @Test
    public void getSurfaceAre3() {
        assertEquals(113.09f, sphere3.surfaceArea(), 0.01);
    }

    // Volume Tests
    @Test
    public void getVolume1() {
        assertEquals(4.18f, sphere1.volume(), 0.01);
    }

    @Test
    public void getVolume2() {
        assertEquals(33.51f, sphere2.volume(), 0.01);
    }

    @Test
    public void getVolume3() {
        assertEquals(113.09f, sphere3.volume(), 0.01);
    }

    // Getters Tests
    @Test
    public void getRadius() {
        assertEquals(1.0f, sphere1.getRadius(), 0);
    }
}