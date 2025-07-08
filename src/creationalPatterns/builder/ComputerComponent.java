package creationalPatterns.builder;

import java.time.LocalDateTime;

public abstract class ComputerComponent {
    private String brand;
    private String model;
    private LocalDateTime productionDate;
    private Double prize;

    public ComputerComponent(String brand, String model, LocalDateTime productionDate, Double prize) {
        this.brand = brand;
        this.model = model;
        this.productionDate = productionDate;
        this.prize = prize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDateTime getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDateTime productionDate) {
        this.productionDate = productionDate;
    }

    public Double getPrize() {
        return prize;
    }

    public void setPrize(Double prize) {
        this.prize = prize;
    }
}
