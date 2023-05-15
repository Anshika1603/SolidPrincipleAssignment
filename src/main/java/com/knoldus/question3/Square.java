package com.knoldus.question3;

public class Square extends Shape{

    /**
     * Sets the width of the square.
     * Since a square has equal sides, setting the width also updates the height.
     *
     * @param width The width value to set for the square.
     */
    @Override
    public void setWidth(double width){
        super.setWidth(width);
        super.setHeight(width);
    }

    /**
     * Sets the height of the square.
     * Since a square has equal sides, setting the height also updates the width.
     *
     * @param height The height value to set for the square.
     */
    @Override
    public void setHeight(double height){
        super.setWidth(height);
        super.setHeight(height);
    }
}
