package org.step;

import org.step.interfaces.BeginnerRecruitment;

import java.util.Scanner;

/*
task-2
Напишите приложение,
позволяющее вести учет канцелярских товаров на рабочем месте сотрудника.
Определите полную стоимость канцтоваров у определенного сотрудника.*/
public class Employee implements BeginnerRecruitment {
    private static String name;
private final int age;
 Employee(String name, int age) {
     Employee.name = name;
     this.age=age;
 }

    @Override
    public void Smile() {
        System.out.println("smile at work");
    }

    public class Stationery{
   String name;
 double price;
 int count;
    public  Stationery(String name,double price,int count){
        this.name=name;
        this.price=price;
        this.count=count;
    }
   void Show(){
       System.out.println("У работника: "+Employee.name+"("+age+" лет)"+"\r\n"+" количество: "+count+"\t"+name+"-ей\\-ек\\-ев\\-ов\r\nпо цене: "+price+
               "настроение должно быть ппзитивным:"+positiveThoughts+"\n у работника обязательно должна быть ручка минимальная длиня в сантимерах"+penCentimeter+"\nдолжен работать с позитивным настроем\n"+work);
   }
   double GetSum(){
       System.out.println("итого: "+price*count);
       return price*count;
   }
}
}