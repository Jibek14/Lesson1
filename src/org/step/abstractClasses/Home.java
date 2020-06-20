package org.step.abstractClasses;

public class Home {
    private final double height;
    private final String roofColor;
    private final int area;
    public Home(double height,String roofColor,int area){
        this.area=area;
        this.height=height;
        this.roofColor=roofColor;
    }
    public void display(){
        System.out.println("height: "+height+"\n"+"color of roof\n"+"color of roof"+roofColor+"\narea:"+area);
    }
}