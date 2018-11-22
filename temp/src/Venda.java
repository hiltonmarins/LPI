public class Venda {
	private Produto produto;
	private int quantidade;
	
	public Venda(Produto p, int q) throws QuantidadeInvalidaException {
		this.produto = p;
		this.setQuantidade(q);
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void setQuantidade(int quantidade) throws QuantidadeInvalidaException  {
		if (quantidade < 0){
			throw new QuantidadeInvalidaException("Quantidade vendida inválida.");
		}
		this.quantidade = quantidade;
		
	}

	public Produto getProduto() {
		return produto;
	}

	public int getQuantidade() {
		return quantidade;
	}
}
