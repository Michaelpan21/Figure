package ru.mishapan.figures;

/**
 * @version 1.01 2019-09-02
 * @author Mikhail Pankov
 */
public class Triangle extends Shape{

    /**
     * @param id номер геометрической фигуры
     * @param type тип геометрической фигуры
     * @param firstCathet первый катет
     * @param secondCathet второй катет
            */

    private int firstCathet;
    private int secondCathet;

    public Triangle(int id, String type, int firstCathet, int secondCathet){
        setId(id);
        setType(type);
        setFirstCathet(firstCathet);
        setSecondCathet(secondCathet);
    }

    public void setFirstCathet(int firstCathet) {
        this.firstCathet = firstCathet;
    }

    public void setSecondCathet(int secondCathet) {
        this.secondCathet = secondCathet;
    }

    public int getFirstCathet() {
        return firstCathet;
    }

    public int getSecondCathet() {
        return secondCathet;
    }

    @Override
    public String toString() {
        return "Id = " + getId() + ", Type = " + getType() + ", Cathet = " + getFirstCathet() +
                ", Cathet = " + getSecondCathet();
    }

    @Override
    public double getSquare() {
        return (double) (getFirstCathet() * getSecondCathet()) / 2;
    }
}
