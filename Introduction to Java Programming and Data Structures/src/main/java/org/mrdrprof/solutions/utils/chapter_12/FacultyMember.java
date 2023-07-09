package org.mrdrprof.solutions.utils.chapter_12;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * *12.24 (Create large dataset)
 * *12.25 (Process large dataset)
 *
 * @author Alex Golub
 * @since 10/06/2023 7:02 PM
 */
@AllArgsConstructor
public class FacultyMember {

    private String firstName;
    private String lastName;
    @Getter
    private Rank rank;
    @Getter
    private Double salary;
}
