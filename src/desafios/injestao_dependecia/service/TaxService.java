package desafios.injestao_dependecia.service;

public class TaxService {
    private final double tax = 0.2;

    public double tax(double amount) {
        return amount * tax;
    }

    public double getTax() {
        return tax;
    }
}
