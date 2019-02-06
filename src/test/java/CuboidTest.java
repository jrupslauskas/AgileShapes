import static org.junit.Assert.*;

public class CuboidTest {

    Cuboid cube = new Cuboid(1.0f,1.0f, 1.0f);

    @org.junit.Test
    public void surfaceArea() {
        assertEquals(6.0f, cube.surfaceArea(), 0.0);
    }

    @org.junit.Test
    public void volume() {
        assertEquals(1.0f, cube.volume(), 0);
    }
}