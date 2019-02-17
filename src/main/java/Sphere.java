public class Sphere extends Shape implements Renderer {

    // Properties
    public float radius;

    // Constructor
    public Sphere(Dialog messageBox, float radius) {
        super(messageBox);
        this.radius = radius;
    }

    // Public Methods
    @Override
    public float surfaceArea() {
        return 4 * (float)Math.PI * (float)Math.pow(this.radius, 2);
    }

    @Override
    public float volume() {
        return (float)4.0 / (float)3.0 * (float)Math.PI * (float)Math.pow(this.radius, 3);
    }


    // Getters and Setters
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }


    public void render() {
        messageBox.show("Our sphere has a radius of " + this.radius + ". After calculations, the volume of the " +
                "sphere is " + this.volume() + " and the surface area is " + this.surfaceArea() + ".", "Sphere");
    }

}
