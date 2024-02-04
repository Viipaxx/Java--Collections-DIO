package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        this.convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c: this.convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        this.convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return this.convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(this.convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados cj = new ConjuntoConvidados();


        System.out.println("Existem " + cj.contarConvidados() + " dentro do Set de Convidados");

        cj.adicionarConvidado("Vitor", 1602);
        cj.adicionarConvidado("Igor", 1602);
        cj.adicionarConvidado("Igor", 1209);
        cj.adicionarConvidado("Anna", 2304);
        cj.adicionarConvidado("Iara", 2602);
        cj.adicionarConvidado("Mariane", 907);

        System.out.println("Existem " + cj.contarConvidados() + " dentro do Set de Convidados");
        cj.removerConvidadoPorCodigoConvite(907);
        System.out.println("Existem " + cj.contarConvidados() + " dentro do Set de Convidados");
        cj.exibirConvidados();
    }

}
