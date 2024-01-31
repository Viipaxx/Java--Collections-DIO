package list.carrinhoCompra;

public class Shopping {
    public static void main(String[] args) {

        CarrinhoDeCompras cc = new CarrinhoDeCompras();

        cc.adicionarItem("Controle de televisão", 9.00, 2);
        cc.adicionarItem("Controle de televisão", 9.00, 2);
        cc.adicionarItem("Controle", 9.00, 2);

        System.out.println(cc.calcularValorTotal());

        cc.removerItem("Controle de televisão");

        System.out.println(cc.calcularValorTotal());

        cc.exibirItens();


    }

}
