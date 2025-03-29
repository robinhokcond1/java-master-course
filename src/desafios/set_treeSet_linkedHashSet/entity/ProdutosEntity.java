package desafios.set_treeSet_linkedHashSet.entity;

import java.util.Objects;

public class ProdutosEntity implements Comparable<ProdutosEntity> {

    private String nome;
    private double preco;
    private int quantidade;
    private String marca;

    public ProdutosEntity(String nome, double preco, int quantidade, String marca) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", marca='" + marca + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProdutosEntity)) return false;
        ProdutosEntity that = (ProdutosEntity) o;
        return nome.equalsIgnoreCase(that.nome) &&
                marca.equalsIgnoreCase(that.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome.toLowerCase(), marca.toLowerCase());
    }

    @Override
    public int compareTo(ProdutosEntity other) {
        return this.nome.compareToIgnoreCase(other.nome);
    }
}
