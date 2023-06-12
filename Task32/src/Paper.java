public class Paper {

    private int height;

    private int width;
    private Figure[] figures;
    private int count;

    public Paper(int height, int width) {
        this.height = height;
        this.width = width;
        this.figures = new Figure[10];
        this.count = 0;
    }

    public double area() {
        double result = 0;
        for (int i = 0; i < count; i++) {
            result = result + figures[i].area();
        }

        return result;
    }

    public void add(Figure figure) {
        double areaOfAddedFigures = figure.area() + area();

        if (areaOfAddedFigures <= (height * width)) {
            this.figures[count] = figure;
            count++;

            System.out.println("Фигура добавлена, осталось " +
                    (height * width - areaOfAddedFigures) + " свободного места");
        } else {
            System.out.println("Места для добавления фигуры недостаточно.");
        }

    }

}
