import static org.junit.Assert.*;

public class CuboidTest {

    Cuboid cube1 = new Cuboid(1.0f,1.0f, 1.0f);
    Cuboid cube2 = new Cuboid(2.0f, 2.0f, 2.0f);
    Cuboid cube3 = new Cuboid(3.0f,3.0f,3.0f);

    // Surface Area Tests
    @org.junit.Test
    public void surfaceArea1() {
        assertEquals(6.0f, cube1.surfaceArea(), 0.0);
    }

    @org.junit.Test
    public void surfaceArea2() {
        assertEquals(24.0f, cube2.surfaceArea(), 0.0);
    }

    @org.junit.Test
    public void surfaceArea3() {
        assertEquals(54.0f, cube3.surfaceArea(), 0.0);
    }

    // Volume Tests
    @org.junit.Test
    public void volume1() {
        assertEquals(1.0f, cube1.volume(), 0);
    }

    @org.junit.Test
    public void volume2() {
        assertEquals(8.0f, cube2.volume(), 0);
    }

    @org.junit.Test
    public void volume3() {
        assertEquals(27.0f, cube3.volume(), 0);
    }

    // Getters Tests
    @org.junit.Test
    public void getDepth() {
        assertEquals(1.0f, cube1.getDepth(), 0);
    }

    @org.junit.Test
    public void getWidth() {
        assertEquals(1.0f, cube1.getWidth(), 0);
    }

    @org.junit.Test
    public void getHeight() {
        assertEquals(1.0f, cube1.getHeight(), 0);
    }

}