import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtos;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.calcularValorTotal();
        }
        return total;
    }

    // Defeito intencional: não está verificando se a lista está vazia antes de retornar o primeiro produto
    public Produto getPrimeiroProduto() {
        return produtos.get(0);
    }

    public int getNumeroDeProdutos() {
        return produtos.size();
    }
}
