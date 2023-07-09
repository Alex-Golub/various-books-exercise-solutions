package org.mrdrprof.solutions.chapter_12_exception_handling_and_text_io;

import org.mrdrprof.solutions.utils.chapter_12.Rank;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * *12.24 (Create large dataset) Create a data file with 1,000 lines. Each line in the file
 * consists of a faculty member’s first name, last name, rank, and salary. The
 * faculty member’s first name and last name for the ith line are FirstNamei and
 * LastNamei. The rank is randomly generated as assistant, associate, and full.
 * The salary is randomly generated as a number with two digits after the decimal
 * point. The salary for an assistant professor should be in the range from 50,000
 * to 80,000, for associate professor from 60,000 to 110,000, and for full professor
 * from 75,000 to 130,000. Save the file in Salary.txt. Here are some sample data:
 * FirstName1 LastName1 assistant 60055.95
 * FirstName2 LastName2 associate 81112.45
 * . . .
 * FirstName1000 LastName1000 full 92255.21
 *
 * @author Alex Golub
 * @since 10/06/2023 6:28 PM
 */
class Ex24 {

    private static final String TEMPLATE = "FirstName%d LastName%d %s %.2f";
    private static final Integer LINES = 1000;

    public static void main(String[] args) {
        List<String> data = generateData();
        writeDataIntoFile(data, "Salary.txt");
    }

    private static void writeDataIntoFile(List<String> data, String file) {
        try (PrintWriter printWriter = new PrintWriter(file)) {
            for (String line : data) {
                printWriter.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<String> generateData() {
        List<String> data = new ArrayList<>(LINES);
        ThreadLocalRandom randomGenerator = ThreadLocalRandom.current();

        for (int i = 1; i <= LINES; i++) {
            Rank rank = Rank.values()[randomGenerator.nextInt(Rank.values().length)];
            double randomSalary = randomGenerator.nextDouble(rank.getLowerBoundRange(), rank.getUpperBoundRange());

            data.add(TEMPLATE.formatted(i, i, rank.toString().toLowerCase(), randomSalary));
        }

        return data;
    }
}
