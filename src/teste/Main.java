package teste;

import teste.entity.Employee;
import teste.service.SalaryService;

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

        Employee employee = new Employee(nome, salarioBase);
        SalaryService salario = new SalaryService();

        double salarioLiquido = salario.netSalary(employee);
        System.out.println("\nNome: " + employee.getName());
        System.out.printf("Salario Bruto: %.2f%n", salarioBase);
        System.out.printf("Salario Liquido: %.2f%n", salarioLiquido);
        System.out.println("(Impostos: 20%, Contribuição: 10%)");
        System.out.println("--------------------------------");
        scanner.close();

    }
}