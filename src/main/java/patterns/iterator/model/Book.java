package patterns.iterator.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public class Book {
    private final String title;
    private final String author;
}
