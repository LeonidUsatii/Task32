public class Parallelepiped extends Figure {
    private int sideA;
    private int sideB;

    private int sideC;

    public Parallelepiped(int x, int y, int sideA, int sideB, int sideC) {
        super(x, y);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void print() {
        System.out.println("Параллелепипед(" +
                x + "," + y + ","  +
                ", сторонаА - " + sideA + ", сторонаВ - " + sideB + ", сторонаС - " + sideC + ")");
    }

    public double area() {
        return 2 * (sideA * sideB + sideB * sideC + sideA * sideC);
    }
}
