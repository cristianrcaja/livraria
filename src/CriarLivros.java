import com.sun.security.jgss.GSSUtil;

public class CriarLivros {
    public static void main(String[] args) {
        Editora editora = new Editora();
        editora.nome = "Harper Collins";
                editora.represenante = "Jõao";
        Livro favorito = new Livro("O Hobbit" );
        //favorito.titulo = "O Hobbit" ;
        favorito.autor = "J. R. R. Talkien";
        favorito.valor  = 37.27;
        favorito.editora = editora;
        favorito.resumo = "Bilbo era um dos ...";
        favorito.tipoCapa = "COMUM";

        System.out.println("Meu livro favorito é: " + favorito.titulo + "\nSeu autor é: "  +
                        favorito.autor + " preço: R$ " +favorito.valor);

        System.out.println("Meu livro favorito é" + favorito.titulo + " O Hobbit " ) ;



        Livro meuLivro = new Livro("UML 2.0");
        //meuLivro.titulo = "UML 2.0";
        meuLivro.valor = 58.98;
        meuLivro.editora = editora;
        //System.out.println("\n\nTitulo: " + meuLivro.titulo);
        //System.out.println("Autor: " + meuLivro.autor);
        System.out.println(meuLivro.exibirDados());



    }


}
