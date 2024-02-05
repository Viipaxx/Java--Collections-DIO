package ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco, int quantidade){
        this.produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cp = new CadastroProdutos();

        cp.adicionarProduto("Produto 1", 1L, 15d, 5);
        cp.adicionarProduto("Produto 2", 2L, 25d, 5);
        cp.adicionarProduto("Produto 3", 1L, 3d, 5);
        cp.adicionarProduto("Produto 4", 4L, 5d, 5);

        System.out.println(cp.exibirProdutosPorNome());
        System.out.println(cp.exibirProdutosPorPreco());
    }

}
