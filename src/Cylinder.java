public class Cylinder extends Shape {

    // Fields
    public float radius;
    public float height;

    // Public Methods
    @Override
    public float surfaceArea() {
        return 2 * (float)Math.PI * this.radius * this.height + 2 * (float)Math.PI * (float)Math.pow(this.radius, 2);
    }

    @Override
    public float volume() {
        return (float)Math.PI * (float)Math.pow(this.radius, 2) * this.height;
    }

    @Override
    public void render() {
        if (this.radius > 0 && this.height > 0) {
            System.out.println("Our cylinder has a radius of " + this.radius + " and a height of " + this.height + ". " +
                    "After calculations, the volume of the cylinder is " + this.volume() + " and the surface area is " +
                    this.surfaceArea());
        } else {
            System.out.println("Invalid info was entered for the cylinder");
        }
    }

    // Getters and Setters
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    // Constructor
    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

}
