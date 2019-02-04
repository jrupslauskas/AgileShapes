public class ShapesTest {

    public static void main(String[] args) {

        Cuboid cuboid = new Cuboid(1, 2, 4);
        Cylinder cylinder = new Cylinder(1, 5);
        Sphere sphere = new Sphere(3);

        cuboid.render();
        cylinder.render();
        sphere.render();

    }

}
