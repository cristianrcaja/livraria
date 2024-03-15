public class Livro {
    //+ (public) TipoDado nomeAtributoOuVariavel
    public String titulo;
    public String autor;
    public double valor;
    public Editora editora;
    public int paginas;
    public String resumo;
    public String tipoCapa;

    // --- MÉTODOS --- //
    public String exibirDados (){
        String dados =
                "--------" +
                        "\nTitulo: " + this.titulo +
                        "\nResumo: " + this.resumo +
                        "\nPreço? R$" + this.valor +
                        "\nPáginas: " + this.paginas +
                        "\nAutor: " + this.autor +
                        "\nEditora: " + this.editora.nome +
                        "\n---------" ;
        return dados;
    }
    public Livro(String titulo){
        this.titulo = titulo;
    }

}
