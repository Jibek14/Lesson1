package org.step;
public class Main {
    public static void main(String[] args) {
       /*
       Булекбаева Жибек*/
        Pen penA=new Pen();
        penA.height=20;
        penA.color="green";
        Pen penB=new Pen();
        penB.height=20;
       penB.color="green";
        Pen penC=new Pen();
        System.out.println("эти два карандаши одинаковые?");
        System.out.println(penA.equals(penB));
        System.out.println("какие у них хэш-коды?");
        System.out.println(penA.hashCode());
        System.out.println(penB.hashCode());
        System.out.println(penC);
        String name="Jibek";
        int age=21;
        Employee Jibek=new Employee(name,age);
        Jibek.Smile();
        String goodName="pучка";
        double goodPrice=20.70;
        int goodCount=23;
        Employee.Stationery good=Jibek.new Stationery(goodName,goodPrice,goodCount);
        good.Show();
 good.GetSum();
Flat myKrgFlat= new Flat(121.3,"red",122,6);
myKrgFlat.display();



    }
}