package desafios.injestao_dependecia.service;

public class BrazilTaxService extends TaxService{
    private final  double tax = 0.30;
  @Override
    public double tax(double amount) {
        return amount * 0.30;
    }

    public double getTax() {
        return tax;
    }
}
