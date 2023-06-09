package chapter_12_exception_handling_and_text_io;

import utils.chapter_12.FacultyMember;
import utils.chapter_12.Rank;
import utils.chapter_12.SalaryProcessor;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.DoubleStream;

/**
 * *12.25 (Process large dataset) A university posts its employees’ salaries at http://liveexample.pearsoncmg.com/data/Salary.txt. Each line in the file consists of
 * a faculty member’s first name, last name, rank, and salary (see Programming
 * Exercise 12.24). Write a program to display the total salary for assistant professors, associate professors, full professors, and faculty, respectively, and display
 * the average salary for assistant professors, associate professors, full professors,
 * and faculty, respectively.
 *
 * @author Alex Golub
 * @since 10/06/2023 7:06 PM
 */
class Ex25 {

    private static final String URL_PATH = "http://liveexample.pearsoncmg.com/data/Salary.txt";

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL(URL_PATH);
        List<FacultyMember> facultyMemberList = new ArrayList<>();
        try (Scanner urlReader = new Scanner(url.openStream())) {
            while (urlReader.hasNextLine()) {
                String[] tokens = urlReader.nextLine().split("\\p{javaWhitespace}+");
                String firstName = tokens[0];
                String lastName = tokens[1];
                Rank rank = Rank.valueOf(tokens[2].toUpperCase());
                double salary = Double.parseDouble(tokens[3]);

                FacultyMember facultyMember = new FacultyMember(firstName, lastName, rank, salary);
                facultyMemberList.add(facultyMember);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        SalaryProcessor salaryProcessor = new SalaryProcessor();
        salaryProcessor.processSalaryData(facultyMemberList);

        DecimalFormat decimalFormat = new DecimalFormat("#.####");

        System.out.println("Total salaries:");
        System.out.println("    Assistant: " + decimalFormat.format(salaryProcessor.getTotalSalary(Rank.ASSISTANT)));
        System.out.println("    Associate: " + decimalFormat.format(salaryProcessor.getTotalSalary(Rank.ASSOCIATE)));
        System.out.println("    Full: " + decimalFormat.format(salaryProcessor.getTotalSalary(Rank.FULL)));
        System.out.println("    Faculty: " + decimalFormat.format(salaryProcessor.getFacultyTotal()));

        System.out.println("Average salaries:");
        System.out.println("    Assistant: " + salaryProcessor.getAverageSalary(Rank.ASSISTANT));
        System.out.println("    Associate: " + salaryProcessor.getAverageSalary(Rank.ASSOCIATE));
        System.out.println("    Full: " + salaryProcessor.getAverageSalary(Rank.FULL));
        System.out.println("    Faculty: " + salaryProcessor.getFacultyAverage());
    }

}
