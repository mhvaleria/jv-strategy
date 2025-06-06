package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Black Friday" :
                return new BlackFridayDiscountService();
            case "Birthday" :
                return new BirthdayDiscountService();
            case "New Year" :
                return new NewYearDiscountService();
            case "Default" :
            default:
                return new DefaultDiscountService();
        }
    }
}
