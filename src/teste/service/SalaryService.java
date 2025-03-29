package teste.service;


import teste.entity.Employee;

public class SalaryService {

    private TaxService taxeService;
    private PensionService pensionService;

    public SalaryService() {
        this(new TaxService(), new PensionService());
    }

    public SalaryService(TaxService taxeService, PensionService pensionService) {
        this.taxeService = taxeService;
        this.pensionService = pensionService;
    }

    public double netSalary(Employee employee) {
        return employee.getGrossSalary()
                - taxeService.tax(employee.getGrossSalary())
                - pensionService.discount(employee.getGrossSalary());
    }
}
