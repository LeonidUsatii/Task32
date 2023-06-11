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

    public void add(Figure figure) {
        Figure.areaOfAddedFigures += figure.square();

        if (Figure.areaOfAddedFigures <= (height * width)) {
            this.figures[count] = figure;
            count++;

            System.out.println("Фигура добавлена, осталось " +
                    (height * width - Figure.areaOfAddedFigures) + " свободного места");
        } else {
            System.out.println("Места для добавления фигуры недостаточно.");
        }

    }

}
