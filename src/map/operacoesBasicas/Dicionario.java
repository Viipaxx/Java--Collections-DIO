package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        this.dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!this.dicionarioMap.isEmpty()) {
            this.dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras() {
        System.out.println(this.dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String pesquisarPorPalavra = null;
        if (!this.dicionarioMap.isEmpty()) {
            pesquisarPorPalavra = this.dicionarioMap.get(palavra);
        }
        return pesquisarPorPalavra;
    }

    public static void main(String[] args) {
        Dicionario dc = new Dicionario();

        dc.adicionarPalavra("Comer", "ingerir (alimento sólido).");
        dc.adicionarPalavra("Nadar", "mover-se na água ou sustentar-se sobre ela usando recursos do próprio corpo (braços e pernas, nadadeiras, cauda etc.).");
        dc.adicionarPalavra("Andar", "dar passos, caminhar.");
        dc.adicionarPalavra("escolher", "manifestar preferência por (alguém ou algo).");
        dc.exibirPalavras();
        dc.removerPalavra("escolher");
        dc.exibirPalavras();
        System.out.println(dc.pesquisarPorPalavra("Andar"));
    }

}
