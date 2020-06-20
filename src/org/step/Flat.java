package org.step;
import org.step.abstractClasses.Home;

public class Flat extends Home {
private final int roomCount;
    public Flat(double height, String roofColor, int area,int roomCount) {
        super(height, roofColor, area);
        this.roomCount=roomCount;
    }
    @Override
   public void display(){
     System.out.println("the apartment has"+roomCount+"rooms");
   }
}