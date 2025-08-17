public class ProjetoLivraria {
    public static void main(String args[]) {

        //Instanciando objeto, ou seja: Dizendo que o objeto Harry Potter é da classe livro.
        Livro hp1;
        hp1 = new Livro();
        hp1.titulo = "Harry Potter e a Pedra Filosofal";
        hp1.numeroPaginas = 208;
        hp1.anoPublicacao = 1997;
        hp1.preco = 64.90;

        //Instanciando o "Use a Cabeça! Java", bibliografia citada na aula 1 de POO.
        Livro java;
        java = new Livro();
        java.titulo = "Use a Cabeça! Java";
        java.numeroPaginas = 496;
        java.anoPublicacao = 2007;
        java.preco = 258.00;

        // Invocando o método cadastrar da classe Livro 
        // Cadastrando hp1 no banco de dados de livros.
        hp1.cadastrar();

        // Impressão dos atributos na tela, ou seja: Listando os livros.
        System.out.println("O livro " + hp1.titulo + " do ano de " + hp1.anoPublicacao + " tem " + hp1.numeroPaginas + " páginas " + "e está custando: R$" + hp1.preco);
        System.out.println("O livro " + java.titulo + " do ano de " + java.anoPublicacao + " tem " + java.numeroPaginas + " páginas " + "e está custando: R$" + java.preco);

        // Invocando método vender da classe Livro | Vendendo o livro hp1
        hp1.vender();



    }

    
}
