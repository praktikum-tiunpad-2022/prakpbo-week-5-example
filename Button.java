public abstract class Button {
    int x, y, length, width;
    

    public Button() {
        this.x = 0;
        this.y = 0;
        this.length = 10;
        this.width = 10;
    }

    public abstract void behavior();
}
