package utils.chapter_11;

import lombok.Getter;
import lombok.ToString;
import utils.exceptions.IllegalTriangleException;

import java.util.Scanner;

@Getter
@ToString(callSuper = true)
public class Triangle extends GeometricObject {

    private double a;
    private double b;
    private double c;

    public Triangle() {
        a = 1.0;
        b = 1.0;
        c = 1.0;
    }

    public Triangle(double a, double b, double c) {
        this("None", false, a, b, c);
    }

    public Triangle(String color, boolean filled, double a, double b, double c) {
        super(color, filled);
        isValidTriangle(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private void isValidTriangle(double a, double b, double c) {
        boolean isValid = true;
        String errorMessage = "Invalid triangle: %.2f + %.2f <= %.2f";
        
        if (a + b <= c) {
            errorMessage = errorMessage.formatted(a, b, c);
            isValid = false;
        } else if (a + c <= b) {
            errorMessage = errorMessage.formatted(a, c, b);
            isValid = false;
        } else if (b + c <= a) {
            errorMessage = errorMessage.formatted(b, c, a);
            isValid = false;
        }

        if (!isValid) {
            throw new IllegalTriangleException(errorMessage);
        }
    }

    public static void main(String[] args) throws IllegalTriangleException {
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
