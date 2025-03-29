package desafios.linkedList.entity;

public class PessoaEntity {
    private String nome;
    private int idade;

    public PessoaEntity(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return nome + " (idade: " + idade + ")";
    }
}

