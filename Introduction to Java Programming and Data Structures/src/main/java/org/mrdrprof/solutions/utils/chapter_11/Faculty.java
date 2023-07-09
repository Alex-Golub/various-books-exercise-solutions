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
public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress,
                   String office, double salary, MyDate dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }
}
