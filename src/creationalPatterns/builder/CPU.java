package creationalPatterns.builder;

import java.time.LocalDateTime;

public class CPU extends ComputerComponent {
    private Double clock;
    private Double cache;

    public CPU(String brand, String model, LocalDateTime productionDate, Double prize, Double clock, Double cache) {
        super(brand, model, productionDate, prize);
        this.clock = clock;
        this.cache = cache;
    }

    public Double getCache() {
        return cache;
    }

    public void setCache(Double cache) {
        this.cache = cache;
    }

    public Double getClock() {
        return clock;
    }

    public void setClock(Double clock) {
        this.clock = clock;
    }
}
