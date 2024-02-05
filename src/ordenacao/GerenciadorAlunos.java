package ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        this.alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        if (!this.alunoSet.isEmpty()) {
            for (Aluno a: this.alunoSet) {
                if(a.getMatricula() == matricula){
                    this.alunoSet.remove(a);
                }
            }
        } else {
            System.out.println("A lista está vazia.");
        }
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparePorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos ga = new GerenciadorAlunos();

        ga.adicionarAluno("Vitor", 1313L, 23);
        ga.adicionarAluno("Igor", 132L, 141);
        ga.adicionarAluno("Vitor2", 13L, 54);

        System.out.println(ga.exibirAlunosPorNome());
        ga.removerAluno(13);
        System.out.println(ga.exibirAlunosPorNota());
    }

}
