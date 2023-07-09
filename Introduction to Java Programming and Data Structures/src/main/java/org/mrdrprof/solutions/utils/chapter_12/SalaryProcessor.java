package org.mrdrprof.solutions.utils.chapter_12;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.stream.DoubleStream;

/**
 * @author Alex Golub
 * @since 10/06/2023 7:42 PM
 */
public class SalaryProcessor {

    private final Map<Rank, Integer> countMap;
    private final Map<Rank, Double> totalSalaryMap;

    public SalaryProcessor() {
        countMap = new EnumMap<>(Rank.class);
        totalSalaryMap = new EnumMap<>(Rank.class);
    }

    public void processSalaryData(List<FacultyMember> facultyMemberList) {
        for (FacultyMember facultyMember : facultyMemberList) {
            Rank rank = facultyMember.getRank();
            Double salary = facultyMember.getSalary();

            countMap.put(rank, countMap.getOrDefault(rank, 0) + 1);
            totalSalaryMap.put(rank, totalSalaryMap.getOrDefault(rank, 0.0) + salary);
        }
    }

    public double getAverageSalary(Rank rank) {
        int count = countMap.getOrDefault(rank, 0);
        double totalSalary = totalSalaryMap.getOrDefault(rank, 0.0);
        return totalSalary / count;
    }

    public double getTotalSalary(Rank rank) {
        return totalSalaryMap.getOrDefault(rank, 0.0);
    }

    public double getFacultyTotal() {
        return DoubleStream.of(getTotalSalary(Rank.ASSISTANT),
                               getTotalSalary(Rank.ASSOCIATE),
                               getTotalSalary(Rank.FULL))
                           .sum();
    }

    public double getFacultyAverage() {
        return getFacultyTotal() / (countMap.get(Rank.ASSISTANT) + countMap.get(Rank.ASSOCIATE) + countMap.get(Rank.FULL));
    }
}
