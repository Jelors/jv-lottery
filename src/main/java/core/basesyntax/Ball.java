package core.basesyntax;

public class Ball {
    private String color;
    private int number;



    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", number=" + number +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
