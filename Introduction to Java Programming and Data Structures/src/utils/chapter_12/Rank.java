package utils.chapter_12;

/**
 * @author Alex Golub
 * @since 10/06/2023 7:03 PM
 */
public enum Rank {
    ASSISTANT(new double[] { 50_000, 80_000 }),
    ASSOCIATE(new double[] { 60_000, 110_000 }),
    FULL(new double[] { 75_000, 130_000 });

    private final double[] salaryRange;

    Rank(double[] salaryRange) {
        this.salaryRange = salaryRange;
    }

    public double getLowerBoundRange() {
        return salaryRange[0];
    }

    public double getUpperBoundRange() {
        return salaryRange[1];
    }
}
