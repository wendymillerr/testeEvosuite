public class Main {
    public static void main(String[] args) {
        // Criando alguns produtos
        Produto produto1 = new Produto("Teclado", 150.0, 2);
        Produto produto2 = new Produto("Mouse", 80.0, 1);
        Produto produto3 = new Produto("Monitor", 800.0, 1);

        // Criando um carrinho de compras
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Adicionando produtos ao carrinho
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);

        // Calculando o total do carrinho
        double total = carrinho.calcularTotal();
        System.out.println("Total do carrinho: " + total);

        // Aplicando desconto em um produto
        produto1.aplicarDesconto(10);
        System.out.println("Novo preço do produto 1 (Teclado) com desconto: " + produto1.getPreco());

        // Removendo todos os produtos para deixar o carrinho vazio
        carrinho.removerProduto(produto1);
        carrinho.removerProduto(produto2);
        carrinho.removerProduto(produto3);

        // Exibindo o primeiro produto do carrinho sem o bloco try-catch
        Produto primeiroProduto = carrinho.getPrimeiroProduto();  // Isso vai causar uma exceção se o carrinho estiver vazio
        System.out.println("Primeiro produto no carrinho: " + primeiroProduto.getNome());
    }
}
