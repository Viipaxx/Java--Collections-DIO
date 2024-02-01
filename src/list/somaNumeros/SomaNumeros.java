package list.somaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> listaNumeros;

    public SomaNumeros(){
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.listaNumeros.add(numero);
    }

    public Integer calcularSoma(){
        Integer valorTotalSoma = 0;

        if(!this.listaNumeros.isEmpty()){
            for(Integer num: listaNumeros){
                valorTotalSoma += num;
            }
        }

        return valorTotalSoma;
    }

    public Integer encontrarMaiorNumero(){
        Integer maiorNumero = Integer.MIN_VALUE;

        if(!this.listaNumeros.isEmpty()){
            for(Integer num: listaNumeros){
                if(num > maiorNumero){
                    maiorNumero = num;
                }
            }
        }

        return maiorNumero;
    }

    public Integer encontrarMenorNumero(){
        Integer menorNumero = Integer.MAX_VALUE;

        if(!this.listaNumeros.isEmpty()){
            for(Integer num: listaNumeros){
                if(num < menorNumero){
                    menorNumero = num;
                }
            }
        }

        return menorNumero;
    }

    public List<Integer> exibirNumero(){
        return listaNumeros;
    }

}
