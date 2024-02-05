package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        this.contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(this.contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c: contatoSet) {
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }

        }
        return contatosPorNome;

    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos ac = new AgendaContatos();

        ac.adicionarContato("Vitor", 10142);
        ac.adicionarContato("Vitor", 10132);
        ac.adicionarContato("Vitor Paz", 10212);
        ac.adicionarContato("Vitor Gabriel", 17012);
        ac.adicionarContato("Vitor Santana", 10512);

        ac.exibirContatos();

        ac.atualizarNumeroContato("Vitor", 1999);

        ac.exibirContatos();
    }


}
