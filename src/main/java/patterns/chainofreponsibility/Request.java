package patterns.chainofreponsibility;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Request {
    private final String user;
    private final String role;
}

