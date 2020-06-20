package org.step;
//task-1
/*Разработайте спецификацию и создайте класс Ручка (Pen).
Определите в этом классе методы equals(), hashCode() и toString().*/
public class Pen {
    String color;
    int height;
public boolean equals(Pen pen){
    return this.color.equals(pen.color) && this.height == pen.height;
}
public int hashCode(){
    int result=color.hashCode();
    result=31*result+height;
    return result;
}
public String toString(){
return color!=null?getClass().getName():"this is каРДаш";
}
}