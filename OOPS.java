// class Pen{
//     String color; // blue, red
//     String type;  // ballpoint, gel
//     public void write() {
//         System.out.println("writing something");
//     }
//     public void printColor() {
//         System.out.println(this.color);
//     }}
//
// class Student {
//     String name;
//     int age;
//     public void printInfo() {
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
// }
// public class OOPS {
//     public static void main(String[] args) {
//         Student S1 = new Student();
//         S1.name = "Aryan";
//         S1.age = 21;
//         S1.printInfo();
//         // Pen pen1 = new Pen();
//         // pen1.color = "blue";
//         // pen1.type = "gel";
//         // Pen pen2 = new Pen();
//         // pen2.color = "blue";
//         // pen2.type = "ballpoint";
//         // pen1.printColor();
//         // pen2.printColor();
//         // pen1.write(); // Output: writing something
//     }
// }

// function overloding Polimorphisam
// class Student{
//     String name;
//     int age;
//     public void printInfo(String name){
//         System.out.println(name);
//     }
//     public void printInfo(int age){
//         System.out.println(age);
//     }
//     public void printInfo(String name,int age){
//         System.out.println(name+" "+age);
//     }
// }
//   public class OPPS{
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name ="Anjali";
//         s1.age =20;
//         s1.printInfo(s1.name,s1.age);
//     }
//   }
//Inheritance 
// class Shape{
//     public void area(){
//         System.out.println("display area");
//     }
// }
// class Triangle extends Shape{
//     public void area(int l,int h){
//         System.out.println(1/2*l*h);
//     }
// }
// class Circle extends Shape{
//     public void area(int r){
//         System.out.println(3.14*r*r);
//     }
// }
// public class OOPS{
//     public static void main(String[] args) {
//         Shape s = new Shape();
//         s.area(); // General shape area
//         Triangle t = new Triangle();
//         t.area(); // Inherited method from Shape
//         t.area(10, 5); // Triangle-specific method
//         Circle c = new Circle();
//         c.area(); // Inherited method from Shape
//         c.area(7); // Circle-specific method
//     }
// }
//Abstraction//
// abstract class Animal{
//     abstract void walk();
//     public void eat(){
//      System.out.println("Animal eats");
//     }
// }
//  class Horse extends Animal{
//     public void walk(){
//         System.out.println("walk on 4 lags");
//     }
//  }
//  class Chicken extends Animal {
//     public void walk(){
//         System.out.println("walk on 2 lags");
//     }
//  }
//  public class OOPS{
//     public static void main(String[] args) {
//         Horse horse = new Horse();
//         Chicken chicken = new Chicken();
//         chicken.walk();
//         horse.walk();
//         horse.eat();
//     }
//  }
// Chain of constructor: First base class constructor is called, then subclass constructor.
// abstract class Animal {
//     abstract void walk();
//     Animal() {
//         System.out.println("You are creating an animal");
//     }
//     public void eat() {
//         System.out.println("Animal eats");
//     }
// }
// class Horse extends Animal {
//     Horse() {
//         System.out.println("You are creating a horse");
//     }
//     public void walk() {
//         System.out.println("Walks on 4 legs");
//     }
// }
// class Chicken extends Animal {
//     public void walk() {
//         System.out.println("Walks on 2 legs");
//     }
// }
// public class OOPS {
//     public static void main(String[] args) {
//         Horse horse = new Horse();
//     }
// }
//interface
// interface Animal{
//     int eye = 2 ;
//     void walk();
// }
// interface Herbivore{
// }
// class Horse implements Animal, Herbivore{
//      public void walk(){
//         System.out.println("walk on 4 lags");
//      }
// }
//  public class OOPS{
//     public static void main(String[] args) {
//         Horse horse =new Horse();
//         horse.walk();
//     }
//  }
//Static
class Student {

    String name;
    static String collage;  // Correct 'static' keyword
}

public class OOPS {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student.collage = "Global"; // Set the static field properly
        student1.name = "happy";
        System.out.println(Student.collage); // Recommended way to access static field
    }
}
