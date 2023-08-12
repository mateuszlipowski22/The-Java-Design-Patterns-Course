package com.udemy.section13.challenge;

abstract class Shape {

    protected Color color;

    protected int border;

    public Shape(Color color, int border) {
        this.color = color;
        this.border = border;
    }



    abstract void drawShapes();
    public void modifyBorders(int times){
        this.border=this.border*times;
        System.out.println("Now we are changing the border length "+times);
    };

}
