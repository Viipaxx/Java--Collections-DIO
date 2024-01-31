package list.carrinhoCompra;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> carrinho;

    public CarrinhoDeCompras(){
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        this.carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();
        for(Item i: carrinho){
            if(i.getNome().equalsIgnoreCase(nome)){
             itemsParaRemover.add(i);
            }
        }
        this.carrinho.removeAll(itemsParaRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        for(Item i: carrinho){
            valorTotal += i.valorItemTotal();
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(carrinho);
    }

}
