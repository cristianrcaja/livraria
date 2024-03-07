public class CriarLivros {
    public static void main(String[] args) {
        Livro favorito = new Livro();
        favorito.titulo = "O Hobbit" ;
        favorito.autor = "J. R. R. Talkien";
        favorito.valor  = 37.27;
        favorito.editora = "Harper Collins";
        favorito.resumo = "Bilbo era um dos ...";
        favorito.tipoCapa = "COMUM";

        System.out.println("Meu livro favorito é" + favorito.titulo + " O Hobbit " ) ;



        Livro meuLivro = new Livro();
        meuLivro.titulo = "UML 2.0";
        meuLivro.valor = 58.98;
    }


}
