package primeiro_dia;

public class Main {
    public static  void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jhong");
        pessoa.setSexo('M');
        pessoa.setDiaDoNascimento("segunda-feira");
        pessoa.setMesDoNascimento("Maio");
        pessoa.setAnoNascimento(1993);

        int idadeAtual = pessoa.calcularIdadeAtual();
        System.out.println("Sua idade atual é: " + idadeAtual);

        if (idadeAtual <= 18) {
            System.out.println(pessoa.getNome() + " " + " Você é menor de idade !\n");
            System.out.println("Seu sexo é: " + pessoa.getSexo());
        }else if (pessoa.getIdade() <= 50) {
            System.out.println(pessoa.getNome() + " " + "Você é maior de idade!\n");
            System.out.println("Seu sexo é: " + pessoa.getSexo());
        }else {
            System.out.println(pessoa.getNome() + " " + "Você é idoso!\n");
            System.out.println("Seu sexo é: " + pessoa.getSexo());
        }

        switch (pessoa.getDiaDoNascimento()) {
            case "segunda-feira":
                System.out.println("Dia da semana: Segunda-feira");
                break;
            case "terça-feira":
                System.out.println("Dia da semana: Terça-feira");
                break;
            case "quarta-feira":
                System.out.println("Dia da semana: Quarta-feira");
                break;
            case "quinta-feira":
                System.out.println("Dia da semana: Quinta-feira");
                break;
            case "sexta-feira":
                System.out.println("Dia da semana: Sexta-feira");
                break;
            case "sábado":
                System.out.println("Dia da semana: Sábado");
                break;
            case "domingo":
                System.out.println("Dia da semana: Domingo");
                break;
                default:
                    System.out.println("Dia da semana não encontrado!");
        }

        switch (pessoa.getMesDoNascimento()) {
            case "Janeiro":
                System.out.println("Mês do ano: Janeiro");
                break;
            case "Fevereiro":
                System.out.println("Mês do ano: Fevereiro");
                break;
            case "Março":
                System.out.println("Mês do ano: Março");
                break;
            case "Abril":
                System.out.println("Mês do ano: Abril");
                break;
            case "Maio":
                System.out.println("Mês do ano: Maio");
                break;
            case "Junho":
                System.out.println("Mês do ano: Junho");
                break;
            case "Julho":
                System.out.println("Mês do ano: Julho");
                break;
            case "Agosto":
                System.out.println("Mês do ano: Agosto");
                break;
            case "Setembro":
                System.out.println("Mês do ano: Setembro");
                break;
            case "Outubro":
                System.out.println("Mês do ano: Outubro");
                break;
            case "Novembro":
                System.out.println("Mês do ano: Novembro");
                break;
            case "Dezembro":
                System.out.println("Mês do ano: Dezembro");
                break;
                default:
                    System.out.println("Mês do ano não encontrado!");
        }
        System.out.println("Data de nascimento: " + pessoa.getDiaDoNascimento() + "/" + pessoa.getMesDoNascimento() + "/" + pessoa.getAnoNascimento());
        System.out.println("Data de hoje: " + pessoa.calcularDataAtual());

    }
}