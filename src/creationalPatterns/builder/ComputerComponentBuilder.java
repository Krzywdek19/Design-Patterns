package creationalPatterns.builder;

import java.time.LocalDateTime;

public interface ComputerComponentBuilder<T extends ComputerComponentBuilder<T>> {
    ComputerComponentBuilder<T> setBrand(String brand);
    ComputerComponentBuilder<T> setModel(String model);
    ComputerComponentBuilder<T> setProductionDate(LocalDateTime productionDate);
    ComputerComponentBuilder<T> setPrize(Double prize);
}
