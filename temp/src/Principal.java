
public class Principal {
	public static void main(String[] args) {
		Produto p = new Produto("Café", 50, 7.5);
		try {
			Venda v = new Venda(p, -100);
			System.out.println("Venda efetuada com sucesso.");
		} catch (QuantidadeInvalidaException e) {
			e.printStackTrace();
		}
		System.out.println("fim.");
	}
	//alterado no git

}
