package desafios.injestao_dependecia.service;

public class PensionService {
    private final double tax = 0.1;

    public double discount(double amount) {
        return amount * 0.1;
    }

    public double getTax() {
        return tax;
    }
}
