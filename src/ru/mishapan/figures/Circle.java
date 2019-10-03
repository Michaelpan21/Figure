package ru.mishapan.figures;

/**
 * @author Mikhail Pankov
 * @version 1.01 2019-09-02
 */
public class Circle extends Shape {

    /**
     * @param id номер геометрической фигуры
     * @param type тип геометрической фигуры
     * @param radius радиус круга
     */

    private int radius;

    public Circle(int id, String type, int radius) {
        setId(id);
        setType(type);
        setRadius(radius);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Id = " + getId() + ", Type = " + getType() + ", Radius = " + getRadius();
    }

    @Override
    public double getSquare() {
        return Math.pow(getRadius(), 2) * Math.PI;
    }
}

