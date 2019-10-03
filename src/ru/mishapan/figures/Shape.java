package ru.mishapan.figures;

public abstract class Shape {

    /**
     * @param id номер геометрической фигуры
     * @param type тип геометрической фигуры
     */

    private int id;
    private String type;

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public abstract double getSquare();
}
