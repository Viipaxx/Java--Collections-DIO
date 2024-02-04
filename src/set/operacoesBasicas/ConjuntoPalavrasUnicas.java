package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavraUnica;

    public ConjuntoPalavrasUnicas() {
        this.palavraUnica = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        this.palavraUnica.add(palavra);
    }

    public void removerPalavra(String palavra){
        if(!palavraUnica.isEmpty()){
            if(palavraUnica.contains(palavra)){
                this.palavraUnica.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto!");
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra){
        return this.palavraUnica.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(this.palavraUnica);
    }


    public static void main(String[] args) {
        ConjuntoPalavrasUnicas cjp = new ConjuntoPalavrasUnicas();


        cjp.adicionarPalavra("oi");
        cjp.adicionarPalavra("oii");
        cjp.adicionarPalavra("oiii");
        cjp.adicionarPalavra("oii");
        cjp.adicionarPalavra("oii");
        cjp.adicionarPalavra("oiii");

        System.out.println(cjp.verificarPalavra("oi"));

        cjp.exibirPalavrasUnicas();

    }

}
