public class Cylinder extends Figure{
    private int height;
    private int radius;

    public Cylinder(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void print() {
        System.out.println("Цилиндр(" +
                x + "," + y + "," +
                ", радиус - " + radius + ")");
    }

    public double square() {
        return Math.PI * radius * radius;
    }
}
