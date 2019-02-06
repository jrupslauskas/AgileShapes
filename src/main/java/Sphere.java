public class Sphere extends Shape {

    // Fields
    public float radius;

    // Public Methods
    @Override
    public float surfaceArea() {
        return 4 * (float)Math.PI * (float)Math.pow(this.radius, 2);
    }

    @Override
    public float volume() {
        return (float)4.0 / (float)3.0 * (float)Math.PI * (float)Math.pow(this.radius, 3);
    }

    @Override
    public void render() {
        if (this.radius > 0) {
            System.out.println("Our sphere has a radius of " + this.radius + ". After calculations, the volume of the " +
                    "sphere is " + this.volume() + " and the surface area is " + this.surfaceArea());
        } else {
            System.out.println("Invalid info was entered for the sphere");
        }
    }

    // Getters and Setters
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    // Constructor
    public Sphere(float radius) {
        this.radius = radius;
    }
}
