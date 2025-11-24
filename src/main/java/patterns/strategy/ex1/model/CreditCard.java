package patterns.strategy.ex1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class CreditCard {

    @Setter
    @Getter
    private int amount;
    private String number;
    private String date;
    private String cvv;

}