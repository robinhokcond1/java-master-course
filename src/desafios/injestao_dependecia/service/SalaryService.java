package desafios.injestao_dependecia.service;


import desafios.injestao_dependecia.entity.EmployeeEntity;

public class SalaryService {

    private TaxService taxeService;
    private PensionService pensionService;

    public SalaryService(TaxService taxeService, PensionService pensionService) {
        this.taxeService = taxeService;
        this.pensionService = pensionService;
    }

    public double netSalary(EmployeeEntity employee) {
        return employee.getGrossSalary()
                - taxeService.tax(employee.getGrossSalary())
                - pensionService.discount(employee.getGrossSalary());
    }
}
