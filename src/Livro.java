public class Livro {
    
    //Definido atributos da classe Livro
    String titulo;
    int numeroPaginas;
    int anoPublicacao;
    double preco;

    //Definindo os métodos/funções da classe Livro
    void cadastrar(){
        System.out.println("Cadastrando " + titulo + " no banco de dados...");
    }

    //double calcFrete(){
        //System.out.println("Calculando frete para o CEP " + CEP");
        //return valorFrete;
    //}

    void vender(){
        System.out.printf("Vendendo " + titulo + " por R$%.2f", preco);
    }

    void trocar(){
        System.out.println("Livro trocado!");
    }

}
