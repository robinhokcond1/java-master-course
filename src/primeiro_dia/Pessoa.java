package primeiro_dia;

import java.util.Calendar;

public class Pessoa {

    private String nome;
    private int idade;
    private char sexo;
    private String diaDoNascimento;
    private String mesDoNascimento;
    private int anoNascimento;

    public Pessoa() {

    }

    public Pessoa(String nome,
                  int idade, char sexo,
                  String diaDoNascimento,
                  String mesDoNascimento,
                  int anoNascimento) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.diaDoNascimento = diaDoNascimento;
        this.mesDoNascimento = mesDoNascimento;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDiaDoNascimento() {
        return diaDoNascimento;
    }

    public void setDiaDoNascimento(String diaDoNascimento) {
        this.diaDoNascimento = diaDoNascimento;
    }

    public String getMesDoNascimento() {
        return mesDoNascimento;
    }

    public void setMesDoNascimento(String mesDoNascimento) {
        this.mesDoNascimento = mesDoNascimento;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public int calcularIdadeAtual() {
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);

        return anoAtual - anoNascimento;
    }

    public String calcularDataAtual() {
        Calendar cal = Calendar.getInstance();
        int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
        int mesAtual = cal.get(Calendar.MONTH) + 1;
        int anoAtual = cal.get(Calendar.YEAR);

        return diaAtual + "/" + mesAtual + "/" + anoAtual;
    }
}


