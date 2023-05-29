package utils.chapter_11;

import java.time.LocalDateTime;

/**
 * **11.8 (New Account class)
 *
 * @author Alex Golub
 * @since 02/06/2023 2:41 PM
 */
public record Transaction(
        LocalDateTime dateTime,
        Type type,
        Double amount,
        Double balance,
        String description
) {
}
