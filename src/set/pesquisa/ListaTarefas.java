package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaTarefas;

    public ListaTarefas(){
        this.listaTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        this.listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if(!this.listaTarefas.isEmpty()){
            for(Tarefa t: this.listaTarefas){
                if(t.getDescricao().equalsIgnoreCase(descricao))         {
                    tarefaParaRemover = t;
                    break;
                }
            }
            this.listaTarefas.remove(tarefaParaRemover);
        }
    }

    public void exibirTarefas(){
        System.out.println(this.listaTarefas);
    }

    public int contarTarefas(){
        return this.listaTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if(!this.listaTarefas.isEmpty()){
            for(Tarefa t: this.listaTarefas){
                if (t.isFinalizada()) {
                    tarefasConcluidas.add(t);
                }
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if(!this.listaTarefas.isEmpty()){
            for(Tarefa t: this.listaTarefas){
                if (!t.isFinalizada()) {
                    tarefasPendentes.add(t);
                }
            }
        }
        return tarefasPendentes;
    }

    public Tarefa marcarTarefaConcluida(String descricao){
        Tarefa tarefaConcluida = null;

        if (!this.listaTarefas.isEmpty()) {
            for(Tarefa t: this.listaTarefas){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setFinalizada(true);
                    tarefaConcluida = t;
                    break;
                }
            }
        }

        return tarefaConcluida;
    }

    public Tarefa marcarTarefaPendente(String descricao){
        Tarefa tarefaPendente = null;

        if (!this.listaTarefas.isEmpty()) {
            for(Tarefa t: this.listaTarefas){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setFinalizada(false);
                    tarefaPendente = t;
                    break;
                }
            }
        }

        return tarefaPendente;
    }

    public void limparListaTarefas(){
        this.listaTarefas.clear();
    }

    public static void main(String[] args) {
        ListaTarefas lt = new ListaTarefas();

        lt.adicionarTarefa("Varrer a Casa");
        lt.adicionarTarefa("Lavar os Pratos");
        lt.adicionarTarefa("Forrar a Cama");
        lt.adicionarTarefa("Tirar o Lixo");

        lt.exibirTarefas();

        lt.marcarTarefaConcluida("Varrer a Casa");
        lt.marcarTarefaConcluida("Forrar a Cama");

        lt.exibirTarefas();

        lt.marcarTarefaPendente("Forrar a Cama");

        lt.exibirTarefas();

        System.out.println(lt.obterTarefasConcluidas());
        System.out.println(lt.obterTarefasPendentes());

        System.out.println(lt.contarTarefas());

        lt.limparListaTarefas();
        lt.exibirTarefas();

    }

}
