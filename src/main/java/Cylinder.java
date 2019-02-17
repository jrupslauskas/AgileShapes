public class Cylinder extends Shape implements Renderer {

    // Properties
    public float radius;
    public float height;

    // Constructor
    public Cylinder(Dialog messageBox, float radius, float height) {
        super(messageBox);
        this.radius = radius;
        this.height = height;
    }

    // Public Methods
    @Override
    public float surfaceArea() {
        return 2 * (float)Math.PI * this.radius * this.height + 2 * (float)Math.PI * (float)Math.pow(this.radius, 2);
    }

    @Override
    public float volume() {
        return (float)Math.PI * (float)Math.pow(this.radius, 2) * this.height;
    }

//

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



    public void render() {

           messageBox.show("Our cylinder has a radius of " + this.radius + " and a height of " + this.height + ". " +
                   "After calculations, the volume of the cylinder is " + this.volume() + " and the surface area is " +
                   this.surfaceArea() + ".", "Cylinder");

    }

}
