class Pen {
    String color;
    String type;
    public void printColor() {
        System.out.println("The color of this Pen is " + this.color);
        System.out.println("the type of this pen is " + this.type);
    }
}
class Student{
    String name;
    int age;

    public void info(){
        System.out.println("the name of the student is "+ this.name);
        System.out.println("the age of the student is "+ this.age);

    }
}
public class index {
    public static void main(String args[]) {
        Student s1=new Student();
        s1.name="Ankit saini";
        s1.age=22;
        Pen p4 = new Pen();
        p4.color = "grey";
        p4.type = "ballpoint";

        Pen p1 = new Pen();
        p1.color = "blue";
        p1.type = "gel";

        Pen p2 = new Pen();
        p2.color = "black";
        p2.type = "ballpoint";

        Pen p3 = new Pen();
        p3.color = "red";
        p3.type = "gel";

        p1.printColor();
        p2.printColor();
        p3.printColor();
        p4.printColor();
        s1.info();
    }
}
