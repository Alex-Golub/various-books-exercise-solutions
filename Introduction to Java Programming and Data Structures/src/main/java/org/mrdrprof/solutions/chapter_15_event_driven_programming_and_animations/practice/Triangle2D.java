package org.mrdrprof.solutions.chapter_15_event_driven_programming_and_animations.practice;

import lombok.Getter;

import java.awt.geom.Line2D;

@Getter
class Triangle2D {

    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public Triangle2D(double x1, double y1,
                      double x2, double y2,
                      double x3, double y3) {
        this.p1 = new MyPoint(x1, y1);
        this.p2 = new MyPoint(x2, y2);
        this.p3 = new MyPoint(x3, y3);
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Triangle2D() {
        this(new MyPoint(0, 0), new MyPoint(1, 1), new MyPoint(2, 5));
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }


    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    public double getPerimeter() {

        double s1 = p1.distance(p2);
        double s2 = p2.distance(p3);
        double s3 = p3.distance(p1);
        return s1 + s2 + s3;

    }

    public double getArea() {

        double s1 = p1.distance(p2);
        double s2 = p2.distance(p3);
        double s3 = p3.distance(p1);
        double s = (s1 + s2 + s3) / 2.0;

        return Math.pow(s * (s - s1) * (s - s2) * (s - s3), 0.5);

    }

    public static double calcArea(MyPoint p1, MyPoint p2, MyPoint p3) {
        double s1 = p1.distance(p2);
        double s2 = p2.distance(p3);
        double s3 = p3.distance(p1);
        double s = (s1 + s2 + s3) / 2.0;

        return Math.pow(s * (s - s1) * (s - s2) * (s - s3), 0.5);

    }


    public boolean contains(MyPoint p) {
//        double area1 = calcArea(p, p1, p2);
//        double area2 = calcArea(p, p2, p3);
//        double area3 = calcArea(p, p3, p1);
//        double area = Math.round((area1 + area2 + area3) * 100) / 100;
//        double triangleArea =  Math.round(getArea() * 100) / 100;
//        (triangleArea == area)


        return contains(p.x(), p.y());
    }

    public boolean contains(double x, double y) {

        // Get max X & Y
        double maxX = getMax(p1.getX(), p2.getX(), p3.getX());
        double maxY = getMax(p1.getY(), p2.getY(), p3.getY());

        // Get min X & Y
        double minX = getMin(p1.getX(), p2.getX(), p3.getX());
        double minY = getMin(p1.getY(), p2.getY(), p3.getY());

        // Outside the bounding rectangle of the triangle
        if (x < minX || x > maxX || y < minY || y > maxY) return false;

        // Check if point is the border of the triangle
        MyPoint p = new MyPoint(x, y);
        boolean side1 = p.onTheLineSegment(p1, p2);
        boolean side2 = p.onTheLineSegment(p1, p3);
        boolean side3 = p.onTheLineSegment(p2, p3);
        return side1 || side2 || side3;

    }

    private double getMax(double... n) {
        double max = n[0];
        for (int i = 1; i < n.length; i++) {
            if (max < n[i]) {
                max = n[i];
            }
        }
        return max;
    }

    private double getMin(double... n) {
        double min = n[0];
        for (int i = 1; i < n.length; i++) {
            if (min > n[i]) {
                min = n[i];
            }
        }
        return min;
    }

    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {

        double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        return position <= 0.0000000001 && ((x0 <= x2 && x2 <= x1) || (x0 >= x2 && x2 >= x1));
    }

    public boolean contains(Triangle2D t) {

        return contains(t.p1) && contains(t.p2) && contains(t.p3);
    }

    public boolean overlaps(Triangle2D t) {

        MyPoint[] pt1 = getTrianglePoints();
        MyPoint[] pt2 = t.getTrianglePoints();

        // check is triangle side intersect
        for (int i = 0; i < 3; i++) {
            int maxI = (i + 1) % 3; // max indexes

            for (int j = 0; j < 3; j++) {
                int maxJ = (j + 1) % 3;
                Line2D line1 = new Line2D.Double(pt2[i].getX(), pt2[i].getY(), pt2[maxI].getX(), pt2[maxI].getY());
                Line2D line2 = new Line2D.Double(pt1[i].getX(), pt1[i].getY(), pt1[maxJ].getX(), pt1[maxJ].getY());
                if (line1.intersectsLine(line2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private MyPoint[] getTrianglePoints() {

        MyPoint[] points = new MyPoint[3];
        points[0] = p1;
        points[1] = p2;
        points[2] = p3;

        return points;
    }

    public boolean isValid() {
        double s1 = p1.distance(p2);
        double s2 = p2.distance(p3);
        double s3 = p3.distance(p1);
        return ((s1 + s2 > s3) &&
                (s1 + s3 > s2) &&
                (s3 + s2 > s1));
    }

    public static double area(double side1, double side2, double side3) {

        double s = (side1 + side2 + side3) / 2.0;

        return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
    }

}
