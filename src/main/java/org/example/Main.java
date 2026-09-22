package org.example;

import org.example.model.Ceiling;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
         Ceiling ceiling = new Ceiling(250, PaintColor.WHITE);

        ceiling.create();

        System.out.println("Height: " + ceiling.getHeight());
        System.out.println("Color: " + ceiling.getColor());
    }
}