public class Cuboid extends Shape {

    // Fields
    public float width;
    public float height;
    public float depth;

    // Public Methods
    @Override
    public float surfaceArea() {
        return 2*(this.depth * this.height + this.depth * this.width + this.width * this.height);
    }

    @Override
    public float volume() {
        return this.depth * this.width * this.height;
    }

    @Override
    public void render() {
        if (this.width > 0 && this.height > 0 && this.depth > 0) {
            System.out.println("Our cuboid has a height of " + this.height + ", a depth of " + this.depth + ", and a width " +
                    "of " + this.width + ". After calculations, the volume of the cuboid is " + this.volume() + " " +
                    "and the surface area is " + this.surfaceArea());
        } else {
            System.out.println("Invalid info was entered for the cuboid");
        }
    }

    // Getters and Setters
    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    // Constructor
    public Cuboid(float width, float height, float depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}
