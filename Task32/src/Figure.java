public class Figure {
    protected int x;
    protected int y;
    protected static double square;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y, int z) {
        this.x = x;
        this.y = y;
    }

    public void print() {

        System.out.println("Фигура(" + x + "," + y + ")");
    }

    public double square() {

        return 0;
    }

    public int getX() {

        return x;
    }

    public int getY() {

        return y;
    }

}
