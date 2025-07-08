package creationalPatterns.builder;

import java.time.LocalDateTime;

public class CPUBuilder implements ComputerComponentBuilder<CPUBuilder> {
    private String brand;
    private String model;
    private LocalDateTime productionDate;
    private Double prize;
    private Double clock;
    private Double cache;

    @Override
    public CPUBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public CPUBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CPUBuilder setProductionDate(LocalDateTime productionDate) {
        this.productionDate = productionDate;
        return this;
    }

    @Override
    public CPUBuilder setPrize(Double prize) {
        this.prize = prize;
        return this;
    }

    public CPUBuilder setClock(Double clock) {
        this.clock = clock;
        return this;
    }

    public CPUBuilder setCache(Double cache) {
        this.cache = cache;
        return this;
    }

    public CPU build() {
        return new CPU(brand, model, productionDate, prize, clock, cache);
    }
}
