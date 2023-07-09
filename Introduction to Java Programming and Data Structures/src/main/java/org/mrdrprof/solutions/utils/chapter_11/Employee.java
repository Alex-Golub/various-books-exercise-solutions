package org.mrdrprof.solutions.utils.chapter_11;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Alex Golub
 * @since 02/06/2023 1:44 PM
 */
@Getter
@Setter
@ToString(callSuper = true)
public class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress,
                    String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }
}
