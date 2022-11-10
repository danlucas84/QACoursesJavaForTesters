package pl.qa.courses.sandbox;

public class FirstProgram {

  public static void main(String[] args) {
    String somebody = "Dan";
    System.out.println("Hello " + somebody);
    System.out.println("Hello Word");
    System.out.println("Hello " + "World");
    hello();
    hello2();
    hello3("Daniel");
    hello3("Joanna");
    hello3("Danny");
    area(10);
    area(3,6);

    double l = 7;
    System.out.println("pole kwadratu dla bok = " + l + " wynosi " + area(l));

    double a = 3;
    double b = 6;
    System.out.println("pole prostokątu dla bok a = " + a  + " i " + "bok b = " + b + " wynosi " + area(a,b));

    double bok = 5;
    //double bokB = 5;
    double PoleKwadratu = bok * bok;

    System.out.println("pole kwadratu dla bok = " + bok + " wynosi " + PoleKwadratu);
  }

  public static void hello() {
    System.out.println("Hello World using function hello");
  }

  public static void hello2() {

    String somebody = "world2";
    System.out.println("Hello" + " " + somebody + " " + "using function hello2");
  }

  public static void hello3(String item) {


    System.out.println("Hello" + " " + item + " " + "using function hello3 with parameter");

  }

  public static double area(double lx) {
    return lx * lx;
  }

  public static double area(double a, double b) {
    return a * b;
  }
}



