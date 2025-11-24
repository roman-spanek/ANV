package patterns.mediator.refactored;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
public abstract class Component {
    protected Mediator mediator;
}
