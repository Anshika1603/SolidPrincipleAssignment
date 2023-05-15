package com.knoldus.question3;

/**
 * The Shape class represents a generic shape with width and height.
 */
public class Shape {
private double width;
private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea(){
        return height*width;
    }
}
