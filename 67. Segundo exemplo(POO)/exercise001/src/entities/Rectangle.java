package entities;

public class Rectangle {
    public double width;
    public double height;

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return (width * 2) + (height * 2);
    }

    public double calculateDiagonal() {
        width = Math.pow(width, 2);
        height = Math.pow(height, 2);
        double sum = width + height;
        return Math.sqrt(sum);
    }

}
