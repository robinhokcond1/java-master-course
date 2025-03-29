package desafios.injestao_dependecia;

import desafios.injestao_dependecia.entity.EmployeeEntity;
import desafios.injestao_dependecia.service.BrazilTaxService;
import desafios.injestao_dependecia.service.PensionService;
import desafios.injestao_dependecia.service.SalaryService;
import desafios.injestao_dependecia.service.TaxService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nBem vindo ao programa calculo de salário");
        System.out.println("--------------------------------");

        System.out.print("Informe o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe o seu salário base: ");
        double salarioBase = scanner.nextDouble();

        if (salarioBase < 0) {
            System.out.println("Salário não pode ser negativo.");
            return;
        }

        EmployeeEntity employee = new EmployeeEntity(nome, salarioBase);
        TaxService impostos = new BrazilTaxService();
        PensionService contribuicaoPensao = new PensionService();
        SalaryService salario = new SalaryService(impostos, contribuicaoPensao);

        double salarioLiquido = salario.netSalary(employee);
        System.out.println("\nNome: " + employee.getName());
        System.out.printf("Salario Bruto: %.2f%n", salarioBase);
        System.out.printf("Salario Liquido: %.2f%n", salarioLiquido);
        System.out.println("(Impostos: " + impostos.getTax() + "," + " Contribuição: " + contribuicaoPensao.getTax()+")");
        System.out.println("---------------------------------");
        scanner.close();

    }
}