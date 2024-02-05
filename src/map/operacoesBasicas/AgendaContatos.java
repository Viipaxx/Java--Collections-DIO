package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        this.agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!this.agendaContatoMap.isEmpty()){
            this.agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(this.agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!this.agendaContatoMap.isEmpty()) {
            numeroPorNome = this.agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos ac = new AgendaContatos();

        ac.adicionarContato("Vitor", 997806196);
        ac.adicionarContato("Igor", 997806196);
        ac.adicionarContato("Iara", 997806196);
        ac.adicionarContato("Mariane", 997806196);
        System.out.println(ac.pesquisarPorNome("Vitor"));
        ac.removerContato("Iara");
        ac.exibirContatos();
    }

}
