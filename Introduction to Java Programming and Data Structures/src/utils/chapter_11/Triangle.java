package utils.chapter_11;

import lombok.Getter;
import lombok.ToString;

import java.util.Scanner;

@Getter
@ToString(callSuper = true)
class Triangle extends GeometricObject {

    private double a;
    private double b;
    private double c;

    public Triangle() {
        this(1.0, 1.0, 1.0);
    }

    public Triangle(double a, double b, double c) {
        this("", false, a, b, c);
    }

    public Triangle(String color, boolean filled, double a, double b, double c) {
        super(color, filled);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        try (Scanner console = new Scanner(System.in)) {
            System.out.print("Enter three sides of the triangle: ");
            double a = Double.parseDouble(console.nextLine());
            double b = Double.parseDouble(console.nextLine());
            double c = Double.parseDouble(console.nextLine());
            System.out.print("Enter color: ");
            String color = console.nextLine();
            System.out.print("Enter true or false to indicate whether it is filled: ");
            boolean filled = console.nextBoolean();
            Triangle triangle = new Triangle(color, filled, a, b, c);
            System.out.println("Area: " + triangle.getArea());
            System.out.println("Perimeter: " + triangle.getPerimeter());
            System.out.println("Color: " + triangle.getColor());
            System.out.println("Is filled: " + triangle.isFilled());
            System.out.println("triangle = " + triangle);
        }
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        return getA() + getB() + getC();
    }
}
