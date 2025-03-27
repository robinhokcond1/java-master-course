package segundo_dia.desafio_extra;

public class Produto {

    private String name;
    private double price;
    private int amount;

    public Produto() {
    }

    public Produto(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Produto {" +
                "nome='" + name + '\'' +
                ", preço=R$" + price +
                ", quantidade=" + amount +
                '}';
    }
}
