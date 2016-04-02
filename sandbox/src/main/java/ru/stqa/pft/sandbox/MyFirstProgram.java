package ru.stqa.pft.sandbox;

public class MyFirstProgram {;

  public static void main(String[] args) {

    Point p1 = new Point(0, 1);
    Point p2 = new Point(10, 1);
    System.out.println("Расстояние между точками (" + p1.x + ", " + p1.y + ") и (" + p2.x + ", " + p2.y + ") = " + p1.distance(p2));

    Point p3 = new Point(0, -5);
    System.out.println("Расстояние между точками (" + p1.x + ", " + p1.y + ") и (" + p3.x + ", " + p3.y + ") = " + p1.distance(p3));

//    System.out.println("Расстояние между точками на плоскости (" + p1.x + ", " + p1.y + ") и (" + p2.x + ", " + p2.y + ") = " + distance(p1, p2));

//    hello("world");
//    hello("user");
//    hello("Tanya");
//
//    Square s = new Square(5);
//    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());
//
//    Rectangle r = new Rectangle(8, 4);
//    System.out.println("Площадь прямоугольника со сторонами " + r.a + " х " + r.b + " = " + r.area());
  }

  public static void hello(String somebody){
    System.out.println("Hello, " + somebody + "!");
  }

  public static double distance(Point p1, Point p2){
    return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
  }
}