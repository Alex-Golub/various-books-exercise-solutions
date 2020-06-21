package chapter9_Objects_Classes._9_13_Location;

/**
 * Created by ag on 28-May-20 1:45 PM
 */
class Location {

    private int row;
    private int column;
    private double maxValue;

    int getRow() {
        return row;
    }

    int getColumn() {
        return column;
    }

    double getMaxValue() {
        return maxValue;
    }

    private void setRow(int row) {
        this.row = row;
    }

    private void setColumn(int column) {
        this.column = column;
    }

    private void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }

    static Location locateLargest(double[][] a) {
        if (a == null)
            throw new IllegalArgumentException("Array is null");

        Location result = new Location();
        result.setMaxValue(Double.MIN_VALUE);

        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                double currValue = a[row][col];

                if (Double.compare(currValue, result.getMaxValue()) > 0) {
                    result.setMaxValue(currValue);
                    result.setRow(row);
                    result.setColumn(col);
                }
            }
        }

        return result;
    }

    @Override
    public String toString() {
        return String.format("Largest element is %.2f at location (%d, %d)",
                getMaxValue(), getRow() + 1, getColumn() + 1);
    }
}
