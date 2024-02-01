package list.catalogoLivros;

public class Biblioteca {

    public static void main(String[] args) {

        CatalogoLivros cl = new CatalogoLivros();

        cl.adicionarLivro("Harry Potter e a Pedra Filosofal", "J. K. Rowlling", 1992);
        cl.adicionarLivro("Harry Potter e as Reliquias da Morte pt. 2", "J. K. Rowlling", 1994);
        cl.adicionarLivro("Harry Potter e as Reliquias da Morte pt. 2", "J. K. Rowlling", 1995);
        cl.adicionarLivro("Harry Potter e a Ordem da Fenix", "J. K. Rowlling", 1996);
        cl.adicionarLivro("Harry Potter e o Prisioneiro de Askaban", "J. K. Rowlling", 1991);

        System.out.println("### Livro por Titulo ###");
        System.out.println(cl.pesquisarPorTitulo("Harry Potter e as Reliquias da Morte pt. 2"));

        System.out.println("### Livros por Autor ###");
        System.out.println(cl.pesquisarPorAutor("J. K. Rowlling"));

        System.out.println("### Livro por Intervalo de Ano ###");
        System.out.println(cl.pesquisarPorIntervaloAnos(1990, 1994));


    }


}
