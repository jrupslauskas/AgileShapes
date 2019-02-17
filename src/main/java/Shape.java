public abstract class Shape {

    public Dialog messageBox;

    protected Dialog getMessageBox(){
        return this.messageBox;
    }

    private void setMessageBox(Dialog messageBox) {
        this.messageBox = messageBox;
    }

    public Shape(Dialog messageBox) {
        this.messageBox = messageBox;
    }

    // Abstract methods
    public abstract float surfaceArea();
    public abstract float volume();

}
