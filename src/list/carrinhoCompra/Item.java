package list.carrinhoCompra;

public class Item {

    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double valorItemTotal(){
        return this.quantidade * this.preco;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + '\n' +
                "Preço: " + preco + " R$ \n" +
                "Qtd: " + quantidade + '\n' +
                "Valor total: " + valorItemTotal() + " R$\n";
    }
}
