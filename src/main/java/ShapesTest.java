public class ShapesTest {

    public static void main(String[] args) {

        Dialog messageBox = new MessageBox();
        ShapeFactory shapeFactory = new ShapeFactory(messageBox);

        Cuboid cuboid = shapeFactory.makeCuboid(1, 2, 4);
        Cylinder cylinder = shapeFactory.makeCylinder(1,5);
        Sphere sphere = shapeFactory.makeSphere(1);

        cuboid.render();
        cylinder.render();
        sphere.render();

    }

}
