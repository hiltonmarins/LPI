
public class Produto {
	private static int numeroSequencial=0;
	private int codigo;
	private String descricao;
	private int quantidadeEmEstoque;
	private double preco;

	public Produto(String descricao, int quantidadeEmEstoque, double preco) {
		super();
		Produto.numeroSequencial++;
		this.codigo=Produto.numeroSequencial;
		this.descricao = descricao;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}

	public double getPreco() {
		return preco;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
