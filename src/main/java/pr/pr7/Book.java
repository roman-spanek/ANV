package pr.pr7;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Book {
    private String name;

    @Override
    public String toString() {
        return "Book{name='" + name + "'}";
    }
}
