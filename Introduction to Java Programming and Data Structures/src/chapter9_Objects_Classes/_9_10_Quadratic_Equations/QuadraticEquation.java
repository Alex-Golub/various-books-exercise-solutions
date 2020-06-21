package chapter9_Objects_Classes._9_10_Quadratic_Equations;

/**
 * Created by ag on 24-May-20 5:02 PM
 */
class QuadraticEquation {

    private int a;
    private int b;
    private int c;

    QuadraticEquation(int a, int b, int c) {
        if (a == 0) {
            // if a == 0 equation is linear
            throw new IllegalArgumentException(String.format("Coefficient a = %d is zero - Not Quadratic equation", a));
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(getB(), 2.0) - 4 * getA() * getC();
    }

    public double getRoot1() {
        int compare = Double.compare(getDiscriminant(), 0.0D);

        if (noRoots(compare)) return 0.00D;
        if (hasOneRootOnly(compare)) return -getB() / 2.0 * getA();

        // discriminant is positive - Two roots get 1st
        return (-getB() + Math.sqrt(getDiscriminant())) / 2.0 * getA();
    }

    public double getRoot2() {
        int compare = Double.compare(getDiscriminant(), 0.0D);

        if (noRoots(compare)) return 0.00D;
        if (hasOneRootOnly(compare)) return -getB() / 2.0 * getA();

        // discriminant is positive - Two roots get 2nd
        return (-getB() - Math.sqrt(getDiscriminant())) / 2.0 * getA();
    }

    private boolean hasOneRootOnly(int compare) {
        return compare == 0;
    }

    private boolean noRoots(int compare) {
        return compare < 0;
    }

    @Override
    public String toString() {
        return String.format("%sx^2%sx%s",
                getA(),
                (getB() >= 0 ? "+" : "") + getB(),
                (getC() >= 0 ? "+" : "") + getC());
    }
}
