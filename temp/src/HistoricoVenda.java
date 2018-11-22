import java.util.ArrayList;
import java.util.List;

public abstract class HistoricoVenda {
	private static List<Venda> historico = new ArrayList<Venda>();
	
	public static void registraVenda(Venda v){
		historico.add(v);
	}
	
	public static void listaVendas(){
		System.out.println("********************");
		System.out.println("Listagem das Vendas");
		System.out.println("********************");
		
		double total = 0;
		for ( Venda item : historico){
			System.out.println("C�digo do Produto: "+item.getProduto().getCodigo());
			System.out.println("Descri��o: "+item.getProduto().getDescricao());
			System.out.println("Pre�o: "+item.getProduto().getPreco());
			System.out.println("Quantidade Vendida: "+item.getQuantidade());
			System.out.println("Valor da Venda: "+item.getProduto().getPreco() * item.getQuantidade());
			System.out.println();
			
			total+=item.getProduto().getPreco() * item.getQuantidade();
		}
		System.out.println("************************************");
		System.out.println("Valor total das vendas: "+total);
		System.out.println("************************************");	
	}
}
