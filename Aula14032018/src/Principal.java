
public class Principal {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Jos�", 10, 8);
		System.out.println(a1.nome + " possui m�dia "+ a1.calculaMedia());

		Aluno a2 = new Aluno("Angela");
		System.out.println(a2.nome);
		
		Aluno a3 = new Aluno();
	}

}
