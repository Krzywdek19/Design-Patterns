package creationalPatterns.builder;

public class ComputerShop {
    public static void main(String[] args) {
        CPU cpu = new CPUBuilder()
                .setBrand("INTEL")
                .setPrize(200.30)
                .build();
    }
}
