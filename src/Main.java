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

        // Exibindo o primeiro produto do carrinho (pode lançar exceção se a lista estiver vazia)
        try {
            Produto primeiroProduto = carrinho.getPrimeiroProduto();
            System.out.println("Primeiro produto no carrinho: " + primeiroProduto.getNome());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: O carrinho está vazio!");
        }

        // Removendo um produto e verificando o número de produtos no carrinho
        carrinho.removerProduto(produto2);
        System.out.println("Número de produtos no carrinho após remoção: " + carrinho.getNumeroDeProdutos());
    }
}
