public class ShapesTest {

    public static void main(String[] args) {

        Dialog messageBox = new MessageBox();

        Cuboid cuboid = new Cuboid(messageBox,1, 2, 4);
        Cylinder cylinder = new Cylinder(messageBox,1, 5);
        Sphere sphere = new Sphere(messageBox,3);

        cuboid.render();
        cylinder.render();
        sphere.render();

    }

}
