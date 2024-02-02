package list.ordenacaoPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    List<Pessoa> pessoasList;

    public OrdenacaoPessoas(){
        this.pessoasList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        this.pessoasList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("1", 31, 1.65);
        ordenacaoPessoas.adicionarPessoa("2", 45, 1.70);
        ordenacaoPessoas.adicionarPessoa("3", 10, 1.34);
        ordenacaoPessoas.adicionarPessoa("4", 12, 1.31);
        ordenacaoPessoas.adicionarPessoa("5", 11, 1.55);
        ordenacaoPessoas.adicionarPessoa("6", 21, 1.92);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());


    }

}

