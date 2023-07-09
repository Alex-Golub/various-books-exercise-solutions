package org.mrdrprof.solutions.utils.chapter_11;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Alex Golub
 * @since 02/06/2023 1:43 PM
 */
@Getter
@Setter
@ToString(callSuper = true)
public class Student extends Person {
    private static final String CLASS_STATUS = "Freshman";
    private String classStatus;

    public Student(String name, String address, String phoneNumber, String emailAddress, String classStatus) {
        super(name, address, phoneNumber, emailAddress);
        this.classStatus = classStatus;
    }
}
