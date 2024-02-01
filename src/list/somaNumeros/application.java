package list.somaNumeros;

public class application {
    public static void main(String[] args) {

        SomaNumeros sm = new SomaNumeros();


        sm.adicionarNumero(1);
        sm.adicionarNumero(431);
        sm.adicionarNumero(551);
        sm.adicionarNumero(231);
        sm.adicionarNumero(3421);
        sm.adicionarNumero(-21);
        sm.adicionarNumero(122);
        sm.adicionarNumero(13231);
        sm.adicionarNumero(111);
        sm.adicionarNumero(12);
        sm.adicionarNumero(321);


        System.out.println(sm.encontrarMenorNumero());
        System.out.println(sm.encontrarMaiorNumero());
        System.out.println(sm.calcularSoma());
        System.out.println(sm.exibirNumero());


    }
}
