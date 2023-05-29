package utils.chapter_11;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Alex Golub
 * @since 02/06/2023 1:45 PM
 */
@Getter
@Setter
@ToString(callSuper = true)
public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress,
                 String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

}
