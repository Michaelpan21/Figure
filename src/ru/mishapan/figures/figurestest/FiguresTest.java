package ru.mishapan.figures.figurestest;

import ru.mishapan.figures.*;

import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FiguresTest {

    public static void main(String[] args) {
        /**
         * @param id номер геометрической фигуры
         * @param splitLines[1] тип геометрической фигуры
         * @param linesFromFile строка из Листа list, содержащего считанные строки из файла figures.txt
         * @param splitLines массив строк, полученный путем разбиения строки linesFromFile по пробелам
         */
        try {

            Path path = Paths.get("figures.txt").toAbsolutePath().normalize();

            List<String> list = Files.readAllLines(path, StandardCharsets.UTF_8);
            if (list.size() == 0) throw new Exception("File is empty !");

            Map<Integer, Shape> figuresMap = new HashMap<>();

            for (String linesFromFile : list) {

                String[] splitLines = linesFromFile.split(" ");

                Integer id = Integer.parseInt(splitLines[0]);

                switch (splitLines[1].toLowerCase()) {

                    case "triangle":

                        figuresMap.put(id, new Triangle(id, splitLines[1], Integer.parseInt(splitLines[2]),
                                Integer.parseInt(splitLines[3])));
                        break;

                    case "rectangle":

                        figuresMap.put(id, new Rectangle(id, splitLines[1], Integer.parseInt(splitLines[2]),
                                Integer.parseInt(splitLines[3])));
                        break;

                    case "circle":

                        figuresMap.put(id, new Circle(id, splitLines[1], Integer.parseInt(splitLines[2])));
                        break;

                    default:
                        System.out.println("Found Unknown Shape: " + splitLines[1]);
                        break;
                }

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
