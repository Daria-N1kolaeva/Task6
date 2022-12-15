package com.example.task3;

import javafx.scene.canvas.GraphicsContext;

public class Triangle1 extends Shape {

    @Override
    double area() {
        return 0;
    }

    public Triangle1(double x, double y) {
        super(x, y);
    }
    @Override
    void draw(GraphicsContext gr) {
        gr.setLineWidth(2);
        gr.setFill(color);
        // gr.strokeOval(50,50,50,50);
        gr.strokePolygon(new double[]{x, x-30, x+30, 40, 35},
                new double[]{y-100, y, y},
                3
        );
    }

    @Override
    public String toString() {
        return "RoundRect color is " + super.color +  "and area is : " + area();   }


}
