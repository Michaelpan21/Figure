package ru.mishapan.figures;

public class Rectangle extends Shape {

    /**
     * @param id номер геометрической фигуры
     * @param type тип геометрической фигуры
     * @param wight ширина прямоугольника
     * @param height высота прямоугольника
     */

    private int wight;
    private int height;

    public Rectangle(int id, String type, int wight, int height) {

        setId(id);
        setType(type);
        setWight(wight);
        setHeight(height);
    }

    private void setWight(int wight) {
        this.wight = wight;
    }

    private void setHeight(int height) {
        this.height = height;
    }

    public int getWight() {
        return wight;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Id = " + getId() + ", Type = " + getType() + ", Wight = " + getWight() + ", Height = " + getHeight();
    }

    @Override
    public double getSquare() {
        return (double) getWight() * getHeight();
    }
}
