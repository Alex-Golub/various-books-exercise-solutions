package utils.chapter_11;

import lombok.*;

/**
 * @author Alex Golub
 * @since 02/06/2023 1:42 PM
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;
}
