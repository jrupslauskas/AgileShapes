public class ShapesTest {

    public static void main(String[] args) {

        Dialog messageBox = new MessageBox();
        ShapeFactory shapeFactory = new ShapeFactory(messageBox);

        Cuboid cuboid = shapeFactory.buildCuboid(1, 2, 4);
        Cylinder cylinder = shapeFactory.buildCylinder(1,5);
        Sphere sphere = shapeFactory.buildSphere(1);

        cuboid.render();
        cylinder.render();
        sphere.render();

    }

}
