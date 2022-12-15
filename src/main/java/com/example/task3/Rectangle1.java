package com.example.task3;

import javafx.scene.canvas.GraphicsContext;

public class Rectangle1 extends Shape{
    @Override
    double area() {
        return 0;
    }

    public Rectangle1(double x, double y) {
        super(x, y);
    }
    @Override
    void draw(GraphicsContext gr) {
        gr.setFill(color);
        gr.setLineWidth(10);
        gr.strokeRect(x, y, 150, 150);
    }

    @Override
    public String toString() {
        return "Rectangle color is " + super.color +  "and area is : " + area();   }

}
